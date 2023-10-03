package VäxtHotell;

public class Kaktus extends Växt {
    private final VätskaTyp vätskaTyp = VätskaTyp.MINERALVATTEN;

    public Kaktus(String namn, double ländg){
        super(namn,ländg);
        super.vätska = vätskaTyp.vätskaNamn;
        super.vätskaVolym = räknaVätska();
    }

    @Override
    public double räknaVätska() {
        return vätskaTyp.volym;
    }
}
