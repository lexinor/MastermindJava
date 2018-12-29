//couche métier
import java.util.ArrayList;

public class affichage {
	
	//Méthode qui affiche la liste des couleurs disponibles ...
	public static void affichageCouleurs()
	{
		System.out.println(" ------------Affichage couleurs dispos----------------------------- ");
		ArrayList<Pion> LesPions = Pion.getLesPions();
		for(Pion unPion : LesPions)
		 {
			 System.out.println(unPion.getIdPion() + "  -  " + unPion.getCouleurPion());
		 }
		System.out.println(" ------------------------------------------------------------- ");
	}
	//Méthode montrant la combinaison Secrète
	public static void ModeTriche(ArrayList<Pion> combinaisonSecrete)
	{
		System.out.println(" -------------Affichage solution------------------------- ");
		for(Pion lePion : combinaisonSecrete)
		{
			System.out.println(lePion.getIdPion() + "  -  " + lePion.getCouleurPion());
		} 
		System.out.println(" ------------------------------------------------------------- ");
	}

}
