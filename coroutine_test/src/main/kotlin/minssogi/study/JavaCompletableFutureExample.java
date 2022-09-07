package minssogi.study;

import java.util.concurrent.CompletableFuture;

public class JavaCompletableFutureExample {

    public static void main(String[] args) throws Exception {

        StringBuilder result = new StringBuilder();
        long start = System.currentTimeMillis();

        result.append(getGameInfo().thenComposeAsync(gameInfo -> {
            result.append(gameInfo);
            result.append("\n");
            return getCharacterInfo();
        }).thenComposeAsync(characterInfo -> {
            result.append(characterInfo);
            result.append("\n");
            return getPaymentInfoFuture();
        }).get());

        System.out.println(result.toString());
        System.out.println(("It tooks " + (System.currentTimeMillis() - start) / 1000.0));
    }

    public static CompletableFuture<String> getGameInfo() {
        return CompletableFuture.supplyAsync(() -> MainKt.get("http://127.0.0.1:8080/api/sample/game/getGameInfo"));
    }

    public static CompletableFuture<String> getCharacterInfo() {
        return CompletableFuture.supplyAsync(() -> MainKt.get("http://127.0.0.1:8080/api/sample/game/getCharacterInfo"));
    }

    public static CompletableFuture<String> getPaymentInfoFuture() {
        return CompletableFuture.supplyAsync(() -> MainKt.get("http://127.0.0.1:8080/api/sample/game/getPaymentInfo"));
    }
}
