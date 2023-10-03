package VäxtHotell;

//Arv och Interface
public class Palm extends Växt implements Vätska{
    //Inkapsulning och anrop Enum konstanter
    private final VätskaTyp vätskaTyp = VätskaTyp.KRANVATTEN;

    public Palm(String namn, double ländg){
        super(namn,ländg);
        super.vätska = vätskaTyp.vätskaNamn;
        super.vätskaVolym = räknaVätska();
    }
    @Override
    public double räknaVätska() {
        return vätskaTyp.volym*this.längd;
    }

}
