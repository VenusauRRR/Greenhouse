package VäxtHotell;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Köttätande extends Växt {
    protected final Vätska vät_Typ = Vätska.PROTEINDRYCK;

    public Köttätande(String namn, double längd){
        super(namn,längd);
        super.vätskaTyp = vät_Typ.vätskaNamn;
//        super.vätskaVolym = räknaVätska();
    }

    @Override
    public double räknaVätska() {
        DecimalFormat df = new DecimalFormat("#.##");
        String st = df.format(0.1+vät_Typ.volym*this.längd);
        return Double.parseDouble(st.replace(",","."));
    }
}
