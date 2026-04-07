import java.util.Scanner;

public class Temperature_Converter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("==================================");
        System.out.println("   🌡️ Temperature Converter ");
        System.out.println("==================================");

        do {
            System.out.println("\nChoose Conversion Type:");
            System.out.println("1. Celsius → Fahrenheit");
            System.out.println("2. Celsius → Kelvin");
            System.out.println("3. Fahrenheit → Celsius");
            System.out.println("4. Fahrenheit → Kelvin");
            System.out.println("5. Kelvin → Celsius");
            System.out.println("6. Kelvin → Fahrenheit");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("👋 Exiting... Thank you!");
                break;
            }

            System.out.print("Enter temperature value: ");
            double temp = sc.nextDouble();
            double result;

            switch (choice) {
                case 1:
                    result = (temp * 9/5) + 32;
                    System.out.println("Result: " + result + " °F");
                    break;

                case 2:
                    result = temp + 273.15;
                    System.out.println("Result: " + result + " K");
                    break;

                case 3:
                    result = (temp - 32) * 5/9;
                    System.out.println("Result: " + result + " °C");
                    break;

                case 4:
                    result = (temp - 32) * 5/9 + 273.15;
                    System.out.println("Result: " + result + " K");
                    break;

                case 5:
                    result = temp - 273.15;
                    System.out.println("Result: " + result + " °C");
                    break;

                case 6:
                    result = (temp - 273.15) * 9/5 + 32;
                    System.out.println("Result: " + result + " °F");
                    break;

                default:
                    System.out.println("❌ Invalid choice! Please try again.");
            }

        } while (true);

        sc.close();
    }
}
