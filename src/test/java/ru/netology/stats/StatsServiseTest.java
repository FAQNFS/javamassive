package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiseTest {

    @Test
    public void testSumOfAllSales() {
        StatsServise servise = new StatsServise();
        long[] sales = {15, 27, 39, 52, 44, 28, 27, 33, 7, 10, 15, 16};

        long actual = servise.sumOfAllSales(sales);
        long expected = 313;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSum() {
        StatsServise servise = new StatsServise();
        long[] sales = {15, 27, 39, 52, 44, 28, 27, 33, 7, 10, 15, 16};

        long actual = servise.averageSum(sales);
        long expected = 26;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxMonthSale() {
        StatsServise servise = new StatsServise();
        long[] sales = {15, 27, 39, 52, 44, 28, 27, 33, 7, 10, 15, 16};

        long actual = servise.maxMonthSale(sales);
        long expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinMonthSale() {
        StatsServise servise = new StatsServise();
        long[] sales = {15, 27, 39, 52, 44, 28, 27, 33, 7, 10, 15, 16};

        long actual = servise.minMonthSales(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthBelowAverageSales() {
        StatsServise servise = new StatsServise();
        long[] sales = {15, 27, 39, 52, 44, 28, 27, 33, 7, 10, 15, 16};

        long actual = servise.monthBelowAverageSales(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthAboveAverageSales() {
        StatsServise servise = new StatsServise();
        long[] sales = {15, 27, 39, 52, 44, 28, 27, 33, 7, 10, 15, 16};

        long actual = servise.monthAboveAverageSales(sales);
        long expected = 7;

        Assertions.assertEquals(expected, actual);
    }

}
