package ru.netology.hw61;

import java.util.Arrays;

public class StatisticService {
    public int sumSale(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public int middleSumSaleInMonth(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int middleSumInMonth = sum / 12;
        return middleSumInMonth;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale > sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int amountMonthMinMiddleSale(int[] sales) {
        int middleSumInMonth = Arrays.stream(sales).sum() / 12;
        int amountMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale < middleSumInMonth) {
                amountMonth = amountMonth + 1;
            }
        }
        return amountMonth;
    }

    public int amountMonthMaxMiddleSale(int[] sales) {
        int middleSumInMonth = Arrays.stream(sales).sum() / 12;
        int amountMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale > middleSumInMonth) {
                amountMonth = amountMonth + 1;
            }
        }
        return amountMonth;
    }
}

