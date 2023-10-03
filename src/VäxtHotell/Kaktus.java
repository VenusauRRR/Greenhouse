package VäxtHotell;

public class Kaktus extends Växt {
    private final VätskaTyp vät_Typ = VätskaTyp.MINERALVATTEN;

    public Kaktus(String namn, double ländg){
        super(namn,ländg);
        super.vätskaTyp = vät_Typ.vätskaNamn;
        super.vätskaVolym = räknaVätska();
    }

    @Override
    public double räknaVätska() {
        return vät_Typ.volym;
    }
}
