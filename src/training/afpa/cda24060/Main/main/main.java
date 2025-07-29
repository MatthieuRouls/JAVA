package training.afpa.cda24060.Main.main;

import training.afpa.cda24060.Main.exercices.*;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        PommesEtPaniers exo1 = new PommesEtPaniers();
        exo1.pommesEtPaniers();

        Factorielle f = new Factorielle();
        f.factO();

        Dichotomie d = new Dichotomie();
        d.dicho();

        EquationSecondDegre e = new EquationSecondDegre();
        e.secondDegre();

    }

}
