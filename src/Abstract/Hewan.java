package Abstract;

/**
 * @author Farkhan Hamzah Firdaus
 */
public abstract class Hewan {
    protected String nama;
    protected int kaki;

    public Hewan(String nama,int kaki){
        this.nama = nama;
        this.kaki = kaki;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKaki() {
        return kaki;
    }

    public void setKaki(int kaki) {
        this.kaki = kaki;
    }
}
