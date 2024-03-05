//general purpose class for dbconnection
import java.sql.*;  
import java.io.*;
public class DataBase
{
	Connection objCon;
	Statement objSt;
	String strError;

	public DataBase()
	{
		try
  		{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			objCon=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","","");  
  			objSt=objCon.createStatement();  
		}
		catch(Exception err)
		{
			strError = err.toString();
		}
	}
	public void idu(String sql)
	{
		try
  		{  
			objSt.executeUpdate(sql);
		}
		catch(Exception err)
		{
			strError = err.toString();
		}
	}
	public ResultSet select(String sql)
	{
		ResultSet objRs = null;
		try
  		{  
			objRs = objSt.executeQuery(sql);	
		}
		catch(Exception err)
		{
			strError = err.toString();
		}
		return objRs;
	}
	public String getError()
	{
		return strError;
	}
}