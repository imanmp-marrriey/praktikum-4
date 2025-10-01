public class AkunBankTest {
    public static void main(String[] args) {
        
        AkunBank akun1 = new AkunBank(100);
        AkunBank akun2 = new AkunBank(200);
        AkunBank akun3 = new AkunBank(300);

        System.out.println("Saldo akun1 : " + akun1.getSaldo());
        System.out.println("Saldo akun2 : " + akun2.getSaldo());
        System.out.println("Saldo akun3 : " + akun3.getSaldo());

        // Uji coba menabung
        akun1.menabung(50);
        System.out.println("Saldo akun1 setelah menabung: " + akun1.getSaldo());

        // Uji coba tarik tunai
        akun2.tarikTunai(50);
        System.out.println("Saldo akun2 setelah tarik tunai: " + akun2.getSaldo());

        akun3.tarikTunai(500); // coba gagal karena saldo kurang
        System.out.println("Saldo akun3 setelah gagal tarik tunai: " + akun3.getSaldo());
    }
}
