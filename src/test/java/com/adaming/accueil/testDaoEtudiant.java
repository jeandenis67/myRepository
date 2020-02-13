package com.adaming.accueil;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adaming.accueil.dao.EtudiantDao;
import com.adaming.accueil.entity.Etudiant;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src//test//resources//root-context.xml" })
public class testDaoEtudiant {

	Etudiant etd = new Etudiant();
	@Autowired
	private EtudiantDao etdao;

	public Etudiant getEtd() {
		return etd;
	}

	public void setEtd(Etudiant etd) {
		this.etd = etd;
	}

	public EtudiantDao getEtdao() {
		return etdao;
	}

	public void setEtdao(EtudiantDao etdao) {
		this.etdao = etdao;
	}

	@Before
	public void setUp() {
		etd.setIdEtudiant(7L);
		etd.setNomEtudiant("nom5");
		etd.setPrenomEtudiant("prenom5");
	}

	@Test
	public void AjoutEtudiant() {

		etdao.AjoutEtudiant(this.etd);
		Etudiant etdfound = etdao.getByIdEtudiant(7L);
		assertEquals(etd, etdfound);
	}
}
