package Abstract;

/**
 * @author Farkhan Hamzah Firdaus
 * @project kuda
 * @created 17/11/2020 - 2:57 AM
 */
public class Kuda extends Hewan implements Herbivora{
    public String warna;
    public String suara;

    public Kuda(String nama, int kaki, String warna, String suara) {
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
