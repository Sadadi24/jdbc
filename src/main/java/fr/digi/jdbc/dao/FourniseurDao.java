package fr.digi.jdbc.dao;

import java.sql.SQLException;
import java.util.List;

import fr.digi.jdbc.Fourniseur;

public interface FourniseurDao {
	
	List<Fourniseur> extraire() throws SQLException;
	void insert(Fourniseur fournisseur)throws SQLException;
	int update(String ancienNom, String nouveauNom)throws SQLException;
	boolean delete(Fourniseur fournisseur) throws SQLException;
	

}
