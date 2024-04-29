import java.util.*;

public class Main {

    public static double minMoneyExchange(double[] expenses) {
        double totalExpenses = 0;
        for (double expense : expenses) {
            totalExpenses += expense;
        }
        System.out.println(totalExpenses);

        double equalShare = totalExpenses / expenses.length;

        double moneyExchange = 0;
        for (double expense : expenses) {
            moneyExchange += Math.abs(expense - equalShare);
        }

        return moneyExchange;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of friends: ");
        int n = scanner.nextInt();

        double[] expenses = new double[n];
        System.out.print("Enter expenses:");
        for (int i = 0; i < n; ++i) {
            expenses[i] = scanner.nextDouble();
        }

        double minMoney = minMoneyExchange(expenses);
        System.out.println(Math.round(minMoney / 2 * 100) / 100);

        scanner.close();
    }
}
