package devoir2;

public class Joueur {
	private String nom;
	private String prenom;
	private int age;
	
	
	public Joueur(String nom, String prenom, int age){
		
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public String toString() {
		return "Joueur " + prenom + " , " + nom + ", " + age + " ans";
	}
	
	
}
