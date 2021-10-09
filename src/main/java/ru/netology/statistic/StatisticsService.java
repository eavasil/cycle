package ru.netology.statistic;

public class StatisticsService {
    public long calculateSum(long[] salesPerMonth) {
        long sum = 0;
        for (long salesPerMonthes : salesPerMonth) {
            // аналог sum = sum + salesPerMonth;
            sum += salesPerMonthes;
        }
        return sum;
    }

    public int minSales(long[] salesPerMonth) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long salesPerMonthes : salesPerMonth) {
            // salesPerMonth[minMonth] - продажи в месяце minMonth
            // salesPerMonthes - продажи в рассматриваемом месяце
            if (salesPerMonthes <= salesPerMonth[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] salesPerMonth) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long salesPerMonthes : salesPerMonth) {
            // salesPerMonth[minMonth] - продажи в месяце minMonth
            // salesPerMonthes - продажи в рассматриваемом месяце
            if (salesPerMonthes >= salesPerMonth[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long findAverage(long[] salesPerMonth) {
        // поиск среднего значения
        long average = 0;
        long sum1 = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long salesPerMonthes : salesPerMonth) {
            sum1 += salesPerMonthes;
            month = month + 1;
            average = sum1 / month;
        }
        return average;
    }

    public long lessAverage(long[] salesPerMonth) {
        // меньше среднего значения
        long average = 0;
        long sum1 = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        int amountMonth = 0;
        for (long salesPerMonthes : salesPerMonth) {
            sum1 += salesPerMonthes;
            month = month + 1;
            average = sum1 / month;
        }
        for (long salesPerMonthes : salesPerMonth) {
            if (average > salesPerMonthes) {
                amountMonth = amountMonth + 1;
            }
        }
        return amountMonth;
    }

    public long moreAverage(long[] salesPerMonth) {
        // меньше среднего значения
        long average = 0;
        long sum1 = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        int amountMonth = 0;
        for (long salesPerMonthes : salesPerMonth) {
            sum1 += salesPerMonthes;
            month = month + 1;
            average = sum1 / month;
        }
        for (long salesPerMonthes : salesPerMonth) {
            if (average < salesPerMonthes) {
                amountMonth = amountMonth + 1;
            }
        }
        return amountMonth;
    }
}