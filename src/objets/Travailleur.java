package objets;

public class Travailleur {

	public Marteau marteau;
	
	public Travailleur(Marteau marteau) {
		this.marteau = marteau;
	}
	
	public void travailler() {
		this.marteau.taper();
	}
	
}
