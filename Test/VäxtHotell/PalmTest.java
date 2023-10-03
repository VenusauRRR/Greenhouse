package VäxtHotell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    @Test
    void räknaVätska() {
        Palm palm = new Palm("Palm Tree", 3.3);

        double expected = 1.65;
        double actual = palm.räknaVätska();
        Assertions.assertEquals(expected,actual);
    }
}