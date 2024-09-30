import java.util.Scanner;

// Define the interface
abstract class RoadAccidents implements IRoadAccidents {
    protected String vehicleType;
    protected String city;
    protected int accidentTotal;

    // Constructor to initialize the data
    public RoadAccidents(String vehicleType, String city, int accidentTotal) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    // Implement methods from the interface
    public String getAccidentVehicleType() {
        return vehicleType;
    }

    public String getCity() {
        return city;
    }

    public int getAccidentTotal() {
        return accidentTotal;
    }

    // Abstract method to be implemented in the subclass
    public abstract void printAccidentReport();
}

// Subclass that extends the RoadAccidents class
class RoadAccidentReport extends RoadAccidents {

    // Constructor that calls the super constructor
    public RoadAccidentReport(String vehicleType, String city, int accidentTotal) {
        super(vehicleType, city, accidentTotal);
    }

    // Implement the printAccidentReport method
    @Override
    public void printAccidentReport() {
        System.out.println("************");
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("************");
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
        System.out.println("************");
    }
}

