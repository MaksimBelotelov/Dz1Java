package org.example.hw2;

import java.util.Scanner;

// Дана последовательность целых чисел, оканчивающаяся нулем.
// Найти сумму положительных чисел, после которых следует
// отрицательное число.

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = 0, previousNumber = 0, summa = 0;

        System.out.println("Введите числа через пробел.\n" +
                "Для окончания введите \"0\"");
        do {
            currentNumber = scanner.nextInt();
            if((currentNumber < 0) && (previousNumber > 0))
                summa += previousNumber;
            previousNumber = currentNumber;
        } while(currentNumber != 0);

        System.out.printf("Сумма равна: %d", summa);
    }
}
