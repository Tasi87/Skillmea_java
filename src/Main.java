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
        /*
        // nepárne číslo = vyhráva, párne číslo = prehráva
        int hodeneCislo;
        Random nahodnyGenerator = new Random();
        System.out.println("Pre hodenie kockou stlač ENTER.");
        Scanner myScanner = new Scanner(System.in);
        myScanner.nextLine();

        hodeneCislo = nahodnyGenerator.nextInt(1, 7);
        System.out.println("Hodené číslo je: " + hodeneCislo);

        if (hodeneCislo % 2 == 1) {
            System.out.println("Nepárne číslo - Výhra!");
        } else {
            System.out.println("Párne číslo - Prehra!");
        }
        */
        /*
        // Switch - den v týždni

        Scanner myScanner = new Scanner(System.in);
        int cisloDna;
        System.out.println("Zadaj číslo dňa:");
        cisloDna = myScanner.nextInt();

        switch (cisloDna) {
            case 1:
                System.out.println("Je Pondelok");
                break;
            case 2:
                System.out.println("Je Utorok");
                break;
            case 3:
                System.out.println("Je Streda");
                break;
            case 4:
                System.out.println("Je Štvrtok");
                break;
            case 5:
                System.out.println("Je Piatok");
                break;
            case 6:
                System.out.println("Je Sobota");
                break;
            case 7:
                System.out.println("Je Nedeľa");
                break;
            default:
                System.out.println("Neplatné číslo dňa!");
        }
        */

        // Pole

        /*int[] znamky = new int[5];
        znamky[0] = 3;
        znamky[1] = 5;
        znamky[2] = 1;
        znamky[3] = 3;
        znamky[4] = 1;

        int[] znamky2 = new int[] {3, 5, 1, 3, 1};

        System.out.println(znamky[2]);
         */
        /*
        String[] mena = new String[] {"Peter", "Jan", "Katka", "Eva", "Jana"};
        mena[0] = "Linda";
        System.out.println(mena[0]);
        */

        // Slučky
        /*
        for(int i = 0; i < 10; i++) {
            //System.out.println(i * 5);
            if(i == 5) {
                // break;
                continue;
            }
            System.out.println(i);
        }
         */

        String[] mena = new String[] {"Peter", "Jan", "Katka", "Eva", "Jana"};

        for(int i = 0; i < mena.length; i++){
            System.out.println(mena[i]);
        }


    }
}