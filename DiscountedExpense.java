public class DiscountedExpense extends Expense {

    private double discountPercent;

    //Constructor
    public DiscountedExpense(String title, double amount, double discountPercent) {
        super(title, amount);
        this.discountPercent = discountPercent;
    }

    //Gets the final amount
    public double getFinalAmount() {
        double amount = getAmount();
        return amount * (1 - discountPercent / 100);
    }

    //Prints the information in a neat way
    public void showInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Original Amount: £" + getAmount());
        System.out.println("Discount: %" + discountPercent);
        System.out.printf("Final Amount: £%.2f%n", getFinalAmount());
        System.out.println("Type: Discounted");
        System.out.println();
    }
}
