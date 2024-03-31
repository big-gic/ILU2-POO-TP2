package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlAfficherVillageTest {
	private Village village;
	private Gaulois asterix;
	private Gaulois obelix;
	private Chef abraracourcix;
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation...");
		village = new Village("le village des irr�ductibles",10,5);
		abraracourcix = new Chef("Abraracourcix",10,village);
		village.setChef(abraracourcix);
		asterix = new Gaulois("asterix",4);
		obelix = new Gaulois("obelix",4);
	}

	@Test
	void testControlAfficherVillage() {
		ControlAfficherVillage controlAfficherVillage = new ControlAfficherVillage(village);
		assertNotNull(controlAfficherVillage,"Constructeur ne renvoie pas null");
	}

	@Test
	void testDonnerNomsVillageois() {
		ControlAfficherVillage controlAffichervillage = new ControlAfficherVillage(village);
		String[] nomsVillageois = controlAffichervillage.donnerNomsVillageois();
		assertTrue(nomsVillageois[0].equals(abraracourcix.getNom()));
		assertTrue(nomsVillageois.length==1);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		nomsVillageois = controlAffichervillage.donnerNomsVillageois();
		assertTrue(nomsVillageois.length==3);
	}

	@Test
	void testDonnerNomVillage() {
		ControlAfficherVillage controlAfficherVillage = new ControlAfficherVillage(village);
		controlAfficherVillage.donnerNomVillage();
		// pas de vérification
	}

	@Test
	void testDonnerNbEtals() {
		ControlAfficherVillage controlAfficherVillage = new ControlAfficherVillage(village);
		controlAfficherVillage.donnerNbEtals();
		// pas de vérification
	}
}
