import org.junit.jupiter.api.Test;
import tdd.Kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void squareTest() {
        Kata kata = new Kata();
        int result = kata.squareof(5);
        assertEquals(25, result);
    }

    @Test
    public void addTest() {
        Kata kata = new Kata();
        int result = kata.add(12, 2);
        assertEquals(14, result);
    }

    @Test
    public void maxTest() {
        Kata kata = new Kata();
        int result = kata.max(34, 66);
        assertEquals(66, result);
    }

    @Test
    public void maxTest2() {
        Kata kata = new Kata();
        int result = kata.max(77, 2);
        assertEquals(77, result);
    }
}
