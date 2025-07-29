package training.afpa.cda24060.Main.exercices;

import java.util.Scanner;

public class Factorielle {
    public static void factO () {
        Scanner scanner1 = new Scanner(System.in);

        int i = 1;
        int somme = 1;

        System.out.println("Veuillez entrer un nombre a factoriser: ");
        int j = scanner1.nextInt();

        while (i <= j) {
            somme = somme * i;
            i=i+1;
        }

        System.out.println("La somme avec tant que est: ");
        System.out.println(somme);

    }
}
