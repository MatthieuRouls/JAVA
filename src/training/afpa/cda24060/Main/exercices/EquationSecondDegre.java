package training.afpa.cda24060.Main.exercices;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class EquationSecondDegre {
    public static void secondDegre(int a, int b, int c) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Saisir la valeur de a: ");
        a = scan.nextInt();
        System.out.println("Saisir la valeur de b: ");
        b = scan.nextInt();
        System.out.println("Saisir la valeur de c: ");
        c = scan.nextInt();

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
    public static void afficherPopUp () {
        JTextField aField = new JTextField(5);
        JTextField bField = new JTextField(5);
        JTextField cField = new JTextField(5);

        JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));
        panel.add(new JLabel("Valeur de a :"));
        panel.add(aField);
        panel.add(new JLabel("Valeur de b :"));
        panel.add(bField);
        panel.add(new JLabel("Valeur de c :"));
        panel.add(cField);

        int result = JOptionPane.showConfirmDialog(null, panel,
                "Entrer les coefficients de l'equation",JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            try {
                int a = Integer.parseInt(aField.getText());
                int b = Integer.parseInt(bField.getText());
                int c = Integer.parseInt(cField.getText());

                secondDegre(a, b, c);

            }   catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Merci d'entrer des nombres valides.","Erreur",JOptionPane.ERROR_MESSAGE);
            }   catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,"Le coefficient a ne peut pas etre zero.", "Erreur",JOptionPane.ERROR_MESSAGE);
            }
        }

    }
    public static void main (String[] args) {
        afficherPopUp();
    }
}
