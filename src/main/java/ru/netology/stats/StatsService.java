package ru.netology.stats;


public class StatsService {

    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSumAllSales(long[] sales) {

        return sumAllSales(sales) / 12;
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;

    }

    public int countMonthSalesBelowAverage(long[] sales) {
        int count = 0;
        long average = averageSumAllSales(sales);
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }

        }
        return count;

    }


    public int countMonthSalesAboveAverage(long[] sales) {
        int count = 0;
        long average = averageSumAllSales(sales);
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }

        }
        return count;

    }


}
