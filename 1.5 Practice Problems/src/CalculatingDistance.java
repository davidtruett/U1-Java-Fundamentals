public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles

    */

    public static void main(String[] args) {

        int timeTraveled = 45;
        int speedTraveled = 55;

        double time = timeTraveled / 60.0;
        double distanceTraveled = speedTraveled * time;

        System.out.println("you traveled " + distanceTraveled + " miles.");
    }
}
