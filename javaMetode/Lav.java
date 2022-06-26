package domaciZadatakMetode;

public class Lav extends Zivotinje{

    public Lav(String vrsta, boolean ugrozeno, boolean otrovno) {
        super(vrsta, ugrozeno, otrovno);
    }

    public void spavaj() {
        System.out.println("Lav spava danju");
    }

    public void jedi() {
        System.out.println("Lav jede zebre");
    }

    public void svrljaj() {
        System.out.println("Lav se svrlja");
    }

    public void proizvediZvuk() {
        System.out.println("Lav vice: ARRRRR");
    }
}
