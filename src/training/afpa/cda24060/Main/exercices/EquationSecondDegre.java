package training.afpa.cda24060.Main.exercices;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class EquationSecondDegre {
    public static void secondDegre(int a, int b, int c) {

        double delta = b * b - 4 * a * c;

        String resultat = "Équation : " + a + "x² + " + b + "x + " + c + " = 0\n\n";

        if (delta > 0) {
            // Deux solutions réelles distinctes
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            resultat += "Delta = " + delta + " > 0\n";
            resultat += "Deux solutions réelles :\n";
            resultat += "x1 = " + String.format("%.2f", x1) + "\n";
            resultat += "x2 = " + String.format("%.2f", x2);

        } else if (delta == 0) {
            // Une solution double
            double x = -b / (2.0 * a);

            resultat += "Delta = " + delta + " = 0\n";
            resultat += "Une solution :\n";
            resultat += "x = " + String.format("%.2f", x);

        } else {
            // Pas de solution réelle
            resultat += "Delta = " + delta + " < 0\n";
            resultat += "Pas de solution réelle.\n";
            resultat += "Solutions complexes :\n";

            double partieReelle = -b / (2.0 * a);
            double partieImaginaire = Math.sqrt(-delta) / (2 * a);

            resultat += "x₁ = " + String.format("%.2f", partieReelle) + " + " +
                    String.format("%.2f", partieImaginaire) + "i\n";
            resultat += "x₂ = " + String.format("%.2f", partieReelle) + " - " +
                    String.format("%.2f", partieImaginaire) + "i";
        }

        // Affichage en pop-up
        JOptionPane.showMessageDialog(null, resultat, "Résolution de l'équation du second degré",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void afficherPopUp() {
        boolean valideurObtenues = false;

        while (!valideurObtenues) {
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
                    "Entrer les coefficients de l'equation", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                try {
                    int a = Integer.parseInt(aField.getText());
                    int b = Integer.parseInt(bField.getText());
                    int c = Integer.parseInt(cField.getText());

                    if (a == 0) {
                        JOptionPane.showMessageDialog(null, "Le coeffcient a ne peut pas etre 0", "Erreur", JOptionPane.ERROR_MESSAGE);
                        continue;
                    }
                    secondDegre(a, b, c);
                    valideurObtenues = true;

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Merci d'entrer des nombres valides.", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                valideurObtenues = true;
            }
        }
    }

    public static void main() {
        afficherPopUp();
    }
}

