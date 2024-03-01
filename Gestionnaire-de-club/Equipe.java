package devoir2;

import java.util.ArrayList;
import java.util.List;


public class Equipe  {
	private String nom;
	private int parties_gagnees;
	private List<Joueur> listeJoueurs;
	private categories categorie;

	    
	public Equipe(String nom, categories categorie) {
        this.nom = nom;
        this.parties_gagnees = 0;
        this.listeJoueurs = new ArrayList<>();
        this.categorie = categorie;
    }

	    // Accesseurs
	    public String getNom() {
	        return nom;
	    }
	    public int getParties_gagnees(){
			return parties_gagnees;
		}
		public categories getCategorie(){
			return categorie;
		}
		public List<Joueur> getListeJoueurs() {
	        return listeJoueurs;
	    }
		
		
		public void setParties_gagnees(int parties_gagnees) {
			this.parties_gagnees = parties_gagnees;
		}

	    // Mutateurs
	    public void setNom(String nom) {
	        this.nom = nom;
	    }


	    public void setCategorie(categories categorie) {
	        this.categorie = categorie;
	    }

	    // Méthode ajoutPartiesGagnees
	    public int ajoutPartiesGagnees(int quantite) {
	        return parties_gagnees += quantite;
	    }

	    // Méthode nombreJoueurs
	    public int nombreJoueurs() {
	        return listeJoueurs.size();
	    }

	    // Méthode ajouterJoueur
	    public void ajouterJoueur(Joueur joueur) {
	        listeJoueurs.add(joueur);
	    }

	    // Méthode supprimerJoueur
	    public void supprimerJoueur(int indice) {
	        if (indice >= 0 && indice < listeJoueurs.size()) {
	            listeJoueurs.remove(indice);
	        } else {
	            System.out.println("Indice invalide.");
	        }
	    }
}
