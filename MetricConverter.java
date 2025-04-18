import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to metric converter!");
        System.out.println("Please input your query. For example, 1 km = mile");
        System.out.println("Enter 'exit' or '-1' to exit the program");

        while (true) {
            System.out.print(">> ");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("exit") || input.equals("-1")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            if (input.contains("kg = lb")) {
                System.out.print("Enter kg: ");
                double kg = scanner.nextDouble();
                scanner.nextLine();
                System.out.println(kg + " kg = " + (kg * 2.20462) + " lb");
            } else if (input.contains("gram = ounce")) {
                System.out.print("Enter grams: ");
                double gram = scanner.nextDouble();
                scanner.nextLine();
                System.out.println(gram + " g = " + (gram * 0.035274) + " oz");
            } else if (input.contains("km = mile")) {
                System.out.print("Enter kilometers: ");
                double km = scanner.nextDouble();
                scanner.nextLine();
                System.out.println(km + " km = " + (km * 0.621371) + " miles");
            } else if (input.contains("mm = inch")) {
                System.out.print("Enter millimeters: ");
                double mm = scanner.nextDouble();
                scanner.nextLine();
                System.out.println(mm + " mm = " + (mm * 0.0393701) + " inches");
            } else {
                System.out.println("Input not recognized. Try something like '1 kg = lb'");
            }
        }

        scanner.close();
    }
}