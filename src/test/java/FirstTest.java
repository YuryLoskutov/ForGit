import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstTest {

    @Test
    void assertTrueTest() {
        assertTrue(3 > 2);
    }

    @Test
    void assertFalseTest() {
        assertTrue(2 > 3);
    }
}
