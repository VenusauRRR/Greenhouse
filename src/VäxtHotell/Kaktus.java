package VäxtHotell;

public class Kaktus extends Växt {
    protected final VätskaTyp vät_Typ = VätskaTyp.MINERALVATTEN;

    public Kaktus(String namn, double längd){
        super(namn,längd);
        super.vätskaTyp = vät_Typ.vätskaNamn;
        super.vätskaVolym = räknaVätska();
    }

    @Override
    public double räknaVätska() {
        return vät_Typ.volym;
    }
}
