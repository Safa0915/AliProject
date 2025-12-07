public class TestExpenses {
    public static void main(String[] args) {

        // Test normal expense
        Expense e = new Expense("Coffee", 3.50);
        e.showInfo();

        // Test discounted expense
        DiscountedExpense d = new DiscountedExpense("Student Lunch", 6.00, 20);
        d.showInfo();
    }
}
