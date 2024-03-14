package Ex1Lab4;

public class Copiatoare extends Produs {

    private int p_ton;
    private String format;

    public Copiatoare(String denumire,int nr_inv,float pret,String zona_magaz,String state,int p_ton,String format){
        super(denumire,nr_inv,pret,zona_magaz,state);
        this.p_ton = p_ton;
        this.format = format;
    }

    public int getP_ton() {
        return p_ton;
    }

    public void setP_ton(int p_ton) {
        this.p_ton = p_ton;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.getP_ton() + " " + getFormat();
    }
}
