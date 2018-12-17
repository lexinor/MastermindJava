import java.util.ArrayList;
import java.util.List;

//couche métier
//Permet de stocker les différents Pions jouables par l'utilisateur (ID et Couleur)
public class Pion 
{
	private int idPion;
	private String couleurPion; 
	
public Pion(int idPion, String couleurPion)
{
	this.idPion = idPion;
	this.couleurPion = couleurPion; 
}

public int getIdPion() {
	return idPion;
}

public void setIdPion(int idPion) {
	this.idPion = idPion;
}

public String getCouleurPion() {
	return couleurPion;
}

public void setCouleurPion(String couleurPion) {
	this.couleurPion = couleurPion;
}

//Initialisation des Pions qu'on peut utiliser dans la partie
public static ArrayList<Pion> getLesPions()
{ 
	 ArrayList<Pion> pions = new ArrayList<Pion>();
	 Pion pion1= new Pion(1, "bleu");
	 Pion pion2= new Pion(2, "vert");
	 Pion pion3= new Pion(3, "jaune");
	 Pion pion4= new Pion(4, "rouge");
	 Pion pion5= new Pion(5, "orange");
	 Pion pion6= new Pion(6, "blanc");
	 Pion pion7= new Pion(7, "noir");
	 Pion pion8= new Pion(8, "violet");
	 pions.add(pion1);
	 pions.add(pion2);
	 pions.add(pion3);
	 pions.add(pion4);
	 pions.add(pion5);
	 pions.add(pion6);
	 pions.add(pion7);
	 pions.add(pion8);
	 
   return pions;
}

}
