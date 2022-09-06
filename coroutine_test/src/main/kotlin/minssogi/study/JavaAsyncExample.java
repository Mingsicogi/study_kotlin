package minssogi.study;

import java.util.concurrent.CompletableFuture;

public class JavaAsyncExample {

    public static void main(String[] args) throws Exception {

//        CompletableFuture<String> gameInfoFuture = CompletableFuture.completedFuture(MainKt.get("http://127.0.0.1:8080/api/sample/game/getGameInfo"));
//        CompletableFuture<String> characterInfoFuture = CompletableFuture.completedFuture(MainKt.get("http://127.0.0.1:8080/api/sample/game/getCharacterInfo"));
//        CompletableFuture<String> paymentInfoFuture = CompletableFuture.completedFuture(MainKt.get("http://127.0.0.1:8080/api/sample/game/getPaymentInfo"));
//
        StringBuilder result = new StringBuilder();
        long start = System.currentTimeMillis();
//        gameInfoFuture.whenComplete((gameInfo, e1) -> {
//            if (e1 == null) {
//                result.append(gameInfo);
//                result.append("\n");
//                characterInfoFuture.whenComplete((characterInfo, e2) -> {
//                    if (e2 == null) {
//                        result.append(characterInfo);
//                        result.append("\n");
//                        paymentInfoFuture.whenComplete((paymentInfo, e3) -> {
//                            if (e3 == null) {
//                                result.append(paymentInfo);
//                            } else {
//                                e3.printStackTrace();
//                            }
//                        });
//                    } else {
//                        e2.printStackTrace();
//                    }
//                });
//            } else {
//                e1.printStackTrace();
//            }
//        });

        CompletableFuture<String> gameInfoFuture = CompletableFuture.supplyAsync(() -> MainKt.get("http://127.0.0.1:8080/api/sample/game/getGameInfo"));
        CompletableFuture<String> characterInfoFuture = CompletableFuture.supplyAsync(() -> MainKt.get("http://127.0.0.1:8080/api/sample/game/getCharacterInfo"));
        CompletableFuture<String> paymentInfoFuture = CompletableFuture.supplyAsync(() -> MainKt.get("http://127.0.0.1:8080/api/sample/game/getPaymentInfo"));

        result.append(gameInfoFuture.thenComposeAsync(gameInfo -> {
            result.append(gameInfo);
            result.append("\n");
            return characterInfoFuture;
        }).thenComposeAsync(characterInfo -> {
            result.append(characterInfo);
            result.append("\n");
            return paymentInfoFuture;
        }).get());

        System.out.println(result.toString());
        System.out.println();
        System.out.println(("It tooks " + (System.currentTimeMillis() - start) / 1000.0));
    }
}
