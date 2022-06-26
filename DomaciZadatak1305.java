
import java.util.*;
// BOJAN ZIVKOVIC

//Napisati funkciju koja od korisnika prikuplja njegove najdraze pesme, kao rezultat vrtatiti niz tih
//pesama (niz String-ova). Od korisnika najpre traziti koliko pesama zeli da unese
public class DomaciZadatak1305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj pesama: ");
        int duzinaNiza = sc.nextInt();
        String[] pesme = new String[duzinaNiza];
        System.out.println("Unesite naziv pesme: ");
        String unetaPesma = sc.nextLine();
        for (int i = 0; i < pesme.length; i++) {
            unetaPesma = sc.nextLine();
            System.out.println("Unesite naziv pesme: ");
            omiljenaPesmna(i, unetaPesma, pesme);
        }
        citacPesama(pesme, duzinaNiza);


    }

    public static void omiljenaPesmna(int index, String nazivPesme, String[] niz) {
        niz[index] = nazivPesme;
    }

    public static void citacPesama(String[] pesme, int duznaNiza) {
        System.out.println(Arrays.toString(pesme));
    }

}
