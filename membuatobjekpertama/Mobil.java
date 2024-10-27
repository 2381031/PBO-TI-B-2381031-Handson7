package membuatobjekpertama;

public class Mobil {
    String warna;
    String merek;
    int kecepatanMaks;


    public Mobil(String warna, String merek, int kecepatanMaks){
        this.warna= warna;
        this.merek= merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilkanInfo() {
        System.out.println("Mobil merek: " + merek );
        System.out.println("wWarna: " + warna);
        System.out.println("Kecepatan Maks: " + kecepatanMaks);
    }

    public void berjalan() {
        System.out.println("Mobil " + merek + "sedang berjalan");
    }

    public void berhenti() {
        System.out.println("Mobil " + merek + " sedang berhenti");
    }


}
