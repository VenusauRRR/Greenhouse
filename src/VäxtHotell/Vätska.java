package VäxtHotell;

public enum Vätska {
    KRANVATTEN ("kranvatten",0.5),
    PROTEINDRYCK ("proteinDryck", 0.2),
    MINERALVATTEN ("mineralvatten",0.02);

    final String vätskaNamn;
    final double volym;

    Vätska(String vätskaNamn,double volym){
        this.vätskaNamn = vätskaNamn;
        this.volym = volym;
    }
}

