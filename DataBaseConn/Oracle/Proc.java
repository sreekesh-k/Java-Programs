/*
create table usertb(id number(10), name varchar2(200));


create or replace procedure usrinsert  (id IN NUMBER,  name IN VARCHAR2)  
is  
begin  
	insert into usertb values(id,name);  
end;  
/ 

*/
//program to invoke the procedure

import java.sql.*;  
public class Proc
{  
	public static void main(String[] args) throws Exception
	{  
  		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","","");  
  		CallableStatement stmt=con.prepareCall("{call usrinsert(?,?)}");  
		stmt.setInt(1,1011);  
		stmt.setString(2,"ABC");  
		stmt.execute();  
  		System.out.println("success");  
	}  
}  