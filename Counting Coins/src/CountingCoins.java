public class CountingCoins {

    /*
    Create a program which will make change, converting values of under $1 to their accurate quantity and type of coins.
    Example:   $0.51 -> 2 quarters and 1 penny.
     */

    public static void main(String[] args) {

        double rawChange = 5.83;

        //casting is forcing the computer to accept a certain data type

        int change = (int)(rawChange * 100);

        int quarters = change / 25;
        change = change % 25;

        int dimes = change / 10;
        change = change % 10;

        int nickels = change / 5;

        int pennies = change % 5;

        System.out.println("coins needed to make $" + rawChange);
        System.out.println("quarters: " + quarters);
        System.out.println("dimes: " + dimes);
        System.out.println("nickels: " + nickels);
        System.out.println("pennies: " + pennies);

    }

}
