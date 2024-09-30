import java.util.Scanner;

// Main class to run the application
public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Console-based interaction to get user input
        System.out.print("Enter the accident vehicle type (e.g., Car, Motor Bike): ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter the city for the vehicle accidents: ");
        String city = scanner.nextLine();

        System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
        int accidentTotal = scanner.nextInt();

        // Create an instance of RoadAccidentReport and print the report
        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, accidentTotal);
        report.printAccidentReport();
    }
}
