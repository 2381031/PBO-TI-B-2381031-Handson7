package membuatobjekpertama;

public class Main {
    public static void main(String[] args) {
        Mobil toyota = new Mobil("Merah", "toyota", 188);
        toyota.tampilkanInfo();

        toyota.merek = "Honda";

        toyota.tampilkanInfo();
    }
}
