import java.util.Scanner;

public class Fuelcost {

    public static class FuelCost {
        private static final String PROMPT_MESSAGE_TEMPLATE = "%s ";
        private static final String WRONG_INPUT_TEMPLATE = "%s must be an integer number ";
        private static final String VALIDATION_MESSAGE_TEMPLATE = "%s must be a positive number ";
        private static final String OUTPUT_MESSAGE_TEMPLATE = "Fuel cost is %.2f $ ";


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.printf(OUTPUT_MESSAGE_TEMPLATE,
                        ResultOfFuelCost
                                .fromKmAndAvaroNKilommetersAndAvaroFprice(
                                        readDoubleWithPromptAndValidation(scanner, "Kilometers"),
                                        readDoubleWithPromptAndValidation(scanner, "AvarageOnKm"),
                                        readDoubleWithPromptAndValidation(scanner, "PriceInDollars"))
                                .getCost());
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong data input.Change it!!");
            }
        }

        private static double readDoubleWithPromptAndValidation(Scanner scanner, String measurementName) {
            System.out.printf(PROMPT_MESSAGE_TEMPLATE, measurementName);
            String line = scanner.nextLine();
            try {
                double value = Double.parseDouble(line);
                if (value > 0) {
                    return value;
                } else {
                    throw new IllegalArgumentException(String.format(VALIDATION_MESSAGE_TEMPLATE, measurementName));

                }

            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(String.format(WRONG_INPUT_TEMPLATE, measurementName));
            }

        }

        static class ResultOfFuelCost {
            final double numbOfKilometers;
            final double avaragePerKilometer;
            final double fuelPrice;


            static ResultOfFuelCost fromKmAndAvaroNKilommetersAndAvaroFprice(double numbOfKilometers, double avaragePerKilometer, double fuelPrice) {
                return new ResultOfFuelCost(numbOfKilometers, avaragePerKilometer, fuelPrice);

            }

            private ResultOfFuelCost(double numbOfKilometers, double avaragePerKilometer, double fuelPrice) {
                this.numbOfKilometers = numbOfKilometers;
                this.avaragePerKilometer = avaragePerKilometer;
                this.fuelPrice = fuelPrice;

            }

            double getCost() {
                return numbOfKilometers * avaragePerKilometer * fuelPrice;
            }


        }

    }
}