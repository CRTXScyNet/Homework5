package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Task one
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Task two
        int yearOfManufacture = 2014;
        if (clientOS == 1) {
            if (yearOfManufacture >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if(clientOS == 0) {
            if (yearOfManufacture >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

        //Task three
        int year = 2000;
        if (year <= 1584) {
            System.out.println(year + " год не является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println(year + " год не является високосным");
            } else {
                System.out.println(year + " год является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Task four
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Свыше 100км доставка не осуществляется");
        }

        // Task five
        int monthNumber = 5;
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 1, 2, 12:
                    System.out.println(monthNumber + " месяц принадлежит зиме.");
                    break;
                case 3, 4, 5:
                    System.out.println(monthNumber + " месяц принадлежит весне.");
                    break;
                case 6, 7, 8:
                    System.out.println(monthNumber + " месяц принадлежит лету.");
                    break;
                case 9, 10, 11:
                    System.out.println(monthNumber + " месяц принадлежит осени.");
                    break;
            }
        } else {
            System.out.println("Такого месяца не существует");
        }
    }
}