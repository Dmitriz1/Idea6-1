package ru.netology.stats;

public class StatsService {

    public long salesSum(long[] sales) {
        long salesSum = 0;
        for (int i = 0; i < 12; i++) {
            salesSum = salesSum + sales[i];
        }
        return salesSum;
    }

    public long avgSales(long[] sales, long salesSum) {
        long avgSales;
        avgSales = salesSum / 12;
        return avgSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int lesserThanAvg(long[] sales, long avgSales) {
        int count = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[i] < avgSales) {
                count++;
            }
        }
        return count;
    }

    public int higherThanAvg(long[] sales, long avgSales) {
        int count = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[i] > avgSales) {
                count++;
            }
        }
        return count;
    }
}
