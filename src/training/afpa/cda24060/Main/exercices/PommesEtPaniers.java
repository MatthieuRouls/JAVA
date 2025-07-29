package training.afpa.cda24060.Main.exercices;

import java.util.Scanner;

public class PommesEtPaniers {
    public static void pommesEtPaniers() {
        Scanner scanner=new Scanner(System.in);

        int pommesRestantes;
        int panier = 3;
        int allersRetours = 0;

        System.out.println("Veuillez indiquer le nombre de pommes :");
        pommesRestantes =scanner.nextInt();

        while (pommesRestantes >= 0) {
            if (pommesRestantes >= 3) {
                allersRetours++;
                pommesRestantes = pommesRestantes - panier;
            }
            else {
                allersRetours++;
                break;
            }
        }

        System.out.println("Il faudra effectuer " + allersRetours + "  allers-retours");
    }
}
