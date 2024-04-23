import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // task 1
        int leapYears = 2024;
        if (isYearsLeap(leapYears)) {
            System.out.println(leapYears + " високосный год");
        } else {
            System.out.println(leapYears + " не високосный год");
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

        int distance = 94;
        int deliveryDays = calculateSum(distance);
        if (deliveryDays >= 0 && deliveryDays <= 3) {
            System.out.println("Доставка занимает " + deliveryDays + " дня");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static int calculateSum (int deliveryDistance) {
        if (deliveryDistance >= 1 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance >= 61 && deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}