package minssogi.study;

import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;

public class JavaCompletableFutureExample {

    public static void main(String[] args) throws Exception {

        StringBuilder result = new StringBuilder();

        // warm up - connection establish
        CompletableFuture<String> future = getAllGameInfo(result);
        System.out.println(future.get());

        long start = System.currentTimeMillis();
        future = getAllGameInfo(result);

        System.out.println(future.get());
        System.out.println(("It tooks " + (System.currentTimeMillis() - start) / 1000.0));
    }

    private static CompletableFuture<String> getAllGameInfo(StringBuilder result) {
        return getGameInfo().thenCombine(getCharacterInfo().thenCombine(getPaymentInfoFuture(), (characterInfo, paymentInfo) -> {
                System.out.println("START getCharacterInfo, paymentInfo [" + LocalDateTime.now() + "] " + Thread.currentThread().getName());
                String a = result.append(characterInfo).append("\n").append(paymentInfo).append("\n").toString();
                System.out.println("END getCharacterInfo, paymentInfo [" + LocalDateTime.now() + "] " + Thread.currentThread().getName());
                return a;
            }),

            (gameInfo, character) -> {
                System.out.println("START getGameInfo [" + LocalDateTime.now() + "]" + Thread.currentThread().getName());
                String b = result.append(gameInfo).append("\n").toString();
                System.out.println("END getGameInfo [" + LocalDateTime.now() + "]" + Thread.currentThread().getName());
                return b;
            });
    }

    public static CompletableFuture<String> getGameInfo() {
        return CompletableFuture.supplyAsync(() -> KotlinCoroutineKt.get("http://127.0.0.1:8080/api/sample/game/getGameInfo"));
    }

    public static CompletableFuture<String> getCharacterInfo() {
        return CompletableFuture.supplyAsync(() -> KotlinCoroutineKt.get("http://127.0.0.1:8080/api/sample/game/getCharacterInfo"));
    }

    public static CompletableFuture<String> getPaymentInfoFuture() {
        return CompletableFuture.supplyAsync(() -> KotlinCoroutineKt.get("http://127.0.0.1:8080/api/sample/game/getPaymentInfo"));
    }
}
