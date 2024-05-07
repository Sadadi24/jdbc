package fr.digi.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import fr.digi.jdbc.Fourniseur;

public class FournisseurDaoJdbc implements FourniseurDao {

	private static final String select_query = "SELECT * FROM  FOURNISSEUR";
	private static final String DB_URL;
	private static final String DB_USER;
	private static final String DB_PWDS;

	static {
		ResourceBundle bundle = ResourceBundle.getBundle("db");
		DB_URL = bundle.getString("db.url");
		DB_USER = bundle.getString("db.user");
		DB_PWDS = bundle.getString("db.pwds");

	}
	Connection connection = null;
	Statement st = null;

	@Override
	public List<Fourniseur> extraire() throws SQLException {
		List<Fourniseur> fourniseurs = new ArrayList<>();

		try {
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PWDS);
			st = connection.createStatement();
			System.out.println(connection);

			ResultSet rs = st.executeQuery("SELECT * FROM  FOURNISSEUR");

			while (rs.next()) {
				int id = rs.getInt("ID");
				String nom = rs.getString("NOM");
				fourniseurs.add(new Fourniseur(id, nom));

			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());

		} finally {
			if (null != st) {
				st.close();
			}
			if (null != connection) {
				connection.close();

			}

		}
		return fourniseurs;
	}

	@Override
	public void insert(Fourniseur fournisseur) throws SQLException {
		connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PWDS);
		st = connection.createStatement();
		int nb = st.executeUpdate("INSERT INTO FOURNISSEUR(NOM) VALUES('La maison de la peinture')");
		System.out.println(nb);

	}

	@Override
	public int update(String ancienNom, String nouveauNom) throws SQLException {
		connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PWDS);
		st = connection.createStatement();
		return 0;
	}

	@Override
	public boolean delete(Fourniseur fournisseur) throws SQLException {
		connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PWDS);
		st = connection.createStatement();
		boolean rs = false;

		int nbSupp = st.executeUpdate("DELETE FROM  FOURNISSEUR  WHERE NOM ='La maison de la peinture'");
		if(nbSupp >0) {
			rs = true;
			
		}
		
		return rs;
	}

}
