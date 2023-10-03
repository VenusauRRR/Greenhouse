package VäxtHotell;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Köttätande extends Växt {
    private final VätskaTyp vätskaTyp = VätskaTyp.PROTEINDRYCK;

    public Köttätande(String namn, double ländg){
        super(namn,ländg);
        super.vätska = vätskaTyp.vätskaNamn;
        super.vätskaVolym = räknaVätska();
    }

    @Override
    public double räknaVätska() {
        DecimalFormat df = new DecimalFormat("#.##");
        String st = df.format(0.1+vätskaTyp.volym*this.längd);
        return Double.parseDouble(st.replace(",","."));
    }
}
