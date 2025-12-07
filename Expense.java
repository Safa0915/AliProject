public class Expense {

    
    private String title;
    private double amount;

    public Expense(String title, double amount) {
        this.title = title;
        this.amount = amount;
    }

    //Gets title
    public String getTitle(){
        return title;
    }

    //Gets amount
    public double getAmount() {
        return amount;
    }

    //Sets title
    public void setTitle(String title) {
        this.title = title;
    }

    //Sets amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    //Gets the final amount
    public double getFinalAmount() {
        return amount;
    }

    //Prints the information in a neat way
    public void showInfo() {
        System.out.println("Title: " + title);
        System.out.printf("Original Amount: £%.2f",  amount);
        System.err.println();
        System.out.printf("Final Amount: £%.2f", getFinalAmount());
        System.err.println();
        System.out.println("Type: Normal");
        System.out.println();
    }
    
}