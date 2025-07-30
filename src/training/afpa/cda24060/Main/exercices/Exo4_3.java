package training.afpa.cda24060.Main.exercices;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class Exo4_3 {

    public static int[] newTab () {

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
    public static void dico1() {

        Scanner sc = new Scanner(System.in);

        int max;
        int min;
        int i;
        int valeurRecherchee;
        int[] dico = newTab();
        int flag = 0;

        System.out.println("Valeur a verifier ?");
        valeurRecherchee = sc.nextInt();

        max = dico.length - 1;
        min = 0;

    while (min <= max && flag == 0) {
        i = Math.floorDiv(max+min, 2);
        if (dico[i] == valeurRecherchee) {
            flag = 1;
            System.out.println("La valeur existe");
        } else  {
            if (dico[i] < valeurRecherchee) {
                min = i + 1;
            } else  {
                max = i - 1;
            }
        }
    }
    if (flag == 0) {
        System.out.println("La valeur n'existe pas");
    }

    }
}
