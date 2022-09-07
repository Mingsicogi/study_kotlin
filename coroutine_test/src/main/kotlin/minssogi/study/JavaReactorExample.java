package minssogi.study;

import reactor.core.publisher.Mono;

public class JavaReactorExample {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        long start = System.currentTimeMillis();

//        getGameInfo()
//            .zipWith(getCharacterInfo())
//            .zipWith(getPaymentInfo())
//            .subscribe(e -> {
//                String gameInfo = e.getT1().getT1();
//                result.append(gameInfo);
//                result.append("\n");
//                String characterInfo = e.getT1().getT2();
//                result.append(characterInfo);
//                result.append("\n");
//                String paymentInfo = e.getT2();
//                result.append(paymentInfo);
//            });

        getGameInfo().subscribe(gameInfo -> {
            result.append(gameInfo);
            result.append("\n");
            getCharacterInfo().subscribe(characterInfo -> {
                result.append(characterInfo);
                result.append("\n");
                getPaymentInfo().subscribe(paymentInfo -> {
                    result.append(paymentInfo);
                });
            });
        });

        System.out.println(result.toString());
        System.out.println(("It tooks " + (System.currentTimeMillis() - start) / 1000.0));
    }

    public static Mono<String> getGameInfo() {
        return Mono.just(KotlinCoroutineKt.get("http://127.0.0.1:8080/api/sample/game/getGameInfo"));
    }

    public static Mono<String> getCharacterInfo() {
        return Mono.just(KotlinCoroutineKt.get("http://127.0.0.1:8080/api/sample/game/getCharacterInfo"));
    }

    public static Mono<String> getPaymentInfo() {
        return Mono.just(KotlinCoroutineKt.get("http://127.0.0.1:8080/api/sample/game/getPaymentInfo"));
    }
}
