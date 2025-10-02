public class AkunBankTestSetterGetter {
    public static void main(String[] args) {
        AkunBank akun1 = new AkunBank("Iman", 100000);

        System.out.println("Pemilik: " + akun1.getNamaPemilik());
        System.out.println("Saldo: Rp" + akun1.getSaldo());

        // ubah data pakai setter
        akun1.setNamaPemilik("Agaa");
        akun1.setSaldo(200000);

        System.out.println("\nSetelah diubah:");
        System.out.println("Pemilik: " + akun1.getNamaPemilik());
        System.out.println("Saldo: Rp" + akun1.getSaldo());
    }
}
