package training.afpa.cda24060.Main.exercices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exo4_2 {
    public static int[] initTab () {

        int i = 10;
        int[] tab = new int[i];
        Set<Integer> alreadyUsed = new HashSet<>();
        Random random = new Random();

        int j = 0;
        while (j < i) {
            int num = random.nextInt(100);
            if (!alreadyUsed.contains(num)) {
                tab[j] = num;
                alreadyUsed.add(num);
                j++;
            }
        }
        System.out.println("Tableau original: " + Arrays.toString(tab));
        return tab;
    }

    public static void triInsert (){

        int[] tab = initTab();
        int cle;
        int j;

        for (int i = 1; i < tab.length; i++) {
            cle = tab[i];
            j = i - 1;
            while  (j >= 0 && tab[j] > cle) {
                tab[j+1] = tab[j];
                j = j - 1;
            }
            tab[j+1] = cle;
        }
        System.out.println("Tableau trie: " + Arrays.toString(tab));
    }
}
