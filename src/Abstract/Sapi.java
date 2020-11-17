package Abstract;

/**
 * @author Farkhan Hamzah Firdaus
 * @project sapi
 * @created 17/11/2020 - 2:41 AM
 */
public class Sapi extends Hewan implements Herbivora{
    public String warna;
    public String suara;

    public Sapi(String nama, int kaki, String warna, String suara) {
        super(nama, kaki);
        this.warna = warna;
        this.suara = suara;
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis : "+Herbivora.jenis);
        System.out.println("Makanan : "+Herbivora.makanan);
    }

    public void tampilan(){
        System.out.println("Nama : "+nama);
        System.out.println("Jumlah kaki : "+kaki);
        displayMakan();
        System.out.println("Suara : "+suara);
        System.out.println("Warna : "+warna);
        System.out.println("\n");
    }
}
