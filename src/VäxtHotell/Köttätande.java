package VäxtHotell;

public class Köttätande extends Växt implements Vätska{
    private final VätskaTyp vätskaTyp = VätskaTyp.PROTEINDRYCK;

    public Köttätande(String namn, double ländg){
        super(namn,ländg);
        super.vätska = vätskaTyp.vätskaNamn;
        super.vätskaVolym = räknaVätska();
    }

    @Override
    public double räknaVätska() {
        return 0.1+vätskaTyp.volym*this.längd;
    }
}
