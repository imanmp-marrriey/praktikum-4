class MakhlukHidup {
    public void bernapas() { System.out.println("Semua makhluk hidup bernapas."); }
}

class HewanDarat extends MakhlukHidup {
    public void bergerak() { System.out.println("Hewan darat bisa berjalan."); }
}

class KucingRumahan extends HewanDarat {
    public void suara() { System.out.println("Kucing rumahan mengeong lembut."); }
}

public class InheritanceMultilevel {
    public static void main(String[] args) {
        KucingRumahan kitty = new KucingRumahan();
        kitty.bernapas();
        kitty.bergerak();
        kitty.suara();
    }
}
