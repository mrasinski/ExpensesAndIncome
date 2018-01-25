import java.util.ArrayList;

public class Expenses {
    private String nameOfExpense;
    private double amountOfExpense;
    private double totalAmount;
    private ArrayList<Expenses> numberOfExpenses = new ArrayList<>();

    public Expenses(String nameOfExpense, double amountOfExpense) {
        this.nameOfExpense = nameOfExpense;
        this.amountOfExpense = amountOfExpense;
        this.totalAmount += amountOfExpense;
        numberOfExpenses.add(this);
    }

    private String getNameOfExpense() {
        return nameOfExpense;
    }

    private double getAmountOfExpense() {
        return amountOfExpense;
    }

    public double addExpenses(String name, double expenses) {
        return amountOfExpense += expenses;
    }

    public void showExpenses() {
        for (int i = 0; i < numberOfExpenses.size(); i++) {
            System.out.println(i + ". " + numberOfExpenses.get(i).getNameOfExpense() + " with amount: "
                    + numberOfExpenses.get(i).getAmountOfExpense());
        }
    }
}
