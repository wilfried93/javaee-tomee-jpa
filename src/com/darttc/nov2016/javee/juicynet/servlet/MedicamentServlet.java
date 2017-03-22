package com.darttc.nov2016.javee.juicynet.servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.darttc.nov2016.javee.juicynet.domain.Medicament;
import com.darttc.nov2016.javee.juicynet.service.MedicamentService;

@WebServlet("/medicaments")
public class MedicamentServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private MedicamentService medicamentService;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Medicament medicament = new Medicament();
		medicament.setNom("Efferalgant");
		medicament.setPosologie("Un comprime matin, un comprime soir ....");
		medicamentService.ajouterMedicament(medicament);
		
	}

}
