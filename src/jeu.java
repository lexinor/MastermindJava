import java.util.ArrayList;

public class jeu {
	
//	public void PropositionTypeJeu()
//	{
//		System.out.println("Quel version du Mastermind voulez-vous ?");
//	}
	
	public static int jeu()
	{
		
		// Proposer choix type d'affichage sur Jeu - Graphique ou Console
		
//		PropositionTypeJeu()
		
		// Si choixType == 1 -> Console
		// Si choixType == 2 -> Graphique
		
		// Si choix console
//		switch (ChoixType) 
//		{
//		case 1: //  Console
//			// Mettre le code de la version Console ICI
//			break;
//		case 2: // Graphique
//			
//			break;
//		default:
//			// Message d'Erreur ou autre
//			break;
//		}
		
		boolean trouve = false;
		int essais = 10;
		
		ArrayList<Integer> code = aleatoire.generationCode();
		ArrayList<Pion> combinaisonSecrete = aleatoire.combinaisonSecrète(code); //combi secrete
		affichage.ModeTriche(combinaisonSecrete);
		while(!trouve && essais > 0)
		{
			
			ArrayList<Pion> saisieJoueur = Saisie.saisieCombinaison(); //propo du joueur
			int blanc = traitement.controleBlanc(combinaisonSecrete, saisieJoueur);
			int noir = traitement.controleNoir(combinaisonSecrete, saisieJoueur);
			System.out.println(" pion Blancs :  " + blanc);
			System.out.println("pion Noirs  :  " + noir);
			essais--;
			if(blanc ==4)
			{
				trouve = true; 
				System.out.println(" ------------------------------------------------------------- ");
				System.out.println("Vous avez trouvé en  " + (essais + 1) + " essais ");
				System.out.println(" ------------------------------------------------------------- ");
				System.out.println("Bien joué ");
			}
			else
			{
				System.out.println("il vous reste " + essais + " chances ");
			}
		}
		return 0;
	}
	
	
}
