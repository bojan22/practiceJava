package domaciZadatakMetode;

public class Som extends Zivotinje{
    public Som(String vrsta, boolean ugrozeno, boolean otrovno) {
        super(vrsta, ugrozeno, otrovno);
    }

    public void spavaj() {
        System.out.println("Som ne spava");
    }

    public void jedi() {
        System.out.println("Som jede male ribice");
    }

    public void svrljaj() {
        System.out.println("Som se ne svrlja");
    }

    public void proizvediZvuk() {
        System.out.println("Som nema zvuk on je riba");
    }
}

