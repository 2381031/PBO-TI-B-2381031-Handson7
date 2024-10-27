package enkapsurasi;

public class Main {
    public static void main(String[] args) {
        BankAccount AndreLumbantoruan = new BankAccount(100);
        AndreLumbantoruan.deposit(10);
        System.out.println(AndreLumbantoruan.getSaldo());
    }
}
