package objets;

public class Marteau {
	
	// Attributs
	protected String couleur;
	protected String manche;
	protected String tete;
	
	public static int nbClouEnfonce = 0;

	// constructeur
	public Marteau() {
		// chainer les constructeurs
		this("rouge","bois");
	}
	
	public Marteau(String couleur, String manche) {
		this(couleur, manche, "acier");
	}

	// constructeur avec la couleur du marteau en param�tre
	public Marteau(String couleur, String manche, String tete) {
		this.couleur = couleur;
		this.manche = manche;
		this.tete = tete;
	}

	// Methodes
	
	// Getter de l'attribut "couleur"
	// permet de r�cup�rer un attribut priv�
	public String getCouleur() {
		// ajouter du code pour s�curiser la r�cup�ration si necessaire
		return this.couleur;
	}
	
	// setter de l'attribut priv� "couleur"
	public void setCouleur(String couleur) {
		// s�curisation de l'attribut couleur
		if(couleur != "poulet") {			
			this.couleur = couleur;
		}else {
			System.err.println("poulet n'est pas une couleur valide");
		}
	}
	
	public String getManche() {
		return manche;
	}

	public void setManche(String manche) {
		this.manche = manche;
	}

	public String getTete() {
		return tete;
	}

	public void setTete(String tete) {
		this.tete = tete;
	}

	//fonction publique qui ne retourne rien (void)
	// elle s'appelle "taper" et ne prend pas d'arguments ()
	public void taper() {
		System.out.println("Je tape avec le marteau " + this.toString());
	}
	
	// fonction qui tape un clou pr�cis� en param�tre.
	
	public void taperClou(Clou clou) {
		System.out.println("Le clou en " + clou.matiere + " s'enfonce.");
		this.nbClouEnfonce ++;
	}
	
	public void retirerClou() {
		System.out.println("Je retire le clou");
	}
	
	public String toString() {
		return "Marteau de couleur " + this.couleur;
	}
	
}
