package JUnit;

public class NetworkUtils {
    public static void getConnection(){
        // connection with server
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return;
    }
}
