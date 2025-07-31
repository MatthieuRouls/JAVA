package training.afpa.cda24060.Main.exercices;

import java.util.Scanner;

public class Exercice6  {
    public static int calculFactorielle(int valeur) {

        int resultat = 1;

        for (int i = 1; i <= valeur; i++) {
            resultat = resultat * i;
        }
        return resultat;
    }

    public static void tabFactorielle() {

        Scanner sc = new Scanner(System.in);

        int resultat = 0;
        int x;
        int[][] tableauFact = new int[2][10];

        for (int i = 0; i < 10; i++) {
            tableauFact[0][i] = i + 1;
            tableauFact[1][i] = calculFactorielle(i + 1);
        }

        System.out.println("Pour quelle valeur souhaitez-vous calculer la factorielle ? (entre 1 et 10) :");
        x = sc.nextInt();

        if (x < 1 || x > 10) {
            System.out.println("x doit etre entre 1 et 10");
        }
        else {
            resultat = tableauFact[1][x - 1];
            System.out.println("La factorielle de " + x + " est " + resultat);
        }
    }
}
