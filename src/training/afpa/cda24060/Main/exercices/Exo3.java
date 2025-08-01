package training.afpa.cda24060.Main.exercices;

import java.util.Scanner;

public class Exo3 {
    private static final int TAILLE_MAX = 10;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] tableauEntiers = new int[TAILLE_MAX];

        System.out.println("=== REMPLISSAGE ET ANALYSE D'UN TABLEAU ===\n");

        // Saisie des valeurs par l'utilisateur
        remplirTableau(tableauEntiers);

        // Afficher le tableau
        afficherTableau(tableauEntiers);

        // Analyser le tableau
        analyserTableau(tableauEntiers);
    }

    public static void remplirTableau(int[] tableau) {
        System.out.println("Veuillez saisir " + TAILLE_MAX + " entiers (positifs, négatifs ou nuls) :");

        for (int i = 0; i < TAILLE_MAX; i++) {
            System.out.print("Entrez l'entier n°" + (i + 1) + " : ");
            tableau[i] = scanner.nextInt();
        }
        System.out.println();
    }


    public static void afficherTableau(int[] tableau) {
        System.out.println("=== CONTENU DU TABLEAU ===");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tableau[" + i + "] = " + tableau[i]);
        }
        System.out.println();
    }


    public static void analyserTableau(int[] tableau) {
        int nombrePositifs = 0;
        int sommePositifs = 0;
        int nombreNegatifs = 0;
        int sommeNegatifs = 0;
        int nombreNuls = 0;


        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > 0) {
                nombrePositifs++;
                sommePositifs += tableau[i];
            } else if (tableau[i] < 0) {
                nombreNegatifs++;
                sommeNegatifs += tableau[i];
            } else {
                nombreNuls++;
            }
        }


        double moyennePositifs = 0;
        double moyenneNegatifs = 0;

        if (nombrePositifs > 0) {
            moyennePositifs = (double) sommePositifs / nombrePositifs;
        }

        if (nombreNegatifs > 0) {
            moyenneNegatifs = (double) sommeNegatifs / nombreNegatifs;
        }


        System.out.println("=== ANALYSE DU TABLEAU ===");
        System.out.println("Nombre d'entiers positifs : " + nombrePositifs +
                (nombrePositifs > 0 ? " | Moyenne : " + String.format("%.2f", moyennePositifs) : ""));
        System.out.println("Nombre d'entiers négatifs : " + nombreNegatifs +
                (nombreNegatifs > 0 ? " | Moyenne : " + String.format("%.2f", moyenneNegatifs) : ""));
        System.out.println("Nombre de valeurs nulles : " + nombreNuls);


        System.out.println("\n=== DÉTAILS ===");
        if (nombrePositifs > 0) {
            System.out.println("Somme des positifs : " + sommePositifs);
        }
        if (nombreNegatifs > 0) {
            System.out.println("Somme des négatifs : " + sommeNegatifs);
        }

        int sommeTotal = sommePositifs + sommeNegatifs;
        double moyenneGenerale = (double) sommeTotal / tableau.length;
        System.out.println("Somme totale : " + sommeTotal);
        System.out.println("Moyenne générale : " + String.format("%.2f", moyenneGenerale));
    }
}