import java.util.ArrayList;
import java.util.Random;

//couche m�tier
public class aleatoire {

	public static int nombreAleatoire() // Donne un nombre al�atoire entre 0 et 7
	{
		Random rand = new Random();
		int nombreCache = 0;
		nombreCache = rand.nextInt(8) + 1; // al�atoire entre 1 et 8
		return nombreCache;
	}

	public static ArrayList<Integer> generationCode() {
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int j = 0; j <= 3; j++) {
			int nbr = 0;
			boolean correspondance = false;
			while (!correspondance) // tant que le nombre EST COMPRIS dans la liste on boucle ..
			{
				nbr = nombreAleatoire();
				if (!res.contains(nbr)) 
					correspondance = true; // s'il est unique, on peut alors l'ajouter � la liste
			}
			res.add(nbr);
		}
		return res;
	}

	// Gen�re la combinaison secr�te avec la classe Pion � partir du code secret
	public static ArrayList<Pion> combinaisonSecrete(ArrayList<Integer> code) {
		ArrayList<Pion> LesPions = Pion.getLesPions(); // on recup�re l'esnemble des couleurs
		ArrayList<Pion> combi = new ArrayList<Pion>(); // nouvelle Liste qui permettra de stocker la combi secr�te avec
														// la classe Pion
		for (Integer lecode : code) {
			for (Pion lePion : LesPions) {
				if (lePion.getIdPion() == lecode) // si le pion est concern�, on l'ajoute � la combi secr�te
					combi.add(lePion);
			}
		}
		return combi;
	}
}
