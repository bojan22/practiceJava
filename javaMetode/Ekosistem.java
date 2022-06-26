package domaciZadatakMetode;

public class Ekosistem {

    public static void main(String[] args) {
        //LAV
        Zivotinje z1 = new Lav("Divlja zivotinja", true, false);
        z1.jedi();z1.proizvediZvuk();z1.spavaj();z1.svrljaj();
        //MACKA
        Zivotinje z2 = new Macka("Domaca zivotinja", false, false);
        z2.svrljaj();z2.spavaj();z2.proizvediZvuk();z2.jedi();
        //PATKA
        Zivotinje z3 = new Patka("Divlja zivotinja", false, false);
        z3.jedi();z3.proizvediZvuk();z3.spavaj();z3.svrljaj();
        //SOM
        Zivotinje z4 = new Som("Divlja zivotinja", false,false);
        z4.svrljaj();z4.spavaj();z4.jedi();z4.proizvediZvuk();
        //DETLIC
        Zivotinje z6 = new Detlic("Divlja zivotinja", false,false);
        z6.proizvediZvuk();z6.jedi();z6.spavaj();z6.svrljaj();
        //BILJKA
        ZivoBice z5 = new Biljka("Ruza",false, false, "Ruza",
                false);
        System.out.println("Biljka "+ z5.vrsta+ " je otrovna: "+ z5.otrovno);
        System.out.println("Biljka "+ z5.vrsta+ " je ugrozena: "+ z5.ugrozeno);
        //Mogu i da pozovem klasu ZivoBice al nije mi logicno jer metoda ne radi.
        //ZivoBice z7 = new ZivoBice("Biljka", false, false);
        //System.out.println(z7.vrsta + " je ugrozena: " + z7.ugrozeno);
        //System.out.println(z7.vrsta + " je otrovna: " + z7.otrovno);


    }
}
