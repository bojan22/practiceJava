package domaciZadatakMetode;

public class Patka extends Zivotinje{
    public Patka(String vrsta, boolean ugrozeno, boolean otrovno) {
        super(vrsta, ugrozeno, otrovno);
    }

    public void spavaj() {
        System.out.println("Patka spava nocu");
    }

    public void jedi() {
        System.out.println("Patka jede svasta");
    }

    public void svrljaj() {
        System.out.println("Pataka se svrlja");
    }

    public void proizvediZvuk() {
        System.out.println("Patka vice: kva kva");
    }
}

