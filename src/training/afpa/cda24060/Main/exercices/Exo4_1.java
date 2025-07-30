package training.afpa.cda24060.Main.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Exo4_1 {
    public static void exo4 () {
        Scanner sc = new Scanner(System.in);

        int i;
        int resultat = 0;
        int[] tab = new int[5];

        System.out.println("Entrez une note :");

        for(i = 0; i < tab.length; i++) {
            System.out.println("Valeur :" + (i + 1) + " : ");
            tab[i] = sc.nextInt();
        }

        System.out.println("\nVotre tableau :");
        for(i = 0; i < tab.length; i++) {
            System.out.println("Note[" + i + "] : " + tab[i]);
        }

        int somme = 0;
        for(i = 0; i < tab.length; i++) {
            somme = somme + tab[i];
        }
        System.out.println("La moyenne est : " + somme/ tab.length);
    }

}
