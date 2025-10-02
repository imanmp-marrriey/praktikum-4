class Hewan {
    String nama;
    public Hewan(String nama) { this.nama = nama; }
    public void makan() { System.out.println(nama + " sedang makan."); }
}

interface Terbang {
    void terbang();
}

interface Suara {
    void bersuara();
}

class BurungHybrid extends Hewan implements Terbang, Suara {
    public BurungHybrid(String nama) { super(nama); }
    public void terbang() { System.out.println(nama + " terbang tinggi."); }
    public void bersuara() { System.out.println(nama + " berkicau indah."); }
}

public class InheritanceHybrid {
    public static void main(String[] args) {
        BurungHybrid beo = new BurungHybrid("Beo");
        beo.makan();
        beo.terbang();
        beo.bersuara();
    }
}
