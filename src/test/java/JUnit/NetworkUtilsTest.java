package JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class NetworkUtilsTest {
    @Test
    public void getConnectionShouldReturnFasterThanOneSecond(){
        Assertions.assertTimeout(Duration.ofSeconds(2), () -> NetworkUtils.getConnection());
    }
}
