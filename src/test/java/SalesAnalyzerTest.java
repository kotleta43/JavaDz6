
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.netology.javaqa.javaqamvn.service.MonthlySales.*;

public class SalesAnalyzerTest {

    @Test
    public void testCalculateTotalSales() {
        int[] monthlySales = {2, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedTotalSales = 174;
        int actualTotalSales = calcMonthlySales(monthlySales);

        assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    public void testCalcAverageSales() {
        int[] monthlySales = {2, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedAverageSales = 14.5;
        double actualAverageSales = calcAverageSales(monthlySales);
        assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void testCountMonthsBelowAverage() {
        int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double averageSales = 14.5;
        int expectedBelowAverageMonths = 5;
        int actualBelowAverageMonths = countMonthsBelowAverage(monthlySales, averageSales);
        assertEquals(expectedBelowAverageMonths, actualBelowAverageMonths);
    }

    @Test
    public void testCountMonthsAboveAverage() {
        int[] monthlySales = {2, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double averageSales = 14.5;
        int expectedAboveAverageMonths = 7;
        int actualAboveAverageMonths = countMonthsAboveAverage(monthlySales, averageSales);
        assertEquals(expectedAboveAverageMonths, actualAboveAverageMonths);
    }
}
