package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	public static Connection conectar() throws Exception{
		Connection connection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"+
						"databaseName=SOWADT3", "sa", "123456");
			/*			
			connection = DriverManager.getConnection("jdbc:sqlserver://sowadupn.database.windows.net:1433;"+
			"databaseName=BDSowad20172", "allerena", "123456Aa");
			*/	
			
		} catch (Exception e) {
			throw e;
		}
		return connection;
	}
	
}
