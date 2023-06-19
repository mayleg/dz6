package ru.netology.stats;
public class StatisticService {
    public long sum(long [] sales) {
        long allSale = 0;
        for (long sale : sales) {
            allSale += sale;
        }
        return allSale;
    }

    public long average(long[] sales) {
        long allSale = 0;
        for (long sale : sales) {
            allSale += sale;
        }
        long averageSale = allSale / 12;
        return averageSale;
    }
    public int maxSaleMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }
    public int minSaleMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }
    public int salesBellowAverage(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                result++;
            }
        }
        return result;
    }
    public int salesHigherAverage(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                result++;
            }
        }
        return result;
    }

}