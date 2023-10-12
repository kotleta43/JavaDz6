import static ru.netology.javaqa.javaqamvn.service.MonthlySales.calcAverageSales;
import static ru.netology.javaqa.javaqamvn.service.MonthlySales.calcMonthlySales;
import static ru.netology.javaqa.javaqamvn.service.MonthlySales.countMonthsBelowAverage;
import static ru.netology.javaqa.javaqamvn.service.MonthlySales.countMonthsAboveAverage;


public class Main {
    public static void main(String[] args) {
        int[] monthlySales = {2, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int totalSales = calcMonthlySales(monthlySales);
        double averageSales = calcAverageSales(monthlySales);
        int belowAverageMonths = countMonthsBelowAverage(monthlySales, averageSales);
        int aboveAverageMonths = countMonthsAboveAverage(monthlySales, averageSales);

        System.out.println("Сумма всех продаж: " + totalSales);
        System.out.println("Средняя сумма продаж в месяц: " + averageSales);
        System.out.println("Количество месяцев с продажами ниже среднего: " + belowAverageMonths);
        System.out.println("Количество месяцев с продажами выше среднего: " + aboveAverageMonths);
    }
}