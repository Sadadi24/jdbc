package fr.digi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class TestingInsertion {

	private static final String DB_URL;
	private static final String DB_USER;
	private static final String DB_PWDS;

	static {
		ResourceBundle bundle = ResourceBundle.getBundle("db");
		DB_URL = bundle.getString("db.url");
		DB_USER = bundle.getString("db.user");
		DB_PWDS = bundle.getString("db.pwds");

	}

	public static void main(String[] args) throws SQLException {
		// delete

		Connection connection = null;
		Statement st = null;
		try {
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PWDS);
			st = connection.createStatement();
			System.out.println(connection);

			int nb = st.executeUpdate("INSERT INTO FOURNISSEUR(NOM) VALUES('La maison de la peinture')");
			System.out.println(nb);

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

	}
}
