package objets;

public class Clou {
	
	String matiere = "acier";
	float longueur = 12.6f;
	double diametre = 0.5;

	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public float getLongueur() {
		return longueur;
	}
	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}
	public double getDiametre() {
		return diametre;
	}
	public void setDiametre(double diametre) {
		this.diametre = diametre;
	}

	@Override
	public String toString() {
		return "Clou [matiere=" + matiere + ", longueur=" + longueur + ", diametre=" + diametre + "]";
	}
	

}
