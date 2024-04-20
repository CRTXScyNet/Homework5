package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Task one
        boolean clientOS = true;
        if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Task two
        int yearOfManufacture = 2015;
        if (clientOS) {
            if (yearOfManufacture >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
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
        int monthNumber = 12;
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                case 2:
                    System.out.println(monthNumber + " месяц принадлежит зиме.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(monthNumber + " месяц принадлежит весне.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(monthNumber + " месяц принадлежит лету.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(monthNumber + " месяц принадлежит осени.");
                    break;
                case 12:
                    System.out.println(monthNumber + " месяц принадлежит зиме.");
                    break;
                default:
                    System.out.println("Такого месяца не существует");
            }
        }
    }
}