import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEmail {
    static Exercises ex;

    @BeforeAll
    static void setUp() {
        ex = new Exercises();
    }

    @Test
    void testEmail0() {
        assertTrue(ex.validateEmail("john.doe@example.com"));
    }

    @Test
    void testEmail1() {
        assertFalse(ex.validateEmail("hello world@example.com"));
    }

    @Test
    void testEmail2() {
            assertTrue(ex.validateEmail("alice_bob123@research-lab.co.uk"));
    }

    @Test
    void testEmail3() {
        assertFalse(ex.validateEmail("user@ex_ample.com"));
    }

    @Test
    void testEmail4() {
        assertFalse(ex.validateEmail("user.@-example.com"));
    }
}
