package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {
    @Test
    public void testSum() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = 180 / 12;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMaxSale() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxSaleMonth(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMinSale() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minSaleMonth(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testBelowAverage() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.salesBellowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testHigherAverage() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.salesHigherAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}