import java.util.ArrayList;

//couche métier
public class traitement 
{
	//Cette méthode retourne le nombre de pions corrects mais pas forçément bien placés
	public static Integer controleNoir(ArrayList<Pion> combinaisonSecrete, ArrayList<Pion> propositionJoueur)
	{
		Integer noir = 0;
		
		for(Pion lePionSecret : combinaisonSecrete )
		{
			for(Pion lePionJoueur : propositionJoueur)
			{
				if(lePionSecret.getIdPion() == lePionJoueur.getIdPion())
				{
					noir++;
				}
			}
		}
		return noir;
	}
	//Cette méthode retourne le nombre de pions corrects et bien placés
	public static Integer controleBlanc(ArrayList<Pion> combinaisonSecrete, ArrayList<Pion> propositionJoueur)
	{
		Integer blanc = 0;
		
		for(int i =0; i<=3; i++)
		{
			if(combinaisonSecrete.get(i).equals(propositionJoueur.get(i)))
			{
				blanc++;
			}
		}
		return blanc;
	}
}
