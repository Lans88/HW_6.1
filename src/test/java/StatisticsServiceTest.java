import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.hw61.StatisticService;

public class StatisticsServiceTest {
    @Test
    public void sumSaleTest() {
        StatisticService service = new StatisticService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        int actual = service.sumSale(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void middleSumSaleTest() {
        StatisticService service = new StatisticService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;
        int actual = service.middleSumSaleInMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        StatisticService service = new StatisticService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 6;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        StatisticService service = new StatisticService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountMonthMinMiddleSale() {
        StatisticService service = new StatisticService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.amountMonthMinMiddleSale(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void amountMonthMaxMiddleSale() {
        StatisticService service = new StatisticService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.amountMonthMaxMiddleSale(sales);
        Assertions.assertEquals(expected, actual);
    }
}
