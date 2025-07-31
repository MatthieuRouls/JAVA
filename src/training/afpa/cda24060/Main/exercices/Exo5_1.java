package training.afpa.cda24060.Main.exercices;

import java.util.*;

public class Exo5_1 {


    public static int[] newTab2() {

        int[] tab = {10, 20, 30, 20, 40, 50, 60, 20, 30, 20};
        return tab;
    }
/*      //Si on veut generer un tableau d'entier aleatoires et uniques
        int i = 10;
        int[] tab = new int[i];
        Set<Integer> alreadyUsed = new HashSet<>();
        Random rand = new Random();

        int j = 0;
        while (j < i) {
            int num = rand.nextInt(100);
            if (!alreadyUsed.contains(num)) {
                tab[j] = num;
                alreadyUsed.add(num);
                j++;
            }
        }
        Arrays.sort(tab);
        System.out.println("Tableau original: " + Arrays.toString(tab));
        return tab;
    }
*/
    public static void compterX() {

        Scanner sc = new Scanner(System.in);

        int occurences = 0;
        int x;
        int i;
        int[] tableau = newTab2();

        System.out.println("Nombre a rechercher entre 0 et 100: ");
        x = sc.nextInt();

        for (i = 0; i < tableau.length; i++) {
            if (tableau[i] == x) {
                occurences = occurences+1;
            }
        }
        System.out.print(x + " : " + occurences + " occurence(s)");
    }
}
