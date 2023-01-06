package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mca","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from tblstudent");
		while(rs.next())
		{
			System.out.println("|"+rs.getInt(1)+"|"+rs.getString(2)+"|" );
		}
		
		}catch (Exception e) {
			// TODO: handle exception
		 System.out.println("EXceptio is :-"+e);
		}
	}
}
