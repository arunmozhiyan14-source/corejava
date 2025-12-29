package mediumLevelPrograms;

/* TASK 6: Shopping Cart Total (Enhanced + While)
Store product prices in an array
Use:
Enhanced for loop → Calculate total price
While loop → Apply discount until total ≤ 5000
Print final amount
*/
public class ShoppingCartTotal {
    static double[] price = {988.50, 919.50, 989.75, 989.25, 1000};

    public static void main(String[] args) {
        calculateTotalPrice();

    }

    public static void calculateTotalPrice() {
        double totalPrice = 0;
        for (double p : price) {
            totalPrice = totalPrice + p;
        }
        System.out.println("Total Price of all the products is " + totalPrice);
        int i = 0;
        double total = 0;
        double finalAmount = 0;
        while(i<price.length){
            total = total + price[i];
            if(total<=5000){
                double discount = (double) 30 /100*total;
                finalAmount = total - discount;
            }
            i++;
        }
        System.out.println("The final amount is "+ finalAmount);
    }
}