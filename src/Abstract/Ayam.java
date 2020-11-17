package Abstract;

/**
 * @author Farkhan Hamzah Firdaus
 * @project ayam
 * @created 17/11/2020 - 7:24 AM
 */
public class Ayam extends Hewan implements Herbivora {
    public String warna;
    public String suara;

    public Ayam(String nama, int kaki, String warna, String suara) {
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
