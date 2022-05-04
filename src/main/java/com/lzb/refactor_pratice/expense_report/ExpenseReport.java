package com.lzb.refactor_pratice.expense_report;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Getter
@AllArgsConstructor
enum ExpenseType {

    DINNER("Dinner", true, 5000),
    BREAKFAST("Breakfast", true, 1000),
    CAR_RENTAL("Car Rental", false, Integer.MAX_VALUE);
    private final String name;
    private final boolean isMeal;
    private final int limit;

}

@Getter
@AllArgsConstructor
class Expense {
    ExpenseType type;
    int amount;

    boolean isOverLimit() {
        return amount > type.getLimit();
    }

    String getName() {
        return type.getName();
    }

    boolean isMeal() {
        return type.isMeal();
    }

}

public class ExpenseReport {
    public void printReport(List<Expense> expenses, Date date) {

        System.out.println("Expenses " + date);

        int mealExpenses = getMealExpenses(expenses);
        int total = getTotal(expenses);

        for (Expense expense : expenses) {
            getSingleExpense(expense);
        }

        System.out.println("Meal expenses: " + mealExpenses);
        System.out.println("Total expenses: " + total);
    }

    private void getSingleExpense(Expense expense) {
        String expenseName = expense.getName();
        String mealOverExpensesMarker = expense.isOverLimit() ? "X" : " ";
        System.out.println(expenseName + "\t" + expense.getAmount() + "\t" + mealOverExpensesMarker);
    }

    private int getTotal(List<Expense> expenses) {
        int total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    private int getMealExpenses(List<Expense> expenses) {
        int mealExpenses = 0;
        for (Expense expense : expenses) {
            if (expense.isMeal()) {
                mealExpenses += expense.getAmount();
            }
        }
        return mealExpenses;
    }

    public void printReport(List<Expense> expenses) {
        printReport(expenses, new Date());
    }
}