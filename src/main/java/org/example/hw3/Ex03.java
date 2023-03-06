package org.example.hw3;

import java.util.Scanner;

// Вернуть сумму двух двоичных чисел(строки) как двоичную строку.
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое слагаемое: ");
        String a = scanner.nextLine();
        System.out.print("Введите второе слагаемое: ");
        String b = scanner.nextLine();

        System.out.println(sumOfBinary(a, b));
    }

    public static String sumOfBinary(String firstNumber, String secondNumber) {
        String shortNum, longNum, topSum="";
        int dec = 0;

        if (firstNumber.length() < secondNumber.length()) {
            shortNum = firstNumber;
            longNum = secondNumber;
        } else {
            shortNum = secondNumber;
            longNum = firstNumber;
        }

        for(int i = shortNum.length(); i < longNum.length(); ++i)
            shortNum = '0' + shortNum;

        for(int i =longNum.length()-1; i >= 0; --i) {
            if ((longNum.charAt(i) == '0') && (shortNum.charAt(i) == '0')) {
                if (dec == 1) {
                    topSum = '1' + topSum;
                    dec = 0;
                } else
                    topSum = '0' + topSum;
            } else if ((longNum.charAt(i) == '1') && (shortNum.charAt(i) == '1')) {
                if (dec == 1)
                    topSum = '1' + topSum;
                else {
                    topSum = '0' + topSum;
                    dec = 1;
                }
            } else {
                if (dec == 1)
                    topSum = '0' + topSum;
                else
                    topSum = '1' + topSum;
            }
        }
        if(dec == 1)
            topSum = '1' + topSum;
        return topSum;
    }
}
