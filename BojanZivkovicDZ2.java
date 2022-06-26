import java.util.*;

public class BojanZivkovicDZ2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj: ");

        int broj = sc.nextInt();
        if(broj > 0) {
            System.out.println("Unet broj je pozitivan");
        } else if (broj < 0) {
            System.out.println("Unet broj je negativan");
        } else {
            System.out.println("Unet broj je nula");
        }


            sc.close();
        }
    }

