import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void ShouldSumCorrectly() {
        StatsService salesSum = new StatsService();
        long expectedSum = 180;
        long actual = salesSum.salesSum(sales);
        Assertions.assertEquals(expectedSum, actual);
    }

    @Test
    void ShouldCountAvgCorrectly() {
        StatsService countAvg = new StatsService();
        long salesSum = 180;
        long expectedAvg = 15;
        long actual = countAvg.avgSales(sales, salesSum);
        Assertions.assertEquals(expectedAvg, actual);
    }

    @Test
    void ShouldFindMaxCorrectly() {
        StatsService maxSales = new StatsService();
        long expectedNumber = 8;
        long actual = maxSales.maxSales(sales);
        Assertions.assertEquals(expectedNumber, actual);
    }

    @Test
    void ShouldFindMinCorrectly() {
        StatsService minSales = new StatsService();
        long expectedNumber = 9;
        long actual = minSales.minSales(sales);
        Assertions.assertEquals(expectedNumber, actual);
    }

    @Test
    void ShouldFindLesserThanAvgSalesCorrectly() {
        StatsService lesserThanAvg = new StatsService();
        long avg = 15;
        long expectedCount = 5;
        long actual = lesserThanAvg.lesserThanAvg(sales, avg);
        Assertions.assertEquals(expectedCount, actual);
    }

    @Test
    void ShouldFindHigherThanAvgSalesCorrectly() {
        StatsService lesserThanAvg = new StatsService();
        long avg = 15;
        long expectedCount = 5;
        long actual = lesserThanAvg.lesserThanAvg(sales, avg);
        Assertions.assertEquals(expectedCount, actual);
    }
}
