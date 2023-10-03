package VäxtHotell;

//Arv och Interface
public class Palm extends Växt {
    //Inkapsulning och anrop Enum konstanter
    private final VätskaTyp vät_typ = VätskaTyp.KRANVATTEN;

    public Palm(String namn, double ländg){
        super(namn,ländg);
        super.vätskaTyp = vät_typ.vätskaNamn;
        super.vätskaVolym = räknaVätska();
    }

    @Override
    public double räknaVätska() {
        return vät_typ.volym*this.längd;
    }

}
