package ru.skypro;

import java.util.Arrays;

public class Main {
    public static void printYear(int year) {
        boolean yearIsLeap = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (yearIsLeap) {
            System.out.println(year + "  год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }

    public static void installVersion(int clientOS, int clientDeviceYear) {
        boolean isIosOldLite = (clientOS == 1 && clientDeviceYear < 2015);
        boolean isAndroidOldLite = (clientOS == 0 && clientDeviceYear < 2015);
        boolean isIos = (clientOS == 1 && clientDeviceYear > 2015);
        boolean isAndroid = (clientOS == 0 && clientDeviceYear > 2015);

        if (isIosOldLite) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (isIos) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (isAndroidOldLite) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static int calculatedeliveryDistance(int deliveryDistance) {
        int result = 1;
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60) {
            result++;
        }
        if (deliveryDistance >= 100) {
            result++;
        }
        return result;
    }

    public static void findDuplicates(String text) {
        char[] setLetters = text.toCharArray();
        String resultText = "";

        for (int i = 0; i < setLetters.length - 1; i++) {
            for (int j = i + 1; j < setLetters.length; j++) {


                if (setLetters[i] != setLetters[j]) {
                    resultText = "Дублей нет";
                } else {
                    System.out.println("Найден дубль " + setLetters[j]);
                    return;
                }
            }
        }

        System.out.println(resultText);
    }

    public static void flippingArray(int[] array) {
        int beginningArray = 0;
        int endingArray = array.length - 1;
        while (beginningArray < endingArray) {
            int temporaryArray = array[beginningArray];
            array[beginningArray++] = array[endingArray];
            array[endingArray--] = temporaryArray;
        }
    }


    public static void main(String[] args) {

        // -------------------------------------- Задача 1

        printYear(2001);

        // -------------------------------------- Задача 2

        installVersion(1, 2013);

        // -------------------------------------- Задача 3

        System.out.println("Потребуется " + calculatedeliveryDistance(79) + " дня");


        // -------------------------------------- Задача 4

        findDuplicates("aabccddefgghiijjkk");

        // -------------------------------------- Задача 5


        int[] givenArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        flippingArray(givenArray);
        System.out.println("Массив в обратном порядке " + Arrays.toString(givenArray));
    }

}



