package com.darttc.nov2016.javee.juicynet.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.darttc.nov2016.javee.juicynet.domain.Medicament;

@Stateless
public class MedicamentService {
	
	@PersistenceContext(unitName="medicstore-unit")
	private EntityManager entityManager;
	
	public Long ajouterMedicament(Medicament medicament) {
		entityManager.persist(medicament);
		return medicament.getId();
	}
	
}
