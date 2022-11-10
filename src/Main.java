public class Main {
    public static void main(String[] args) {


        System.out.println("Задание № 1");

        System.out.println("Задача № 1");
        for (int i = 1; i < 11; i++) {
            System.out.println("Номер " + i);
        }

        System.out.println("Задача № 2");
        for (int i = 10; i > 0; i--) {
            System.out.println("Номер " + i);
        }

        System.out.println("Задача № 3 1");
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0)
                System.out.println("Номер " + i);
        }

        System.out.println("Задача № 3 2");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Номер " + i);
        }

        System.out.println("Задача № 4");
        for (int i = 10; i > -11; i--) {
            System.out.println("Номер " + i);
        }


        System.out.println("Задание № 2");

        System.out.println("Задача № 1");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
        }

        System.out.println("Задача № 2");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println("_");

        System.out.println("Задача № 3");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println("_");


        System.out.println("Задание № 3");

        System.out.println("Задача № 1");
        int money = 29000;
        int annualSavings = 0;

        for (int i = 1; i < 13; i++) {
            annualSavings = annualSavings + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + annualSavings + " рублей");
        }

        System.out.println("Задача № 2");
        int moneySum = 29000;
        int annualSavingsInterest = 0;

        for (int i = 1; i < 13; i++) {
            annualSavingsInterest = annualSavingsInterest + annualSavingsInterest / 100;
            annualSavingsInterest = annualSavingsInterest + moneySum;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + annualSavingsInterest + " рублей");
        }
    }
}