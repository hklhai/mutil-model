package cn.edu.ncut.ssh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class ConnectTest {

	@Test
	public void testConnect() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/hk";
		
		Connection connection = DriverManager.getConnection(url,"root","mysql");
		Statement statement = connection.createStatement();
		String query ="select * from tb_user";
		ResultSet rs = statement.executeQuery(query);
		rs.close();
		statement.close();
		connection.close();
	}

	
}
