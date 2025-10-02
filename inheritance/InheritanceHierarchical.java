class Hewan {
    String nama;
    public Hewan(String nama) { this.nama = nama; }
    public void makan() { System.out.println(nama + " sedang makan."); }
}

class Anjing extends Hewan {
    public Anjing(String nama) { super(nama); }
    public void gonggong() { System.out.println(nama + " menggonggong."); }
}

class Burung extends Hewan {
    public Burung(String nama) { super(nama); }
    public void berkicau() { System.out.println(nama + " berkicau merdu."); }
}

public class InheritanceHierarchical {
    public static void main(String[] args) {
        Anjing dog = new Anjing("Doggy");
        dog.makan();
        dog.gonggong();

        Burung bird = new Burung("Cici");
        bird.makan();
        bird.berkicau();
    }
}
