package frontiere;

import java.util.Scanner;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;
	private Scanner scan = new Scanner(System.in);

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		if (controlPrendreEtal.verifierIdentite(nomVendeur) == false) {
			System.out.println("Je suis d�sol�e "+nomVendeur+" mais il"
					+ "faut �tre un habitant de notre village pour commercer ici.");
		}else {
			System.out.println("Bonjour "+nomVendeur+", je vais regarder si"
					+ "je peux vous trouver un �tal.");
			controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		}
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
	}
}
