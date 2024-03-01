package devoir1;

import java.util.Scanner;

public class GestionPersonnelSoignant {

    public static void main(String[] args) {
        // Création de trois objets de type Infirmier
        Infirmier infirmier1 = new Infirmier("Champlain", "Joe", Departements.cardiologie, 40);
        Infirmier infirmier2 = new Infirmier("Smith", "Robert", Departements.dermatologie, 35);
        Infirmier infirmier3 = new Infirmier("Desjardins", "Louis", Departements.psychiatrie, 30);

        // Affichage du prénom et du nom des trois infirmiers
        System.out.println("Prénom et nom des infirmiers :");
        System.out.println(infirmier1.getPrenom() + " " + infirmier1.getNom());
        System.out.println(infirmier2.getPrenom() + " " + infirmier2.getNom());
        System.out.println(infirmier3.getPrenom() + " " + infirmier3.getNom());

        // Lecture de l'entrée de l'utilisateur pour muter les heures travaillées
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEntrez le nombre d'heures supplémentaires pour le deuxième infirmier : ");
        int heuresSupInfirmier2 = scanner.nextInt();
        infirmier2.ajouteHeuresSupplementaire(heuresSupInfirmier2 * 3);

        System.out.println("Entrez le nombre d'heures supplémentaires pour le troisième infirmier : ");
        int heuresSupInfirmier3 = scanner.nextInt();
        infirmier3.ajouteHeuresSupplementaire(heuresSupInfirmier3 * 2);

        // Ajout de 20 heures supplémentaires pour le premier infirmier
        infirmier1.ajouteHeuresSupplementaire(20);

        // Affichage des trois infirmiers à la console
        System.out.println("\nInformations des infirmiers après les mutations :");
        System.out.println(infirmier1.toString());
        System.out.println(infirmier2.toString());
        System.out.println(infirmier3.toString());
        // Fermeture du scanner
        scanner.close();
    }
}
