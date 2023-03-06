package org.example.hw1;

// Развернуть строку, удалить лишние пробелы

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inp = scanner.nextLine();

        System.out.println(stringReverse(inp));
    }

    public static String stringReverse(String inputString) {
        String[] words = inputString.split("\\s+");
        String temp;

        for(int i = 0; i < words.length / 2; ++i) {
            temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }
        return String.join(" ", words);
    }
}
