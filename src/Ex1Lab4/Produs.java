package Ex1Lab4;

public class Produs {
    protected String denumire;
    protected int nr_inv;
    protected float pret;

    protected String zona_magaz;

    protected String state;


    public Produs(String denumire,int nr_inv,float pret,String zona_magaz,String state){
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_magaz = zona_magaz;
        this.state = state;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNr_inv(){
        return nr_inv;
    }

    public void setNr_inv(int nr_inv) {
        this.nr_inv = nr_inv;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public String getZona_magaz() {
        return zona_magaz;
    }

    public void setZona_magaz(String zona_magaz) {
        this.zona_magaz = zona_magaz;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString(){
        return this.getDenumire() + " " + this.getNr_inv() + " " + this.getPret() + " " + this.getZona_magaz() + " " + this.getState();
    }
}
