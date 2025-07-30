package training.afpa.cda24060.Main.exercices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exo4_4 {
    public static int[][] newTab2() {

        int lignes = 5;
        int colonnes = 5;
        int[][] tab = new int[lignes][colonnes];
        Set<Integer> alreadyUsed = new HashSet<>();
        Random rand = new Random();

        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                int num;
                do {
                    num = rand.nextInt(25);
                } while (alreadyUsed.contains(num));

                tab[i][j] = num;
                alreadyUsed.add(num);
            }
        }
        for (int i = 0; i < lignes; i++) {
            System.out.println(Arrays.toString(tab[i]));
        }
        return tab;
    }

    public static void maxResearch() {
        int i;
        int j;
        int iMax = 1;
        int jMax = 1;
        int[][] tab = newTab2();

        for (i = 0; i < tab.length; i++) {
            for (j = 0; j < tab.length; j++) {
                if (tab[i][j] > tab[iMax][jMax]) {
                    iMax = i;
                    jMax = j;
                }
            }
        }
        System.out.println("Le plus grand element est : " + tab[iMax][jMax]);
        System.out.println("Il se trouve aux indices : " + iMax + "/" + jMax);
    }

}

