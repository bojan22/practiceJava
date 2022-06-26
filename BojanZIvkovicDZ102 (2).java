import java.util.*;

public class BojanZivkovicDZ {
    public static void main(String[] args) {

        //Program koji racuna minimum od n ucitanih celih brojeva, gde je n > 0 dati prirodan broj

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite duzinu niza: ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Uneli ste negativan broj, pokusajte ponovo");
            return;
        }
        int min;

        System.out.println("Unesite 1. broj: ");
        int x =sc.nextInt();
        if(x<0){
            System.out.println("Uneli ste negativan broj, pokusajte ponovo");
            return;
        }

        min=x;

        for(int i = 2; i<=n; i++){
            System.out.println("Unesite " + i +". broj: ");
            x = sc.nextInt();
            if(x<0){
                System.out.println("Uneli ste negativan broj, pokusajte ponovo");
                return;
            }
            if(x<min){
                min=x;
            }
        }
        System.out.println("Minimalni broj je " + min);
    }
    }




