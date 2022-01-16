import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class fuelCostGifted {
    private static void onWrongInput() {
        System.err.println("Please enter a valid data");
    }

    private static double getNumber(Scanner scanner) {
        while (true) {
            try {
                double input = scanner.nextDouble();
                if (input > 0) {
                    return input;
                } else {
                    onWrongInput();
                }
            } catch (InputMismatchException e) {
                scanner.next();
                onWrongInput();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of kilometers travelled: ");
        double km = getNumber(scanner);

        System.out.print("Please enter average fuel burn in liters per kilometer: ");
        double averageFuelBurn = getNumber(scanner);

        System.out.print("Please enter fuel cost in dollars: ");
        double fuelCost = getNumber(scanner);

        System.out.printf(Locale.US, "Your trip will cost: %.2f$", km * averageFuelBurn *fuelCost);
    }
}