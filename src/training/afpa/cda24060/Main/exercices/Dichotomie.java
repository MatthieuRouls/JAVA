package training.afpa.cda24060.Main.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Dichotomie {

    public static int binarySearchIterative(int[] sortedArray, int key) {

        int leftIdx = 0;
        int rightIdx = sortedArray.length - 1;
        while (leftIdx <= rightIdx) {
            int midIdx = (leftIdx + rightIdx) / 2;
            if (sortedArray[midIdx] == key) {
                return midIdx;
            }
            else if (sortedArray[midIdx] > key) {
                    rightIdx = midIdx - 1;
            }
            else {
                    leftIdx = midIdx + 1;
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
