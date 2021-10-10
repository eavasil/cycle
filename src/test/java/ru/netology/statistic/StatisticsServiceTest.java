package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {
    @Test
    void calculateSum() {
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();

        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(salesPerMonth);

        assertEquals(expected, actual);
    }
    @Test
    void minSales() {
        // минимальное значение
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();
        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(salesPerMonth);
        assertEquals(expected, actual);
    }
    @Test
    void maxSales() {
        // максимальное значение номер месяца
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();
        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(salesPerMonth);
        assertEquals(expected, actual);
    }
    @Test
    void lessAverage() {
        // меньше среднего
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();
        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.lessAverage(salesPerMonth);
        assertEquals(expected, actual);
    }
    @Test
    void moreAverage() {
        // больше среднего
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();
        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.moreAverage(salesPerMonth);
        assertEquals(expected, actual);
    }
    @Test
    void findAverage() {
        // среднее значение
        ru.netology.statistic.StatisticsService service = new ru.netology.statistic.StatisticsService();
        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.findAverage(salesPerMonth);
        assertEquals(expected, actual);
    }
}