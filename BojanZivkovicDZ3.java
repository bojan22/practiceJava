import java.util.*;

public class BojanZivkovicDZ3 {
    public static void main(String[] args) {

        //Napisati program koji od korisnika unosi godinu, zatim proveriti da li je godina prestupna.

        Scanner sc = new Scanner(System.in);
        int brGodine;

        System.out.println("Provera prestupne godine");
        System.out.println("Molimo unesite godinu:  ");
        brGodine = sc.nextInt();
        if ((brGodine % 4 == 0) && ((brGodine % 100 != 0) || (brGodine % 400 == 0))) {
            System.out.println("Uneta godina " + brGodine + " je prestupna");


        } else {
            System.out.println("Uneta godina " + brGodine + " NIJE prestupna");
        }
    }
}