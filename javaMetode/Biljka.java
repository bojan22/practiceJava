package domaciZadatakMetode;

public class Biljka extends ZivoBice{

    public String naziv;
    //public String latinskiNaziv;
    public boolean lekovita;

    public Biljka(String vrsta, boolean ugrozeno, boolean otrovno, String naziv, boolean lekovita) {
        super(vrsta, ugrozeno, otrovno);
        this.naziv = naziv;
        //this.latinskiNaziv = latinskiNaziv;
        this.lekovita = lekovita;
    }
}
