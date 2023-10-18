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

    public static int countMonthsBelowAverage(int[] monthlySales) {
        double averageSales = calcAverageSales(monthlySales);
        int belowAverageMonths = 0;
        for (int sales : monthlySales) {
            if (sales < averageSales) {
                belowAverageMonths++;
            }
        }
        return belowAverageMonths;
    }

    public static int countMonthsAboveAverage(int[] monthlySales) {
        double averageSales = calcAverageSales(monthlySales);
        int aboveAverageMonths = 0;
        for (int sales : monthlySales) {
            if (sales > averageSales) {
                aboveAverageMonths++;
            }
        }
        return aboveAverageMonths;
    }

    public static int findMonthWithMaxSales(int[] monthlySales) {
        int maxSales = monthlySales[0];
        int month = 0;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] > maxSales) {
                maxSales = monthlySales[i];
                month = i;
            }
        }
        return month + 1;
    }

    public static int findMonthWithMinSales(int[] monthlySales) {
        int minSales = monthlySales[0];
        int month = 0;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] < minSales) {
                minSales = monthlySales[i];
                month = i;
            }
        }
        return month + 1;
    }
}