public class AkunBankSetterGetter {
    private String namaPemilik;
    private double saldo;

    // constructor
    public AkunBank(String namaPemilik, double saldo) {
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // getter & setter namaPemilik
    public String getNamaPemilik() {
        return namaPemilik;
    }
    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    // getter & setter saldo
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
