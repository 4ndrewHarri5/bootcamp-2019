package com.manchesterDigital;

public class ImproveCarDealership {
    public static void main(String[] args) {

        boolean taxYearEnded = true;
        int baseSalary = 20000;
        int numberOfSales = 1000;
        double commissionRate = 3.0;

        calcSalary(taxYearEnded, numberOfSales, baseSalary, commissionRate);


        baseSalary = 300;
        numberOfSales = 25000;
        commissionRate = 2.0;

        calcSalary(taxYearEnded, numberOfSales, baseSalary, commissionRate);

    }

    private static void calcSalary(boolean taxYearEnded,
                                   int numberOfSales,
                                   double baseSalary,
                                   double commissionRate) {

        if (taxYearEnded) {
            int bonus = 1000;
            double totalSalary = baseSalary;

            if(numberOfSales > 500) {
                totalSalary = baseSalary + (numberOfSales * commissionRate);
                totalSalary += bonus;
            }

            System.out.println("Total salary is: £" + totalSalary);
        }



    }
}
