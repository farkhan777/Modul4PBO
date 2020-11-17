package Abstract;

/**
 * @author Farkhan Hamzah Firdaus
 */
public class Driver {
    public static void main(String[] args) {
        Bebek b1 = new Bebek("Bebek",4,"wekwek","kuning");
        Kelinci k1 = new Kelinci("kelinci",4,"putih","hkhk");
        Sapi s1 = new Sapi("Sapi", 4, "Coklat", "Mooo");
        Kuda kd1 = new Kuda("Kuda", 4, "Putih", "Hueeeek");
        Ayam ay1 = new Ayam("Ayam", 2, "Hitam","kokok");

        b1.tampilan();
        k1.tampilan();
        s1.tampilan();
        kd1.tampilan();
        ay1.tampilan();

//        Bebek b1;
//        new Bebek("Bebek",4,"wekwek","kuning");

    }
}
