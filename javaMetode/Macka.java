package domaciZadatakMetode;

public class Macka extends Zivotinje{

    public Macka(String vrsta, boolean ugrozeno, boolean otrovno) {
        super(vrsta, ugrozeno, otrovno);
    }

    public void spavaj() {
        System.out.println("Macka spava nocu");
    }

    public void jedi() {
        System.out.println("Macka jede misa");
    }

    public void svrljaj() {
        System.out.println("Macka obozava da se svrlja");
    }

    public void proizvediZvuk() {
        System.out.println("MAcka vice: mjau mjauu");
    }
}

