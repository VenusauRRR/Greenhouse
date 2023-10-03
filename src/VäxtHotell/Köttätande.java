package VäxtHotell;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Köttätande extends Växt {
    private final VätskaTyp vät_Typ = VätskaTyp.PROTEINDRYCK;

    public Köttätande(String namn, double ländg){
        super(namn,ländg);
        super.vätskaTyp = vät_Typ.vätskaNamn;
        super.vätskaVolym = räknaVätska();
    }

    @Override
    public double räknaVätska() {
        DecimalFormat df = new DecimalFormat("#.##");
        String st = df.format(0.1+vät_Typ.volym*this.längd);
        return Double.parseDouble(st.replace(",","."));
    }
}
