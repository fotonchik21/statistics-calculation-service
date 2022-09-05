import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class MainTests {

    @Test
    public void testTotalSum() {
        StatsService service = new StatsService();
        long[] salesByMonth = {9, 200, 144, 2, 15, 6, 9, 30, 21, 27, 19, 25, 96};
        long sumExpected = 603;
        long actualSum = service.totalSum(salesByMonth);
        Assertions.assertEquals(sumExpected, actualSum);
    }

    @Test
    public void testAverageSum() {
        StatsService service = new StatsService();
        long[] salesByMonth = {9, 200, 144, 2, 15, 6, 9, 30, 21, 27, 19, 25, 96};
        long expected = 46;
        long actual = service.averageSum(salesByMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSales() {
        StatsService service = new StatsService();
        long[] salesByMonth = {9, 200, 144, 2, 15, 6, 9, 30, 21, 27, 19, 25, 96};
        long expected = 2;
        long actual = service.maxSales(salesByMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSales() {
        StatsService service = new StatsService();
        long[] salesByMonth = {9, 200, 144, 2, 15, 6, 9, 30, 21, 27, 19, 25, 96};
        long expected = 4;
        long actual = service.minSales(salesByMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthLowerAverageSum() {
        StatsService service = new StatsService();
        long[] salesByMonth = {9, 200, 144, 2, 15, 6, 9, 30, 21, 27, 19, 25, 96};
        long expected = 10;
        long actual = service.monthLowerAverageSum(salesByMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthUpperAverageSum() {
        StatsService service = new StatsService();
        long[] salesByMonth = {9, 200, 144, 2, 15, 6, 9, 30, 21, 27, 19, 25, 96};
        long expected = 3;
        long actual = service.monthUpperAverageSum(salesByMonth);
        Assertions.assertEquals(expected, actual);
    }
}