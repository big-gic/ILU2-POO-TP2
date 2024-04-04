package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

class ControlLibererEtalTest {
	private Village village;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	Gaulois obelix;
	Gaulois asterix;
	Chef chef;
	
	@BeforeEach
	void initialiserSituation() {
		village = new Village("le village",10,5);
		controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
		chef = new Chef("Abraracourcix",3,village);
		village.setChef(chef);
		obelix = new Gaulois("Obelix",4);
		village.ajouterHabitant(obelix);
		village.installerVendeur(obelix, "menhir", 3);
		asterix = new Gaulois("Asterix",5);
		village.ajouterHabitant(asterix);
	}
	
	@Test
	void testControlLibererEtal() {
		ControlLibererEtal controlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);
		assertNotNull(controlLibererEtal,"Constructeur ne renvoie pas null");
	}

	@Test
	void testIsVendeur() {
		ControlLibererEtal controlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);
		assertTrue(!controlLibererEtal.isVendeur(asterix.getNom()));
		assertTrue(controlLibererEtal.isVendeur(obelix.getNom()));
	}

	@Test
	void testLibererEtal() {
		ControlLibererEtal controlLibererEtal = new ControlLibererEtal(controlTrouverEtalVendeur);
		Etal etal = village.rechercherEtal(obelix);
		controlLibererEtal.libererEtal(obelix.getNom());
		assertTrue(!etal.isEtalOccupe());
	}

}
