package training.afpa.cda24060.Main.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Dichotomie {

    public static int binarySearchIterative(int[] sortedArray, int cle) {

        int gauche = 0;
        int droite = sortedArray.length - 1;
        while (gauche <= droite) {
            int milieu = (gauche + droite) / 2;
            if (sortedArray[milieu] == cle) {
                return milieu;
            }
            else if (sortedArray[milieu] > cle) {
                    droite = milieu - 1;
            }
            else {
                    gauche = milieu + 1;
            }
        }
        return -1;
    }
    public static void dicho() {

        int[] tableau = Create.arr1();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Valeur recherchee: ");
        int valeurRecherchee = scanner2.nextInt();
        int resultat = binarySearchIterative(tableau , valeurRecherchee);
        if (resultat != -1) {
            System.out.println("Trouve a l'index: " + resultat);
        } else {
            System.out.println("Non trouve");
        }
    }
}
