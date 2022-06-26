import java.util.*;

public class BojanZivkovicDZ {
    public static void main(String[] args) {

        // MIN i MAX unetog broja

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite 3 decimalna broja: ");
        System.out.println("Prvi broj je: ");
        double prvi = sc.nextDouble();
        System.out.println("Drugi broj je: ");
        double drugi = sc.nextDouble();
        System.out.println("Treci broj je: ");
        double treci = sc.nextDouble();
        if ((prvi > drugi) & (prvi > treci)) {
            System.out.println("Najveci broj je " + prvi);
        } else if (drugi > treci) {
            System.out.println("Najveci broj je " + drugi);
        } else {
            System.out.println("Najveci broj je " + treci);


            sc.close();
        }
    }
}
