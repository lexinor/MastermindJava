import java.util.ArrayList;

public class jeu {
	

	
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
		int choixModeJeu = Saisie.choixModeJeu();
		switch(choixModeJeu)
		{
		case 1 : 
			System.out.println("vous avez choisi le mode console ==== >");
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
					System.out.println("Vous avez trouvé en  " + (10-(essais)) + " essais ");
					System.out.println(" ------------------------------------------------------------- ");
					System.out.println("Bien joué ");
				}
				else
				{
					System.out.println("il vous reste " + essais + " chances ");
				}
			}
	
			break;
		
		case 2:
			System.out.println("vous avez choisi le mode graphique");
			break;
			
			
		default: 
			System.out.println("erreur");
			break;
			
		}
		
		
		return 0;
	
	
	}
			
}
