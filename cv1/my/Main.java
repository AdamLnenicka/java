import geometrie.kresleni.*;
import geometrie.utvary.*;

public class Main {
    public static void main(String[] args) {
        Kruh kruh = new Kruh();
        kruh.setPolomer(10);
        Platno platno = new Platno(kruh);
        System.out.println("Obvod kruhu: " + kruh.obvod());
        System.out.println("Max hodnota: " + platno.max(5, 10));
    }
}
