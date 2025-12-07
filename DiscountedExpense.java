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
        System.out.printf("Original Amount: £%.2f",  getAmount());
        System.err.println();
        System.out.println("Discount: %" + discountPercent);
        System.out.printf("Final Amount: £%.2f", getFinalAmount());
        System.out.println();
        System.out.println("Type: Discounted");
        System.out.println();
    }
}
