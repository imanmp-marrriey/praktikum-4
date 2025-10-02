public class AkunBank {
    private int saldo;
    public static final int SALDO_MINIMAL = 10; // ← non-access modifier (static + final)

    // constructor
    public AkunBank(int saldo) {
        this.saldo = saldo;
    }

    // getter saldo
    public int getSaldo() {
        return saldo;
    }

    // setter saldo
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    // menabung
    public void menabung(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Berhasil menabung Rp " + jumlah);
        } else {
            System.out.println("Jumlah tabungan harus lebih dari 0");
        }
    }

    // tarik tunai
    public void tarikTunai(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan harus lebih dari 0");
        } else if (saldo - jumlah < SALDO_MINIMAL) { // pakai konstanta non-access modifier
            System.out.println("Penarikan gagal! Saldo minimal mengendap Rp " + SALDO_MINIMAL);
        } else {
            saldo -= jumlah;
            System.out.println("Berhasil tarik tunai Rp " + jumlah);
        }
    }
}
