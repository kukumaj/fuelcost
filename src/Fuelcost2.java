import java.util.Scanner;

public class Fuelcost2 {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        boolean war = true;
        Scanner scanner = new Scanner(System.in);
        while (war) {
            try {

                System.out.println("podaj a");
                a = scanner.nextDouble();

                System.out.println("podaj b");
                b = scanner.nextDouble();
                System.out.println("podaj c");
                c = scanner.nextDouble();

                if (a < 0 || b < 0 || c < 0) {
                   System.out.println("one parameters is negative change it!");
                    continue;

                } else if (a == 0 || b == 0 || c == 0) {
                    System.out.println("zero jest ok ale i tak dupa");
                    continue;
                } else {
                    System.out.println("wynik : " + (a * b * c));
                }


                 war = false;
            } catch (Exception e) {
                scanner.next();
                System.out.println(" podaj jeszcze raz dane.Liczby inne znaki nie dozwolone");
                war = true;
            }
        }

    }
}
