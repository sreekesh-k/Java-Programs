//CREATE TABLE  imgtb(name VARCHAR2(4000), img BLOB) 

import java.sql.*;
import java.io.*;

public class InsertImage {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "", "");
			PreparedStatement ps = con.prepareStatement("insert into imgtb values(?,?)");
			ps.setString(1, "Sreekesh");
			FileInputStream fin = new FileInputStream("test.jpg");
			ps.setBinaryStream(2, fin, fin.available());
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}