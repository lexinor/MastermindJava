//couche métier
import java.util.ArrayList;

public class affichage {
	
	//Méthode qui affiche la liste des couleurs disponibles ...
	public static void affichageCouleurs()
	{
		ArrayList<Pion> LesPions = Pion.getLesPions();
		for(Pion unPion : LesPions)
		 {
			 System.out.println(unPion.getIdPion() + "  -  " + unPion.getCouleurPion());
		 }
	}
	//Méthode montrant la combinaison Secrète
	public static void ModeTriche(ArrayList<Pion> combinaisonSecrete)
	{
		for(Pion lePion : combinaisonSecrete)
		{
			System.out.println(lePion.getIdPion() + "  -  " + lePion.getCouleurPion());
		} 
	}

}
