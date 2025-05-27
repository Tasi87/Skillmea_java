import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        String pozdrav = "Hello, world!";

        // Toto je pre vypísanie textu
        System.out.println(pozdrav);
        */
        /*
        int prveCislo = 10;
        int druheCislo = 5;

        prveCislo = druheCislo * 5;

        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo * druheCislo);
        System.out.println(prveCislo / druheCislo);
        */
        /*
        String greeting = "Ahoj";
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Zadaj svoje meno:");
        String name = myScanner.nextLine();
        System.out.println(greeting + ", " + name + "!");
        */
        // Kalkulačka
        float num1;
        float num2;
        Scanner myCal = new Scanner(System.in);
        System.out.println("Zadaj prvé číslo:");
        num1 = myCal.nextFloat();
        System.out.println("Zadaj druhé číslo: ");
        num2 = myCal.nextFloat();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    }
}