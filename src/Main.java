public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("    Task 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();


        //Task 2
        System.out.println("    Task 2");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println();


        //Task 3
        System.out.println("    Task 3");

        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        System.out.println();


        //Task 4
        System.out.println("    Task 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println();


        //Task 5
        System.out.println("    Task 5");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println();


        //Task 6
        System.out.println("    Task 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();


        //Task 7
        System.out.println("    Task 7");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();


        //Task 8
        System.out.println("    Task 8");

        int inMonth = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total += inMonth;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей %n", i, total);
        }

        System.out.println();


        //Task 9
        System.out.println("    Task 9");

        int inMonth2 = 29000;
        int total2 = 0;

        for (int i = 1; i <= 12; i++) {
            total2 += inMonth2 + inMonth2 * 0.01;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей %n", i, total2);
        }

        System.out.println();


        //Task 10
        System.out.println("    Task 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + i * 2);
        }



    }
}