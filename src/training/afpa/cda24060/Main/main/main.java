package training.afpa.cda24060.Main.main;

import training.afpa.cda24060.Main.exercices.*;

import java.util.Scanner;

public class main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuer = true;

        while (continuer) {
            afficherMenu();
            int choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("\n=== EXERCICE 1: POMMES ET PANIERS ===");
                    PommesEtPaniers exo1 = new PommesEtPaniers();
                    exo1.pommesEtPaniers();
                    break;

                case 2:
                    System.out.println("\n=== EXERCICE 2: FACTORIELLE ===");
                    Factorielle f = new Factorielle();
                    f.factO();
                    break;

                case 3:
                    System.out.println("\n=== EXERCICE 3: DICHOTOMIE ===");
                    Dichotomie d = new Dichotomie();
                    d.dicho();
                    break;

                case 4:
                    System.out.println("\n=== EXERCICE 4: SECOND DEGRE ===");
                    EquationSecondDegre e = new EquationSecondDegre();
                    e.afficherPopUp();
                    break;

                case 5:
                    System.out.println("\n=== EXERCICE 4.1 ===");
                    Exo4_1 exo4 = new Exo4_1();
                    exo4.exo4();
                    break;

                case 6:
                    System.out.println("\n=== EXERCICE 4.2 ===");
                    Exo4_2 exo42 = new Exo4_2();
                    exo42.triInsert();
                    break;

                case 7:
                    System.out.println("\n=== EXERCICE 4.3 ===");
                    Exo4_3 exo43 = new Exo4_3();
                    exo43.dico1();
                    break;

                case 8:
                    System.out.println("\n=== EXERCICE 4.4 ===");
                    Exo4_4 exo44 = new Exo4_4();
                    exo44.maxResearch();
                    break;

                case 9:
                    System.out.println("\n=== EXERCICE 4.5 ===");
                    Exo5_1 exo51 = new Exo5_1();
                    exo51.compterX();
                    break;

                case 10:
                    System.out.println("\n=== EXERCICE 5.2 ===");
                    Exo5_2 exo52 = new Exo5_2();
                    exo52.occuR();
                    break;

                case 11:
                    System.out.println("\n=== EXERCICE 6: FACTORIELLE ===");
                    Exercice6 exercice6 = new Exercice6();
                    exercice6.tabFactorielle();
                    break;

                case 12:
                    System.out.println("\n=== EXERCICE 3 ===");
                    Exo3 exo3 = new Exo3();
                    exo3.main(args);
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Erreur ! Veuillez choisir un numero entre 0 et 12");
                    break;

            }

            if (continuer) {
                System.out.println("\n" + "=".repeat(50));
                System.out.print("Appuyez sur Entree pour revenir au menu.");
                sc.nextLine();
                sc.nextLine();
            }
        }

    }
    private static void afficherMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("        SELECTEUR D'EXERCICES");
        System.out.println("=".repeat(50));
        System.out.println("1. Pommes et Paniers");
        System.out.println("2. Factorielle");
        System.out.println("3. Dichotomie");
        System.out.println("4. Equation Second Degre");
        System.out.println("5. Exo4.1");
        System.out.println("6. Exo4.2 - Tri par Insertion");
        System.out.println("7. Exo4.3 - Dichotomie 2");
        System.out.println("8. Exo4.4 - Recherche Maximum");
        System.out.println("9. Exo5.1 - Compter X");
        System.out.println("10. Exo5.2 - Occurences");
        System.out.println("11. Exo6 - Table Factorielle");
        System.out.println("12. Exo3 - Analyse Tableau");
        System.out.println("=".repeat(50));
        System.out.println("0.  Quitter");
        System.out.println("=".repeat(50));
        System.out.println("Choisissez un exercice (0-12) : ");
    }
}
