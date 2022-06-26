package domaciZadtak;
// BOJAN ZIVKOVIC

//Napraviti klasu Proizvod koja sadrzi:
//- naziv
//- cenu
//- rokTrajanja
//Napisati metodu koja stampa proizvod, i konstruktor kojem se prosledjuju ova 3 atributa

public class Proizvod {
    public String naziv;
    public double cena;
    public String rokTrajanja;

    public Proizvod (String naziv, double cena, String rokTrajanja){
        this.naziv = naziv;
        this.cena = cena;
        this.rokTrajanja = rokTrajanja;
    }

    public  void stampanje(){
        System.out.println("Naziv proizvoda je: "+ naziv + " , cena je " +cena+ " a rok trajanja tog proizvoda je: "
                + rokTrajanja);
    }
}
