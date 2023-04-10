package storedProceduteTestings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SPTesting {

	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	
	@BeforeClass
	public void setup() throws SQLException
	{
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "root");
	}
	
	@AfterClass
	public void tearDown() throws SQLException
	{
		con.close();
	}

	@Test
	public void test_storedProceduresExists() throws SQLException
	{
		stmt = con.createStatement();
		rs = stmt.executeQuery("show procedure status where name='SelectAllCustomers'");
		rs.next();
		
		Assert.assertEquals(rs.getString("Name"), "SelectAllCustomers");
		
	}
	
}


