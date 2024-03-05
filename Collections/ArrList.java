//array list program
import java.io.*;
import java.util.*; 
import java.lang.*;
 
class ArrList
{  
	public static void main(String args[])
	{  
		ArrayList<String>l=new ArrayList <String> ();  
		l.add("ABC");  
		l.add("BCD");  
		l.add("CDE");  
		l.add("EFG");  
		
		Iterator itr=l.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
  		}  
 	}  
}  