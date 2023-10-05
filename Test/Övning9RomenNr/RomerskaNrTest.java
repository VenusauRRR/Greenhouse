package Övning9RomenNr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomerskaNrTest {

    @Test
    void values() {
        int expectedValue_X = 10;
        int actualValue_X = RomerskaNr.X.nr;

        Assertions.assertEquals(expectedValue_X, actualValue_X);
    }
}