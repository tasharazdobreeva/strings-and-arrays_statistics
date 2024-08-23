
package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSale(long[] sales) {
        return sumSales(sales) / 12;
    }

    public int monthMaximumSale(long[] sales) {
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMaximum] <= sales[i]) {
                monthMaximum = i;
            }
            
        }
        return monthMaximum + 1;
    }

    public int monthMinimumSale(long[] sales) {
        int monthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMinimum] >= sales[i]) {
                monthMinimum = i;
            }

        }
        return monthMinimum + 1;
    }

    public int mothsBelowAverage(long[] sales) {
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;

            }
            
        }
        return counter;

    }

    public int mothsAboveAverage(long[] sales) {
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale > average) {
                counter++;

            }

        }
        return counter;
    }
}
