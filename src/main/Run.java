package main;
import objets.*;

public class Run {

	public static void main(String[] args) {
		
		int[] tabNombre = {12,42,23,88,74};
		
		System.out.println(tabNombre[1]);
		
		Carrelage[] tabCarrelage = {
				new Carrelage(),
				new Carrelage()
		};
		
		String couleur = "rouge";

		// instanciation d'un objet de la classe Marteau
		Marteau marteauRouge = new Marteau(couleur, "bois", "acier");
		
		Maillet maillet = new Maillet();
		
		Marteau[] marteaux = {
				marteauRouge,
				maillet
		};
		
		// instanciation d'un objet clou
		Clou clou = new Clou();
		
		Carrelage carrelage1 = new Carrelage();
		Carrelage carrelage2 = new Carrelage();
		
		System.out.println("le marteau est de couleur: " + marteauRouge.getCouleur());
		
		System.out.println("le marteau est de la couleur: " + maillet.getCouleur());
		
		marteauRouge.taperClou(clou);
		
		// interdit (les attributs protected ne sont pas visible)
		
		//maillet.couleur = "truc";
		//System.out.println(maillet.couleur);
		
		// autorisé
		
		maillet.setCouleur("bleu");
		System.out.println(maillet.getCouleur());
		
		maillet.taperCarrelage(carrelage1);
		
		System.out.println(tabCarrelage[0]);
		System.out.println(tabCarrelage[1]);
		
		System.out.println(carrelage1 == carrelage2);
		
		carrelage1 = carrelage2;

		System.out.println(carrelage1 == carrelage2);
		
		carrelage1.equals(carrelage2);
		
		//test static
		
		System.out.println(Marteau.nbClouEnfonce);
		System.out.println(Marteau.nbClouEnfonce);
		
		marteauRouge.taperClou(clou);
		maillet.taperClou(clou);
		
		System.out.println(Marteau.nbClouEnfonce);
		System.out.println(Marteau.nbClouEnfonce);
		
		Marteau marteauRose = new Marteau("rose", "titane", "plastique");
		
		Travailleur benoit = new Travailleur(marteauRose);
		
		benoit.travailler();
		
		benoit.marteau.taperClou(clou);
		
	}

}
