//menu driven program to insert,delete update and select queries in db
import java.sql.*;  
import java.io.*;

class CDB
{
	Connection objCon;
	Statement objSt;
	String strError;

	public CDB()
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

class ProcessEmp
{
	CDB objDb;
	public ProcessEmp()
	{
		objDb = new CDB();
	}
	public int menu() throws IOException, NumberFormatException
	{
		DataInputStream din = new DataInputStream(System.in);
		System.out.print("\n\nInsert -> 1\nDisplay -> 2\nUpdate -> 3\nDelete -> 4\nExit -> 5\nUr Choice->");
		int ch = Integer.parseInt(din.readLine());
		return ch;
	}
	public void insert()throws IOException, NumberFormatException
	{
		DataInputStream din = new DataInputStream(System.in);
		System.out.println("Enter no , name and salary");
		int no = Integer.parseInt(din.readLine());
		String name = din.readLine();
		float sal = Float.parseFloat(din.readLine());
		String sql = "insert into emp values(" + no + ",'" + name + "'," + sal + ")";
		objDb.idu(sql);
		System.out.println("Inserted...");
	}
	public void update()throws IOException, NumberFormatException
	{
		DataInputStream din = new DataInputStream(System.in);
		System.out.println("Enter Employee no for updatng salary and name");
		int no = Integer.parseInt(din.readLine());
		System.out.println("Enter the name and salary..");
		String name = din.readLine();
		float sal = Float.parseFloat(din.readLine());
		String sql = "update emp set ename='" + name + "',esal=" + sal + " where eno=" + no + "";
		objDb.idu(sql);
		System.out.println("Updated...");
	}
	public void delete()throws IOException, NumberFormatException
	{
		DataInputStream din = new DataInputStream(System.in);
		System.out.println("Enter Employee no for deleting");
		int no = Integer.parseInt(din.readLine());
		
		String sql = "delete from emp where eno=" + no + "";
		objDb.idu(sql);
		System.out.println("Deleted...");
	}
	public void select()
	{
		try
		{
			ResultSet rs = objDb.select("select * from emp");
			ResultSetMetaData rd = rs.getMetaData();
			int cc = rd.getColumnCount();
			int i;
			for(i = 0;i < cc;i++)
			{
				System.out.print(rd.getColumnName(i+1) + "\t");
			}
			System.out.println("\n");
			while(rs.next())
			{
				for(i = 0;i < cc;i++)
				{
					System.out.print(rs.getString(i+1) + "\t");
				}
				System.out.println("");
			}
		}
		catch(Exception e)
		{
			System.out.println(""  +e);
		}	
	}
	public void process() throws IOException, NumberFormatException
	{
		int ch;
		for(ch = menu();ch != 5;ch = menu())
		{
			switch(ch)
			{
				case 1:
					insert();
					break;
				case 3:
					update();
					break;
				case 4:
					delete();
					break;
				case 2:
					select();
					break;
				default:
					System.out.println("Wrong Selection...");
					break;
			}
		}
	}
}

class MDB
{  
 	public static void main(String args[]) throws IOException, NumberFormatException
 	{  
		ProcessEmp obj = new ProcessEmp();
		obj.process();
	} 
}  