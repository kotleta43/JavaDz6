
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.netology.javaqa.javaqamvn.service.MonthlySales.*;

public class SalesAnalyzerTest {

    @Test
    public void testCalculateTotalSales() {
        int[] monthlySales = {2, 15, 13, 15, 17, 20, 19, 5, 7, 14, 14, 18};
        int expectedTotalSales = 159;
        int actualTotalSales = calcMonthlySales(monthlySales);

        assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    public void testCalcAverageSales() {
        int[] monthlySales = {2, 15, 13, 15, 17, 20, 19, 5, 7, 14, 14, 18};
        double expectedAverageSales = 13.25;
        double actualAverageSales = calcAverageSales(monthlySales);
        assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void testCountMonthsBelowAverage() {
        int[] monthlySales = {2, 15, 13, 15, 17, 20, 19, 5, 7, 14, 14, 18};
        double averageSales = calcAverageSales(monthlySales);
        int expectedBelowAverageMonths = 4;
        int actualBelowAverageMonths = countMonthsBelowAverage(monthlySales);
        assertEquals(expectedBelowAverageMonths, actualBelowAverageMonths);
    }

    @Test
    public void testCountMonthsAboveAverage() {
        int[] monthlySales = {2, 15, 13, 15, 17, 20, 19, 5, 7, 14, 14, 18};
        double averageSales = calcAverageSales(monthlySales);
        int expectedAboveAverageMonths = 8;
        int actualAboveAverageMonths = countMonthsAboveAverage(monthlySales);
        assertEquals(expectedAboveAverageMonths, actualAboveAverageMonths);
    }

    @Test
    public void testFindMonthWithMaxSales() {
        int[] monthlySales = {2, 15, 13, 15, 17, 20, 19, 5, 7, 14, 14, 18};
        int expectedAboveAverageMonths = 6;
        int actualAboveAverageMonths = findMonthWithMaxSales(monthlySales);
        assertEquals(expectedAboveAverageMonths, actualAboveAverageMonths);
    }

    @Test
    public void testFindMonthWithMinSales() {
        int[] monthlySales = {2, 15, 13, 15, 17, 20, 19, 5, 7, 14, 14, 18};
        int expectedAboveAverageMonths = 1;
        int actualAboveAverageMonths = findMonthWithMinSales(monthlySales);
        assertEquals(expectedAboveAverageMonths, actualAboveAverageMonths);
    }
}