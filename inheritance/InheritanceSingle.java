class Hewan {
    String nama;
    public Hewan(String nama) { this.nama = nama; }
    public void makan() { System.out.println(nama + " sedang makan."); }
}

class Kucing extends Hewan {
    public Kucing(String nama) { super(nama); }
    public void meong() { System.out.println(nama + " mengeong: Meooong!"); }
}

public class InheritanceSingle {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Mimi");
        kucing1.makan();
        kucing1.meong();
    }
}
