package domaciZadatakMetode;

public class Detlic extends Zivotinje{


    public Detlic(String vrsta, boolean ugrozeno, boolean otrovno) {
        super(vrsta, ugrozeno, otrovno);
    }

    public void spavaj() {
        System.out.println("Detlic spava u drvetu");

    }
    public void jedi() {
        System.out.println("Detlic jede drvo");
    }

    public void svrljaj() {
        System.out.println("Detlic se svrlja u drvetu");
    }

    public void proizvediZvuk() {
        System.out.println("Detlic ne proizvodi zvuk, on lupka");
    }
}
