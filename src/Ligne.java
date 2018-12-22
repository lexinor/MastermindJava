//couche métier
//Permet de stocker les différentes combinaisons entrées par l'utilisateur dans sa partie

import java.util.ArrayList;

public class Ligne {
	private int idTour;
	private ArrayList<Pion> laLigne = new ArrayList<Pion>();
	
	public Ligne(int idTour, ArrayList<Pion> laLigne)
	{
		this.idTour = idTour;
		this.laLigne = laLigne;
	}

	public int getIdTour() {
		return idTour;
	}

	public void setIdTour(int idTour) {
		this.idTour = idTour;
	}

	public ArrayList<Pion> getLaLigne() {
		return laLigne;
	}

	public void setLaLigne(ArrayList<Pion> laLigne) {
		this.laLigne = laLigne;
	}	
}
