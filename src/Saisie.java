import java.util.ArrayList;
import java.util.Scanner;

public class Saisie 
{
	public static ArrayList<Pion> saisieCombinaison()
	{
		//à tester
		   //demander à l'util une combi de 4 chiffres, convertir cette combi en collection de Pion et la retourner
			affichage.affichageCouleurs(); //donne à l'util les nombres associés à chaque couleur
		   Scanner scan = new Scanner(System.in);
		   ArrayList<Integer> propositionJoueur = new ArrayList<Integer>(); //les valeurs entrées par l'util
		   ArrayList<Pion> LesPions = Pion.getLesPions(); //la liste des pions de la classe
		   ArrayList<Pion> laPropositionJoueur = new ArrayList<Pion>(); //laproposition convertie en Pion
		    
		    for(int i=0; i<=3; i++)
		    {
		    	System.out.println("saisir");
		    	int str = scan.nextInt();
		    	propositionJoueur.add(str);
		    }
		    scan.close();
		    
		    for(Integer laProposition : propositionJoueur)
		    {
		    	for(Pion lePion : LesPions)
		    	{
		    		if(lePion.getIdPion() == laProposition)
		    		{
		    			laPropositionJoueur.add(lePion);
		    		}
		    	}
		    }
		    return laPropositionJoueur;
			
	}
	

}
