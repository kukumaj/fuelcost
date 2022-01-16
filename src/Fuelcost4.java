import java.util.Scanner;

public class Fuelcost4 {
    public static double getNumber(String par, Scanner scanner) {
        while (true) {
            try {
                System.out.println("podaj " + par);
                double x;
                x = scanner.nextDouble();
                if (x < 0) {
                    System.out.println(par + " is negative change it!");
                    continue;
                } else if (x == 0) {
                    System.out.println("zero doesnt give you anything change it");
                    continue;
                }
                return x;

            } catch (Exception e) {
                scanner.next();

                System.out.println(par + "  must be a number  ");

            }
        }
    }

    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        double c = 0;
        //boolean war = true;
        Scanner scanner = new Scanner(System.in);
        a = getNumber("a", scanner);
        b = getNumber("b", scanner);
        c = getNumber("c", scanner);
        System.out.printf("wynik : %.2f ",(a * b * c));

    }

}
