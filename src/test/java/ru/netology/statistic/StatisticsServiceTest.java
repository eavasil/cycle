package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {
    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();

        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(salesPerMonth);
        //сумма всех продаж

        assertEquals(expected, actual);
    }
    @Test
    void minSales() {
        // минимальное значение
        StatisticsService service = new StatisticsService();
        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(salesPerMonth);
        assertEquals(expected, actual);
    }
    @Test
    void maxSales() {
        // максимальное значение номер месяца
        StatisticsService service = new StatisticsService();
        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(salesPerMonth);
        assertEquals(expected, actual);
    }
    @Test
    void lessAverage() {
        // меньше среднего
        StatisticsService service = new StatisticsService();
        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.lessAverage(salesPerMonth);
        assertEquals(expected, actual);
    }
    @Test
    void moreAverage() {
        // больше среднего
        StatisticsService service = new StatisticsService();
        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.moreAverage(salesPerMonth);
        assertEquals(expected, actual);
    }
    @Test
    void findAverage() {
        // среднее значение
        StatisticsService service = new StatisticsService();
        long[] salesPerMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.findAverage(salesPerMonth);
        assertEquals(expected, actual);
    }
}