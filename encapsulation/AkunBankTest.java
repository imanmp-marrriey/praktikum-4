public class AkunBankTest {
    public static void main(String[] args) {

        // -------------------------------
        // UJI COBA AKUN 1
        // -------------------------------
        AkunBank akun1 = new AkunBank(0);
        System.out.println("=== Akun 1 ===");
        akun1.setSaldo(100);
        System.out.println("Saldo awal akun1 : " + akun1.getSaldo());

        akun1.menabung(50);
        System.out.println("Saldo akun1 setelah menabung : " + akun1.getSaldo());

        akun1.tarikTunai(30);
        System.out.println("Saldo akun1 setelah tarik tunai : " + akun1.getSaldo());

        // -------------------------------
        // UJI COBA AKUN 2
        // -------------------------------
        AkunBank akun2 = new AkunBank(200);
        System.out.println("\n=== Akun 2 ===");
        System.out.println("Saldo awal akun2 : " + akun2.getSaldo());

        akun2.menabung(100);
        System.out.println("Saldo akun2 setelah menabung : " + akun2.getSaldo());

        akun2.tarikTunai(50);
        System.out.println("Saldo akun2 setelah tarik tunai : " + akun2.getSaldo());

        // -------------------------------
        // UJI COBA AKUN 3
        // -------------------------------
        AkunBank akun3 = new AkunBank(300);
        System.out.println("\n=== Akun 3 ===");
        System.out.println("Saldo awal akun3 : " + akun3.getSaldo());

        akun3.tarikTunai(295); // harus gagal karena harus menyisakan minimal 10
        System.out.println("Saldo akun3 : " + akun3.getSaldo());
    }
}
