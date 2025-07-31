package training.afpa.cda24060.Main.exercices;

import java.util.Arrays;

public class Exo5_2 {

    public static int[] compterXX() {

        int i = 10;
        int[] tab = {1, 2, 3, 2, 4, 5, 6, 2, 3, 2};
        int[] tabOccurences = new int[i];
        Arrays.fill(tabOccurences, 0);

        for (i = 0; i < tab.length; i++) {
            int occurences = 0;
            int valeur = tab[i];
            for (int j = 0; j < tab.length; j++) {
                if (valeur == tab[j]) {
                    occurences = occurences + 1;
                }
            }
            tabOccurences[i] = occurences;
        }
    return tabOccurences;
    }
    public static void occuR() {
        // Tableau original
        int[] tab = {1, 2, 3, 2, 4, 5, 6, 2, 3, 2};

        // Appeler la méthode et récupérer le résultat
        int[] resultats = compterXX();

        // Afficher le tableau original
        System.out.println("Tableau original :");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        // Afficher les occurrences
        System.out.println("\nOccurrences :");
        for (int i = 0; i < resultats.length; i++) {
            if (resultats[i] > 0) { // Afficher seulement les nombres présents
                System.out.println("Nombre " + (i + 1) + " : " + resultats[i] + " occurrence(s)");
            }
        }
    }
}
