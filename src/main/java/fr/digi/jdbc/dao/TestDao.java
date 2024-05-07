package fr.digi.jdbc.dao;

import java.util.ArrayList;
import java.util.List;

import fr.digi.jdbc.Fourniseur;

public class TestDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FourniseurDao dao = new FournisseurDaoJdbc();
		try {
			List<Fourniseur> fourniseurs = dao.extraire();
			fourniseurs.forEach(f -> System.out.println(f.getRaisonsociale()));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
