import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SimpleLogicTest {

    SimpleLogic simpleLogic = new SimpleLogic();

    @Test
    void whenAgeIs17ThenIsNotAdult() {
        assertFalse(simpleLogic.isAdult(17));
    }

    @Test
    void whenAgeIs18ThenIsAdult() {
        assertTrue(simpleLogic.isAdult(18));
    }

    @Test
    void whenAgeIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            assertTrue(simpleLogic.isAdult(null));
        });
    }

}