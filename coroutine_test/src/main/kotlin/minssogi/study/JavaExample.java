package minssogi.study;

public class JavaExample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        System.out.println(getGameInfo());
        System.out.println(getCharacterInfo());
        System.out.println(getPaymentInfoFuture());

        System.out.println((System.currentTimeMillis() - start) / 1000.0);
    }

    public static String getGameInfo() {
        return KotlinCoroutineKt.get("http://127.0.0.1:8080/api/sample/game/getGameInfo");
    }

    public static String getCharacterInfo() {
        return KotlinCoroutineKt.get("http://127.0.0.1:8080/api/sample/game/getCharacterInfo");
    }

    public static String getPaymentInfoFuture() {
        return KotlinCoroutineKt.get("http://127.0.0.1:8080/api/sample/game/getPaymentInfo");
    }
}
