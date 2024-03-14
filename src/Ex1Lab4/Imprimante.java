package Ex1Lab4;

public class Imprimante extends Produs {

    private int ppm;
    private int rezolutie;
    private int numar_pag;
    private String mod_tiparire;

    public Imprimante(String denumire,int nr_inv,float pret,String zona_magaz,String state,int ppm,int rezolutie,int numar_pag,String mod_tiparire){
        super(denumire,nr_inv,pret,zona_magaz,state);
        this.ppm = ppm;
        this.rezolutie=rezolutie;
        this.numar_pag = numar_pag;
        this.mod_tiparire = mod_tiparire;
    }

    public int getPpm() {
        return ppm;
    }

    public void setPpm(int ppm) {
        this.ppm = ppm;
    }

    public int getRezolutie() {
        return rezolutie;
    }

    public void setRezolutie(int rezolutie) {
        this.rezolutie = rezolutie;
    }

    public int getNumar_pag() {
        return numar_pag;
    }

    public void setNumar_pag(int numar_pag) {
        this.numar_pag = numar_pag;
    }

    public String getMod_tiparire(){
        return mod_tiparire;
    }

    public void setMod_tiparire(String mod_tiparire) {
        this.mod_tiparire = mod_tiparire;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getPpm() + " " + this.getRezolutie() + " " + this.getNumar_pag() + " " + this.getMod_tiparire();
    }
}
