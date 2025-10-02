class Kendaraan {
    public void berjalan() {
        System.out.println("Kendaraan sedang berjalan...");
    }
}

class Mobil extends Kendaraan {
    public void klakson() {
        System.out.println("Mobil membunyikan klakson!");
    }
}

public class Inheritance_Single {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.berjalan();
        m.klakson();
    }
}
