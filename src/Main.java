import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // task 1
        int yearsLeap = 2024;
        if (isYearsLeap(yearsLeap)) {
            System.out.println(yearsLeap + " високосный год");
        } else {
            System.out.println(yearsLeap + " не високосный год");
        }
        // task 2
        printVersion(1,2002);
    }
    public static boolean isYearsLeap (int yearsLeap) {
        return yearsLeap >= 1584 && yearsLeap % 4 == 0 && yearsLeap % 100 != 0 || yearsLeap % 400 == 0;
    }

    public static void printVersion (int os, int releaseYear) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0) {
            if (releaseYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (os == 1) {
            if (releaseYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Ваше устройство не поддерживается");
        }
        // task 3

        distance(60);
        distance(180);
        distance(87);
    }

    public static void distance (int deliveryDistance) {
        if (deliveryDistance >= 1 && deliveryDistance <= 20) {
            System.out.println("Доставка занимает сутки");
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60) {
            System.out.println("Доставка занимает двое суток");
        } else if (deliveryDistance >= 61 && deliveryDistance <= 100) {
            System.out.println("Доставка занимает трое суток");
        } else if (deliveryDistance <= 100) {
        } else {
            System.out.println("Доставки нет");
        }
    }
}