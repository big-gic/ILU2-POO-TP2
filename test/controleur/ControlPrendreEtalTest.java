package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Gaulois;
import villagegaulois.Village;

class ControlPrendreEtalTest {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;
	private Gaulois asterix;
	private Gaulois obelix;
	
	@BeforeEach
	void initialiserSituation() {
		village = new Village("le village",10,3);
		controlVerifierIdentite = new ControlVerifierIdentite(village);
		asterix = new Gaulois("Asterix",4);
		village.ajouterHabitant(asterix);
		obelix = new Gaulois("Obelix",4);
		village.ajouterHabitant(obelix);
		village.rechercherEtal(asterix);
		village.rechercherEtal(obelix);
	}
	
	@Test
	void testControlPrendreEtal() {
		ControlPrendreEtal controlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite,village);
		assertNotNull(controlPrendreEtal,"Constructeur ne renvoie pas null");
	}

	@Test
	void testResteEtals() {
		ControlPrendreEtal controlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite,village);
		assertTrue(controlPrendreEtal.resteEtals());
		//il manque un truc
		assertTrue(!controlPrendreEtal.resteEtals());
	}

	@Test
	void testPrendreEtal() {
		fail("Not yet implemented");
	}

	@Test
	void testVerifierIdentite() {
		fail("Not yet implemented");
	}

}
