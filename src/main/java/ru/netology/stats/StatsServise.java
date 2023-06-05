package ru.netology.stats;
public class StatsServise {


    public long sumOfAllSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
           totalSale += sale;
        }
        return totalSale;
    }

    public long averageSum(long[] sales) {
        if (sales.length > 0) {
            return sumOfAllSales(sales) / sales.length;
        }
        return 0;
    }

    public int maxMonthSale(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public int minMonthSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthBelowAverageSales(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSum(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverageSales(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSum(sales)) {
                counter++;
            }
        }
        return counter;
    }

    }


