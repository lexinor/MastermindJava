import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Scanner;

public class Saisie {
	public static ArrayList<Integer> SaisirSerie() {
		ArrayList<Integer> nbrDifferents = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <= 3; i++) {
			System.out.println("saisir le nombre N°" + i);
			int str = scan.nextInt();
			if (Integer.toString(str).length() == 1 && !nbrDifferents.contains(str)) {
				nbrDifferents.add(str);
			} else {
				System.out.println("nbs diff et inf a 2");
				scan.close();
				SaisirSerie();
			}
		}
		return nbrDifferents;
	}

	public static ArrayList<Pion> saisieCombinaison() {

		// collection de Pion et la retourner
		affichage.affichageCouleurs(); // donne à l'util les nombres associés à chaque couleur

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> propositionJoueur = new ArrayList<Integer>(); // les valeurs entrées par l'util
		ArrayList<Pion> LesPions = Pion.getLesPions(); // la liste des pions de la classe
		ArrayList<Pion> laPropositionJoueur = new ArrayList<Pion>(); // laproposition convertie en Pion

		for (int i = 0; i <= 3; i++) {
			boolean goodInput = false;
			// Tant que la saisie n'est pas valide on boucle
			while (!goodInput) {
				System.out.println("Saisissez le nombre N°" + (i + 1));
				// int str = scan.nextInt();

				try {
					String userStr = reader.readLine(); // On récupère l'input de l'utilisateur
					int userInput = Integer.parseInt(userStr); // On essaye de le parser en un Integer

					if (userInput > 0 && userInput < 9) // Si la valeur reçu est bien entre 1 et 8
					{
						propositionJoueur.add(userInput); // On l'ajoute à l'ArrayList des saisies
						goodInput = true; // On repasse le booleen à true
					} else
						System.out.println("Veuillez entrer une valeur entre 1 et 8 \n");

				} catch (IOException e) {
					System.out.println("Veuillez entrer un chiffre entre 1 et 8");
				} catch (NumberFormatException ex) {
					System.out.println("\nSeul des chiffres sont acceptés !");
				}
			}
		}

		for (Integer laProposition : propositionJoueur) {
			for (Pion lePion : LesPions) {
				if (lePion.getIdPion() == laProposition) {
					laPropositionJoueur.add(lePion);
				}
			}
		}
		return laPropositionJoueur;
	}

	public static int choixModeJeu() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		boolean goodInput = false;
		// Tant que la saisie n'est pas valide on boucle
		int userInput = 0;
		while (!goodInput) {
			System.out.println("Quel version du Mastermind voulez-vous ?");
			System.out.println("1 -- CONSOLE");
			System.out.println("2 -- GRAPHIQUE (Work in Progress)");
			// int str = scan.nextInt();

			try {
				String userStr = reader.readLine(); // On récupère l'input de l'utilisateur
				userInput = Integer.parseInt(userStr); // On essaye de le parser en un Integer

				if (userInput > 0 && userInput < 3) {
					goodInput = true; // On repasse le boolean à true
				} else
					System.out.println("Veuillez choisir votre mode de jeu : (1/2)");

			} catch (IOException e) {
				System.out.println("Veuillez saisir une valeur comprise entre 1 et 2");
				System.out.println("Veuillez choisir votre mode de jeu : (1/2)");
			} catch (NumberFormatException ex) {
				System.out.println("Vous devez saisir un chiffre entre 1 et 2 !");
				System.out.println("Veuillez choisir votre mode de jeu : (1/2)");
			}
		}
		return userInput;

	}

}
