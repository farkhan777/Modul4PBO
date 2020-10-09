package Abstract;

/**
 * @author Farkhan Hamzah Firdaus
 */
public class Bebek extends Hewan implements Karnivora, Herbivora{
    public String warna;
    public String suara;

    public Bebek(String nama, int kaki, String suara, String warna) {
        super(nama, kaki);
        this.suara = suara;
        this.warna = warna;
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis : "+Karnivora.jenis);
        System.out.println("Makanan : "+Karnivora.makanan+" dan "+Herbivora.makanan);
    }

    public void tampilan(){
        System.out.println("Nama : "+getNama());
        System.out.println("Jumlah kaki : "+getKaki());
        displayMakan();
        System.out.println("Suara : "+suara);
        System.out.println("Warna : "+warna);
        System.out.println("\n");
    }
}
