package cop2805;

public class module1 {
    //Accepting sales amount for a month resulted a return income in double function
    public static double computeIncome(double sales) {
        // initializing income with 5000 base salary of 
        double income = 5000;

        // until sales becomes 0
        while (sales != 0) {
            // determining which tier sales belongs to and update income accordingly
            if (sales <= 5000) {
                // tier one - commission of 8 %
                income += sales * 0.08;
                sales -= sales;
            } else if (sales > 5000 && sales <= 10000) {
                // tier two - commission of 10 %
                income += (sales - 5000) * 0.1;
                sales -= (sales - 5000);
            } else if (sales > 10000) {
                // tier three - commission of 12 %
                income += (sales - 10000) * 0.12;
                sales -= (sales - 10000);
            }
        }

        // return the income amount
        return income;
    }

    public static void main(String[] args) {

        double sales = 1000;

        System.out.println("Sales\t\tIncome");

        for (int i = 0; i < 20; ++i) {
            System.out.printf("$%.2f\t", sales);
            System.out.printf("$%.2f", computeIncome(sales));


            System.out.println();

            // increment sales 1000 everytime
            sales += 1000;
        }


    }

}