package VäxtHotell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {

    @Test
    void räknaVätska() {
        Kaktus kaktus = new Kaktus("Kaktus", 7.5);

        double expected = 0.02;
        double actual = kaktus.räknaVätska();
        Assertions.assertEquals(expected,actual);

    }
}