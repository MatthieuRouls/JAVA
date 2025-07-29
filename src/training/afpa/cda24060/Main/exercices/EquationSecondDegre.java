package training.afpa.cda24060.Main.exercices;

import java.util.Scanner;

public class EquationSecondDegre {
    public static void secondDegre() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Saisir la valeur de a: ");
        int a = scan.nextInt();
        System.out.println("Saisir la valeur de b: ");
        int b = scan.nextInt();
        System.out.println("Saisir la valeur de c: ");
        int c = scan.nextInt();

        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println("Il m'y a pas de solution pour cette equation");
        } else if (delta == 0) {
            int resultat = -b/(2*a);
            System.out.println("Il ya une solution pour cette equation");
            System.out.println(resultat);
        } else {
            System.out.println("Il y a 2 solutions pour cette equation");
            double resultat2 = -b+(Math.sqrt(delta)/2*a);
            System.out.println(resultat2);
            double resultat3 = -b-(Math.sqrt(delta)/2*a);
            System.out.println(resultat3);}
    }
}
