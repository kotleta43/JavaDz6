package ru.netology.javaqa.javaqamvn.service;

public class MonthlySales {

    public static int calcMonthlySales(int[] monthlySales) {
        int totalSales = 0;

        for (int sales : monthlySales) {
            totalSales += sales;
        }

        return totalSales;
    }

    public static double calcAverageSales(int[] monthlySales) {
        int totalSales = calcMonthlySales(monthlySales);
        double averageSales = (double) totalSales / monthlySales.length;

        return averageSales;
    }

    public static int countMonthsBelowAverage(int[] monthlySales, double averageSales) {
        int belowAverageMonths = 0;
        for (int sales : monthlySales) {
            if (sales < averageSales) {
                belowAverageMonths++;
            }
        }
        return belowAverageMonths;
    }

    public static int countMonthsAboveAverage(int[] monthlySales, double averageSales) {
        int aboveAverageMonths = 0;
        for (int sales : monthlySales) {
            if (sales > averageSales) {
                aboveAverageMonths++;
            }
        }
        return aboveAverageMonths;
    }
}