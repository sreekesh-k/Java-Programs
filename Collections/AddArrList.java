//add list one to 2
import java.io.*;
import java.util.*; 
import java.lang.*;
 
class AddArrList
{  
	public static void main(String args[])
	{  
		ArrayList<String>l=new ArrayList <String> ();  
		l.add("Amal");  
		l.add("thomas");  
		l.add("biju");  
		l.add("Ajay");  
		ArrayList<String>lr=new ArrayList <String> (); 
		lr.add("shiju");
		lr.add("renjith");
		l.addAll(lr);
		Iterator itr=l.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
  		}  
 	}  
}  