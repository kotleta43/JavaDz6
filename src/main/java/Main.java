import static ru.netology.javaqa.javaqamvn.service.MonthlySales.*;


public class Main {
    public static void main(String[] args) {
        int[] monthlySales = {2, 15, 13, 15, 17, 20, 19, 5, 7, 14, 14, 18};

        int totalSales = calcMonthlySales(monthlySales);
        double averageSales = calcAverageSales(monthlySales);
        int belowAverageMonths = countMonthsBelowAverage(monthlySales);
        int aboveAverageMonths = countMonthsAboveAverage(monthlySales);
        int monthWithMaxSales = findMonthWithMaxSales(monthlySales);
        int monthWithMinSales = findMonthWithMinSales(monthlySales);

        System.out.println("Сумма всех продаж: " + totalSales);
        System.out.println("Средняя сумма продаж в месяц: " + averageSales);
        System.out.println("Количество месяцев с продажами ниже среднего: " + belowAverageMonths);
        System.out.println("Количество месяцев с продажами выше среднего: " + aboveAverageMonths);
        System.out.println("Месяц с максимальными продажами: " + monthWithMaxSales);
        System.out.println("Месяц с минимальными продажами: " + monthWithMinSales);
    }
}