package com;

public class Main {

    public static void main(String[] args) {
        int a = 9;
        int b = 6;

        //Напишите программу, которая сравнивает два числа и пишет в консоль какое из этих чисел больше или меньше
        if (a > b) {

            System.out.println("a more b");
        } else if (a == b) {
            System.out.println("2 numbers are equal ");
        } else {
            System.out.println("b more a");
        }
        //Напишите программу, которая проверяет делится ли одно число на второе без остатка.
        // В случает если деление не целочисленное, то вывести в консоль сообщение о целой
        // части и об остатке от деления.

        int quotient = a / b;
        int remainder = a % b;
        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);

        //Задать число (от 0 до 9999) и вывести в консоль количество тысяч, сотен, десятков и единиц.
        int m = 333;
        if (m >0) {
            int units = m % 10;
            System.out.println("number of units " + units);
        }
        if (m > 10) {
            int tens = m / 10;
            System.out.println("number of tens " + tens);
        }
        if (m > 100) {
            int hundreds = m / 100;
            System.out.println("number of hundreds " + hundreds);
        }
        if (m > 1000) {
            int thousands = m / 1000;

            System.out.println("number of hundreds " + thousands);
        }

    }
}


