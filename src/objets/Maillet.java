package objets;

public class Maillet extends Marteau {
	
	// epaisseur du caoutchouc du maillet
	private double epaisseurAmortit;
	
	public Maillet() {
		this.couleur = "bleu";
	}
	
	
	public Maillet(String couleur, String manche, String tete, double epaisseurAmortit) {
		// constructeur du parent
		super(couleur, manche, tete);
		this.epaisseurAmortit = epaisseurAmortit;
	}
	
	
	public void taperCarrelage(Carrelage carrelage) {
		System.out.println("J'ai taper sur le carelage");
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(epaisseurAmortit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Maillet other = (Maillet) obj;
		if (Double.doubleToLongBits(epaisseurAmortit) != Double.doubleToLongBits(other.epaisseurAmortit))
			return false;
		return true;
	}

}
