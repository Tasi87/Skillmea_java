import java.util.Random;
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
        /*
        // Kalkulačka
        float num1;
        float num2;
        Scanner myCal = new Scanner(System.in);
        System.out.println("Zadaj prvé číslo:");
        num1 = myCal.nextFloat();
        System.out.println("Zadaj druhé číslo:");
        num2 = myCal.nextFloat();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        */
        /*
        Scanner mojScanner = new Scanner(System.in);
        System.out.println("Zadaj svoje slovo:");
        String word = mojScanner.nextLine();
        System.out.println(word.length());

        int cisloPorovnania = 5;
        System.out.println(cisloPorovnania > 0 && cisloPorovnania <= 8);
        System.out.println(cisloPorovnania > 8 || cisloPorovnania < 0);
        System.out.println(!(cisloPorovnania > 8 || cisloPorovnania < 0));
        System.out.println(!true);
        */
        /*
        // Feature pre kontrolu veku, či bude mať užívateľ viac ako 18 rokov
        int age;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Zadaj svoj vek:");
        age = myScanner.nextInt();

        if (age >= 18) {
            System.out.println("Užívateľ je dospelý.");
            if (age >= 65) {
                System.out.println("Užívateľ je senior.");
            }
        }  else if (age >=0 && age < 18) {
            System.out.println("Užívateľ nie je neplnoletý.");
        } else {
            System.out.println("Nejde zadať záporný vek");
        }
        */
        /*
        // Vypocet BMI (hmotnost/vyska)*2

        // Variables
        float vyska;
        float vaha;
        float bmi;

        // Scanner
        Scanner myScanner = new Scanner(System.in);

        // System Out
        System.out.println("Zadaj svoju výšku(m):");
        vyska = myScanner.nextFloat();
        System.out.println("Zadaj svoju váhu(kg):");
        vaha = myScanner.nextFloat();

        // Calculation
        bmi = vaha / (vyska * vyska);

        // Terms
        if (bmi < 18.5f) {
            System.out.println("Podváha");
        } else if (bmi >= 18.5f && bmi < 25) {
            System.out.println("Optimálna váha");
        } else if (bmi >= 25){
            System.out.println("Nadváha");
        }
        System.out.println(bmi);
       */

        // párne číslo = vyhráva, nepárne číslo = prehráva
        int hodeneCislo;
        Random nahodnyGenerator = new Random();



    }
}