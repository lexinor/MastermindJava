import java.util.ArrayList;

//couche dialogue utilisateur

public class main {
	
	public static void main(String [] args)
	{
		//affichage.affichage();
		ArrayList<Integer> code = aleatoire.generationCode();
		ArrayList<Pion> combinaisonSecrete = aleatoire.combinaisonSecrète(code); 
		
		affichage.ModeTriche(combinaisonSecrete);
	}

}
