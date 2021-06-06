package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        Investment x = new Investment();

        myApp.getInvestmentInfo(x);
        myApp.getWorth(x);
        myApp.printOutput(x);
    }

    public void printOutput(Investment x) {
        System.out.printf("$%.2f invested at %.1f%% for %d years compounded %d times per year is $%.2f.",
                x.principal, x.interest, x.years, x.compounds, x.worth);
    }

    public void getWorth(Investment x) {
        x.worth = x.principal * (Math.pow((1 + ((x.interest / 100) / x.compounds)), (x.compounds * x.years)));
    }

    public void getInvestmentInfo(Investment x) {
        System.out.printf("What is the principal amount: ");
        x.principal = Double.parseDouble(in.nextLine());

        System.out.printf("What is the rate? ");
        x.interest = Double.parseDouble(in.nextLine());

        System.out.printf("What is the number of years? ");
        x.years = Integer.parseInt(in.nextLine());

        System.out.printf("What is the number of times the interest is compounded per year? ");
        x.compounds = Integer.parseInt(in.nextLine());
    }
}