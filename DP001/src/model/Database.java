package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Database {
	
	private static String user = "root";
	private static String pass = "";
	private static String db_name = "MySQL_Test";
	
	private static String queryDelete = "DELETE FROM Registros  WHERE OF = ?";
	private static String queryInsert = "INSERT INTO Registros VALUES( ? , ? , ? , ? )";
	private static String querySelect = "SELECT * FROM Registros";
	
	public Connection connectDatabase() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
			JOptionPane.showMessageDialog(null, "Se ha iniciado la conexión con el servidor de forma exitosa");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Database Error:" + e.getMessage());
		} 
		return con;
	}

	public void insertData(String OF, String OC, String Referencia, String Cantidad) {
		Connection con = null;
		try {
			this.connectDatabase();
			
			con = this.connectDatabase();
			PreparedStatement pstmt = con.prepareStatement(queryInsert);
			pstmt.setString(1, OF); 
			pstmt.setString(2, OC); 
			pstmt.setString(3, Referencia); 
			pstmt.setString(4, Cantidad);
			pstmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error en el almacenamiento de datos: "+ e.getMessage());
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Database error: "+ e.getMessage());
			}
		}
	}

	public void getValues() {
		Connection con = null;
		try {
			this.connectDatabase();
			con = this.connectDatabase(); 
			PreparedStatement preparedStatement = con.prepareStatement(querySelect); 
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				System.out.println("OF: " + resultSet.getString("OF") + " "
						+ "OC: " + resultSet.getString("OC") + " " + resultSet.getString("Referencia") + " "
						+ "Cantidad: " + resultSet.getString("Cantidad"));
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Error en la adquisicion de datos: "+ e.getMessage());
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Database error: "+ e.getMessage());
			}
		}
	}

	public void deleteRecord(String OF) {
		Connection con = null;
		try {
			con = this.connectDatabase();
			PreparedStatement pstmt = con.prepareStatement(queryDelete);
			pstmt.setString(1, OF); 
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error borrando el registro especificado: "+ e.getMessage());
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Database error: "+ e.getMessage());
			}
		}
	}

}
