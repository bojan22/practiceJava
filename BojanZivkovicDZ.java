import java.util.*;

public class BojanZivkovicDZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite Vase Ime:  ");
        String ime = sc.next();
        System.out.print("Unesite Vase Prezime:  ");
        String prezime = sc.next();
        System.out.println("Unesite koliko imate godina:  ");
        int god = sc.nextInt();
        System.out.println("Vase ime je "+ime+ "\nVase prezime je "+prezime+"\nVi imate "+god+" godina");
        sc.close();
    }
}
