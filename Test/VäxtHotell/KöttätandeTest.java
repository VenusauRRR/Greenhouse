package VäxtHotell;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeTest {

    @Test
    void räknaVätska() {
        Köttätande köttVäxt = new Köttätande("Köttättande",3.2);

        double expected = 0.74;
        double actual = köttVäxt.räknaVätska();
        Assertions.assertEquals(expected,actual);
    }
}