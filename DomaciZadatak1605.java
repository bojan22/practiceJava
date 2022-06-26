import java.util.*;

public class DomaciZadatak1605 {
    //BOJAN ZIVKOVIC
    //Napisati metodu koja vraca ArrayList-u vasih omiljenih zivotinja, unos vrsiti preko Scanner-a.
    //Napraviti drugu metodu koja stampa sadrzaj liste. Napraviti metodu
    //public static ArrayList<String> dodaj(ArrayList<String> listaZaDodavanje, String nazivZivotinije)
    //koja dodaje datu zivotinju u listu
    public static void main(String[] args) {
        ArrayList omiljeneZivotinje = dodajOmiljenezivotnje();
        stampanje(omiljeneZivotinje);

        dodaj(omiljeneZivotinje, "zec");
        stampanje(omiljeneZivotinje);



    }

    public static ArrayList dodajOmiljenezivotnje() {
        Scanner sc = new Scanner(System.in);
        ArrayList list1 = new ArrayList();
        System.out.println("Unesite broj zivotinja: ");
        int brojZivotinja = sc.nextInt();
        if (brojZivotinja<1){
            System.out.println("Morate bar jednu zivotinju da unesete");
        }
        //System.out.println("Unesite omiljene zivotinje: ");
        //String unos = sc.next();
        for (int i = 0; i < brojZivotinja; i++) {

            System.out.println("Unesite omiljene zivotinje: ");
            String unos = sc.next();
            list1.add(unos);

        }
        return list1;
    }
        //druga metoda
        public static void stampanje(ArrayList list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));

        }System.out.println("______________");

        }
        //treca metoda
        public static ArrayList<String> dodaj (ArrayList<String> lista, String nazivZivotinje){
        lista.add(nazivZivotinje);
        return lista;
        }

    }

