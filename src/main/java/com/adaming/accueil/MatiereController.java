package com.adaming.accueil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.adaming.accueil.dao.MatiereDao;
import com.adaming.accueil.entity.Matiere;

@Controller
@RequestMapping("/Matiere")
public class MatiereController {

	@Autowired
	private MatiereDao matDao;

	public MatiereDao getMatDao() {
		return matDao;
	}

	public void setMatDao(MatiereDao matDao) {
		this.matDao = matDao;
	}

	@RequestMapping(value = "/Ajout", method = RequestMethod.POST)
	public String AjoutMatiere(@ModelAttribute("mat") Matiere matiere) {

		matDao.AjoutMatiere(matiere);

		return "redirect:All";
	}

	@RequestMapping(value = "/Supprimer", method = RequestMethod.GET)
	public String SupprimerMatiere(@ModelAttribute("mat") Matiere matiere) {

		matDao.SupprimerMatiere(matiere);

		return "matiere";
	}

	@RequestMapping(value = "/All", method = RequestMethod.GET)
	public String GetAllMatiere(@ModelAttribute("mat") Matiere matiere, ModelMap model) {

		model.addAttribute("listeDesMatieres", matDao.getAllMatiere());

		return "matiere";
	}
}
