package deepak.com;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RowCountDemo 
{
	public static void main(String args[])throws Exception
	{
	
	String Driver=("oracle.jdbc.OracleDriver");
	String Url_name=("jdbc:oracle:thin:@localhost:1521:XE");
	String User="system";
	String pwd="1234";
	Class.forName(Driver);
	Connection con=DriverManager.getConnection(Url_name,User,pwd);
	Statement st=con.createStatement();
	String sqlQuery="select count(*)from  EmployData";
	 ResultSet rs= st.executeQuery(sqlQuery);
	if(rs.next())
	{
		System.out.println(rs.getInt(1));
	}
	con.close();
	};
   
}