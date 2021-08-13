public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */

    public static void main(String[] args) {

        double gamePrice = 60.0;
        int discount = 20;
        double discountPercentage = discount/100.0;
        double priceToSubtract = gamePrice * discountPercentage;
        double priceAfterDiscount = gamePrice - priceToSubtract;

        System.out.println("your price after the discount is: $" + priceAfterDiscount);


    }
}
