interface Terbang {
    void terbang();
}

interface Berenang {
    void berenang();
}

class Bebek implements Terbang, Berenang {
    public void terbang() { System.out.println("Bebek bisa terbang jarak pendek."); }
    public void berenang() { System.out.println("Bebek juga jago berenang."); }
}

public class InheritanceMultiple {
    public static void main(String[] args) {
        Bebek bebek1 = new Bebek();
        bebek1.terbang();
        bebek1.berenang();
    }
}
