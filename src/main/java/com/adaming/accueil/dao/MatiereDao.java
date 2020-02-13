package com.adaming.accueil.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.accueil.entity.Matiere;

@Repository
public class MatiereDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void AjoutMatiere(Matiere mat) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(mat);
		session.getTransaction().commit();
		session.close();
	}

	public void SupprimerMatiere(Matiere mat) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(mat);
		session.getTransaction().commit();
		session.close();
	}

	public List<Matiere> getAllMatiere() {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Criteria crt = session.createCriteria(Matiere.class);
		return crt.list();

	}
}
