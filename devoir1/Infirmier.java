package devoir1;

public class Infirmier {
	
	private String prenom;
	private String nom;
	private Departements departement;
	private int heuresTravaillees;
	
	
	
	
	public Infirmier(String nom, String prenom, Departements departement, int heuresTravaillees){
		
		this.setPrenom(prenom);
		this.setNom(nom);
		this.setDepartement(departement);
		this.setHeuresTravaillees(heuresTravaillees);
		
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Departements getDepartement() {
		return departement;
	}

	public void setDepartement(Departements departement) {
		this.departement = departement;
	}

	public int getHeuresTravaillees() {
		return heuresTravaillees;
	}

	public void setHeuresTravaillees(int heuresTravaillees) {
		this.heuresTravaillees = heuresTravaillees;
	}

	
	public void ajouteHeuresSupplementaire(int sup) {
		this.heuresTravaillees += sup;
	}
			
	
	public String toString() {
			return "Infirmier{" +
					 prenom + " , " +
					 nom +
					", departement : " + departement +
					", heuresTravaillees=" + heuresTravaillees +
					'}';

	}
}
