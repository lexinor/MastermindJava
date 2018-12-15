import java.util.ArrayList;
import java.util.Random;

//couche métier
public class aleatoire {
	
	public static int nombreAleatoire() //Donne un nombre aléatoire entre 0 et 7
	{
		Random rand = new Random();
		int nombreCache = 0;
		nombreCache = rand.nextInt(8);
		return nombreCache;	 
	}
	
	public static ArrayList<Integer> generationCode()
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int j = 0; j<=3; j++)
	      {
	    	 int nbr =0; 
	    	 boolean correspondance = false;
	    	  while(!correspondance) //tant que le nombre EST COMPRIS dans la liste on boucle ..
	    	  {
	    		  nbr = nombreAleatoire();
	    		  if(!res.contains(nbr))
	    		  {
	    			  correspondance = true; // s'il est unique, on peut alors l'ajouter à la liste
	    		  }
	    	  }
	    	  res.add(nbr);
	      }
		return res;
	}

}
