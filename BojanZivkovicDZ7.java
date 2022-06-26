import java.util.*;

public class BojanZivkovicDZ {
    public static void main(String[] args) {

        // Program koji ucitava prirodne brojeve sve dok ne bude unesen broj 0, i odredjuje koliko je
        // ucitanih brojeva parno, a koliko neparno

        Scanner sc = new Scanner(System.in);
        int parni = 0;
        int neparni = 0;
        System.out.println("Unesite prirodan broj: ");
        int broj = sc.nextInt();
        for(int i = 0; broj!=0; i++){

            if(broj % 2 == 0){
                parni = parni + 1;
            }
            else{
                neparni = neparni + 1;
            }
            broj = sc.nextInt();


        }
        System.out.println("Broj parnih je: "+ parni);
        System.out.println("Broj neparnih je: "+ neparni);



    }
}