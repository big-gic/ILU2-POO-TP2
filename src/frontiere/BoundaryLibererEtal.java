package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		if (!controlLibererEtal.isVendeur(nomVendeur)){
			System.out.println("Mais vous n'�tes pas inscrit sur notre march� aujourd'hui !");
		}else {
			String[] donneesEtal = controlLibererEtal.libererEtal(nomVendeur);
			String etalOccupe = donneesEtal[0];
			String produit = donneesEtal[2];
			String quantiteInitial = donneesEtal[3];
			String quantiteVendu = donneesEtal[4];
			if (Boolean.parseBoolean(etalOccupe)) {
				System.out.println("Vous avez vendu "+quantiteVendu+" sur "+quantiteInitial+" "+produit+".");
				System.out.println("En revoir "+nomVendeur+", passez une bonne journ�e");
			}
		}
	}

}
