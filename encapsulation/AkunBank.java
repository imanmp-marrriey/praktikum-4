public class AkunBank {

    private int saldo;

    public AkunBank(int saldo) {
        this.saldo = saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    // Method menabung
    public int menabung(int jumlah) {
        this.saldo += jumlah;
        System.out.println("Berhasil menabung Rp" + jumlah);
        return this.saldo;
    }

    // Method tarik tunai
    public int tarikTunai(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Saldo penarikan harus lebih dari 0");
        } else if (this.saldo - jumlah < 10) {
            System.out.println("Penarikan gagal! Saldo minimal mengendap Rp10");
        } else {
            this.saldo -= jumlah;
            System.out.println("Berhasil tarik tunai Rp" + jumlah);
        }
        return this.saldo;
    }
}
