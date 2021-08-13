public class SalesTax {

    /*
    Create a program which takes a quantity, price and tax percentage and outputs the subtotal, tax total, total cost with tax.
     */

    public static void main(String[] args) {

        //declare and initialize variables
        int quantity = 6;
        double price = 9.99;
        final double TAX = 7.0; //0.07
        final double TAXRATE = TAX/100.0;

        //calculations
        double subtotal = quantity * price;

        //discounts and increases

        /*
            formula: amount * (1 +/- rate))
            cost increase use +
            cost decrease use -
         */

        double tax = subtotal * TAXRATE;
        double totalCost = subtotal + tax;

        System.out.println("You bought " + quantity + " shirts at " + price + " a piece.");
        System.out.println("subtotal: " + subtotal);
        System.out.println("tax: " + tax);
        System.out.println("total: " + totalCost);




    }


}
