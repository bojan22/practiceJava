import java.util.*;

public class BojanZIvkovicDZ2 {
    public static void main(String[] args) {
        //Napraviti program koji služi za prikupljanje proudžbine od korisnika, stavke porudžbine
        //smestiti u niz stringova a cenu u niz decimalnih brojeva. Potom odrediti najjefitniji i
        //najskuplji deo porudžbine. (Ispisati naziv stavke kao i cenu)
        Scanner sc = new Scanner(System.in);

        int duzP;
        System.out.println("Unesite broj porudzbina: ");
        duzP = sc.nextInt();

        String[] porudzina = new String[duzP];
        double[] cena = new double[duzP];
        double min;
        double max= 0;
        System.out.println("Unesite naziv poroizvoda: ");
        porudzina[0]= sc.next();
        System.out.println("Unesite cenu poroizvoda: ");
        cena[0] = sc.nextDouble();
        min = cena[0];
        max = cena[0];
        int tmpMin=0;
        int tmpMax=0;

        for (int i = 1; i<porudzina.length; i++){
            System.out.println("Unesite naziv poroizvoda: ");
            porudzina[i]= sc.next();
            System.out.println("Unesite cenu poroizvoda: ");
            cena[i] = sc.nextDouble();
            if(cena[i]<min){
                min = cena[i];
                tmpMin = i;
            }
            if(cena[i]>max){
                max = cena[i];
                tmpMax = i;
            }
        }
        System.out.println("Najjeftiji proizvod je: " + porudzina[tmpMin] + " sa cenom: "+ cena[tmpMin]);
        System.out.println("Najskuplji proizvod je: " + porudzina[tmpMax] + " sa cenom: "+ cena[tmpMax]);







    }






        }


