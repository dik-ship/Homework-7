//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int salary = 15000;
        int total = 0;
        int i = 0;
        while ( total < 2_459_000) {
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        int y = 0;
        while ( y < 10 ) {
            y = y + 1;
            System.out.print(y + " ");
        }
        System.out.println();
        for (int t = 10; t > 0; t--) {
            System.out.print( t + " ");
        }
        System.out.println();
        int currentYear = 2024;
        int people = 12_000_000;
        int human = 1000;
        int birthrate = 17;
        int fatality = 8;
        int year = 10;
        for (int l = 1; l <= year; l++) {
            int newBirths = people * birthrate / 1000;
            int deaths = people * fatality / 1000;
            people = people + newBirths - deaths;
            System.out.println("Год " + l + ", численность населения составляет " + people);
        }
        int deposit = 15_000;
        int depositFinal = 12_000_000;
        double capital = 0.07;
        int month = 0;
        while (deposit < depositFinal) {
            deposit += deposit * capital;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }
        deposit = 15_000;
        depositFinal = 12_000_000;
        capital = 0.07;
        month = 0;
        while (deposit < depositFinal) {
            deposit += deposit * capital;
            month++;
            if (i % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println("Задача 7");
        int firstFriday = 5;
        for (int day = firstFriday; day < 31; day += 7) {
            System.out.println("Сегодня пятница " + day + "-е. Необходимо подготовить отчет");
        }
        System.out.println("Задача 8");
        int period = 79;
        int startSeeing = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int yearLife = startSeeing; yearLife < end; yearLife+=period) {
            if (yearLife > start ) {
                System.out.println(yearLife);
            }
        }
    }
}