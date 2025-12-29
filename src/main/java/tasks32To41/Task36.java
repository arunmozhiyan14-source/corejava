package tasks32To41;

/*Task 36:Skip Discounted Items (CONTINUE + FOR)
Concept: for loop + continue
Task:
Store product prices in an array
If price is less than 500, skip it
Add only prices ≥ 500 to total
Print final total
*/
public class Task36 {
    public static void main(String[] args) {
        SkipDiscountedItems();
    }

    public static void SkipDiscountedItems() {
        double[] productPrice = {198.5, 692.5, 499.5, 598.5, 900, 500};
        double totalPrice = 0;
        for (double p : productPrice) {
            if (p < 500) continue;
            else totalPrice += p;
        }
        System.out.println("The total price is " + totalPrice);
    }
}

