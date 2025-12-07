import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseManagerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        boolean loop = true;

        while (loop) {

            System.out.println("==== Student Expense Manager ====");
            System.out.println("1. Add Expense");
            System.out.println("2. Add Discounted Expense");
            System.out.println("3. View All Expenses");
            System.out.println("4. Show Total Spending");
            System.out.println("5. Show Highest Expense");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println();
                    System.out.print("Enter expense title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter expense amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();

                    if (amount < 0) {
                        System.out.println("Amount cannot be negative. Expense not added.");
                        System.out.println();
                        break;
                    }

                    Expense e = new Expense(title, amount);
                    expenses.add(e);
                    System.out.println("Normal expense added.");
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.print("Enter expense title: ");
                    String dTitle = scanner.nextLine();

                    System.out.print("Enter original amount: ");
                    double dAmount = scanner.nextDouble();
                    scanner.nextLine();

                    if (dAmount < 0) {
                        System.out.println("Amount cannot be negative. Discounted expense not added.");
                        System.out.println();
                        break;
                    }

                    System.out.print("Enter discount percentage: ");
                    double discount = scanner.nextDouble();
                    scanner.nextLine();

                    if (discount < 0 || discount > 100) {
                        System.out.println("Discount must be between 0 and 100. Discounted expense not added.");
                        System.out.println();
                        break;
                    }

                    Expense d = new DiscountedExpense(dTitle, dAmount, discount);
                    expenses.add(d);
                    System.out.println("Discounted expense added.");
                    System.out.println();
                    break;

                case 3:
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses were recorded.");
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("---- All Expenses ----");
                        for (int i = 0; i < expenses.size(); i++) {
                            expenses.get(i).showInfo();
                        }
                    }
                    break;

                case 4:
                    System.out.println();
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses were recorded.");
                    } else {
                        double total = 0.0;
                        for (Expense exp : expenses) {
                            total += exp.getFinalAmount();
                        }
                        System.out.println("Total spending: £" + total);
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println();
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses were recorded.");
                        System.out.println();
                    } else {
                        Expense highest = expenses.get(0);
                        for (Expense exp : expenses) {
                            if (exp.getFinalAmount() > highest.getFinalAmount()) {
                                highest = exp;
                            }
                        }
                        System.out.println("Highest expense: " + highest.getTitle());
                        System.out.println("Amount: £" + highest.getFinalAmount());
                    }
                    break;

                case 6:
                    System.out.println();
                    System.out.println("Thank you for using Student Expense Manager.");
                    loop = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    System.out.println();
            }
        }

        scanner.close();
    }
}