package VäxtHotell;

abstract class Växt implements Vätska {
    String namn;
    double längd;

    String vätska;

    double vätskaVolym;

    public Växt(String namn, double längd){
        this.namn = namn;
        this.längd = längd;
    }

    public String getNamn() {
        return namn;
    }

    public String getVätska() { return vätska; }

    public double getVätskaVolym() {
        return vätskaVolym;
    }

}
