import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class FirstTest {

    @Test
    void assertTrueTest() {
        assertTrue(3 > 1);

    }

    @Test
    void assertFalseTest() {
        assertTrue(2 > 3);
    }

    @Test
    void assertFailTest() {
        fail();
    }

    @Test
    void assertFailaTest() {
        fail("another fail!");
    }

}
