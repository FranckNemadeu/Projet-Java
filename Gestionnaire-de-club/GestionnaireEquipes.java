package devoir2;

public class GestionnaireEquipes {
    public static void main(String[] args) {
        // Création de 8 objets de type Joueur
        Joueur joueur1 = new Joueur("Noubi", "Erica", 25);
        Joueur joueur2 = new Joueur("Martial", "Franck", 22);
        Joueur joueur3 = new Joueur("Sosso", "Eddy", 20);
        Joueur joueur4 = new Joueur("Brown", "Chris", 30);
        Joueur joueur5 = new Joueur("Williams", "Charlie", 19);
        Joueur joueur6 = new Joueur("Longoria", "Eva", 23);
        Joueur joueur7 = new Joueur("Taylor", "swift", 27);
        Joueur joueur8 = new Joueur("Leonel", "Messi", 29);

        // Création de 2 objets de type Equipe
        Equipe equipe1 = new Equipe("Équipe 1", categories.Senior);
        Equipe equipe2 = new Equipe("Équipe 2", categories.Junior);

        // Ajout des 4 premiers joueurs à la première équipe
        equipe1.ajouterJoueur(joueur1);
        equipe1.ajouterJoueur(joueur2);
        equipe1.ajouterJoueur(joueur3);
        equipe1.ajouterJoueur(joueur4);

        // Ajout des 4 autres joueurs à la seconde équipe
        equipe2.ajouterJoueur(joueur5);
        equipe2.ajouterJoueur(joueur6);
        equipe2.ajouterJoueur(joueur7);
        equipe2.ajouterJoueur(joueur8);

        // Fixer le nombre de parties gagnées des équipes
        equipe1.setParties_gagnees(4);
        equipe2.setParties_gagnees(5);

        // Ajouter 2 parties gagnées à la première équipe à l’aide de la méthode ajoutPartiesGagnees
        equipe1.ajoutPartiesGagnees(2);

        // Comparer le nombre de parties gagnées des deux équipes
        if (equipe1.getParties_gagnees() > equipe2.getParties_gagnees()) {
            System.out.println("L'équipe 1 a remporté plus de parties.");
        } else if (equipe1.getParties_gagnees() < equipe2.getParties_gagnees()) {
            System.out.println("L'équipe 2 a remporté plus de parties.");
        } else {
            System.out.println("Les deux équipes ont remporté le même nombre de parties.");
        }

        // Obtenir le nombre de joueurs de chaque équipe et afficher ces nombres à la console
        System.out.println("Nombre de joueurs dans l'équipe 1 : " + equipe1.nombreJoueurs());
        System.out.println("Nombre de joueurs dans l'équipe 2 : " + equipe2.nombreJoueurs());

        // Supprimer le joueur à l’indice 3 de l’équipe 1
        equipe1.supprimerJoueur(3);

       
     // Afficher tous les joueurs de l’équipe 1 à la console
        System.out.println("Joueurs de l'équipe 1 :");
        for (Joueur joueur : equipe1.getListeJoueurs()) {
            System.out.println(joueur);
        }


        // Afficher tous les joueurs de l’équipe 2 à la console
        System.out.println("Joueurs de l'équipe 2 :");
        for (Joueur joueur : equipe2.getListeJoueurs()) {
            System.out.println(joueur);
        }
        System.out.println(equipe1.getParties_gagnees());

    }
}
