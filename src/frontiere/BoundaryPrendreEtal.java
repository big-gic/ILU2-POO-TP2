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
			System.out.println("Je suis désolée "+nomVendeur+" mais il"
					+ "faut être un habitant de notre village pour commercer ici.");
		}else {
			System.out.println("Bonjour "+nomVendeur+", je vais regarder si"
					+ "je peux vous trouver un étal.");
			controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		}
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
	}
}
