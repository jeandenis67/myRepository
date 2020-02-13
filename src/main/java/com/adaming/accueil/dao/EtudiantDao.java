package com.adaming.accueil.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adaming.accueil.entity.Etudiant;

@Repository
public class EtudiantDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void AjoutEtudiant(Etudiant etd) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(etd);
		session.getTransaction().commit();
		session.close();
	}

	public void SupprimerEtudiant(Etudiant etd) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(etd);
		session.getTransaction().commit();
		session.close();
	}

	public List<Etudiant> getAllEtudiant() {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Criteria crt = session.createCriteria(Etudiant.class);
		return crt.list();

	}
	
	public Etudiant getByIdEtudiant(long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Etudiant etd = (Etudiant) session.get(Etudiant.class,  id);
		return etd;
	}
}
