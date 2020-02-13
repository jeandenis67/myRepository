package com.adaming.accueil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.accueil.dao.EtudiantDao;
import com.adaming.accueil.entity.Etudiant;

@Controller
@RequestMapping("/Etudiant")
public class EtudiantController {

	@Autowired
	EtudiantDao etdDao;

	public EtudiantDao getEtdDao() {
		return etdDao;
	}

	public void setEtdDao(EtudiantDao etdDao) {
		this.etdDao = etdDao;
	}

	@RequestMapping(value = "/Ajout", method = RequestMethod.POST)
	public String AjoutEtudiant(@ModelAttribute("etd") Etudiant etudiant) {

		etdDao.AjoutEtudiant(etudiant);

		return "redirect:All";
	}

	@RequestMapping(value = "/Supprimer", method = RequestMethod.GET)
	public String SupprimerMatiere(@ModelAttribute("etd") Etudiant etudiant) {

		etdDao.SupprimerEtudiant(etudiant);

		return "etudiant";
	}

	@RequestMapping(value = "/All", method = RequestMethod.GET)
	public String GetAllMatiere(ModelMap model) { // GetAll n'a pas d'arguements donc pas de @ModelAttribute

		model.addAttribute("listeDesEtudiants", etdDao.getAllEtudiant());

		return "etudiant";
	}
}
