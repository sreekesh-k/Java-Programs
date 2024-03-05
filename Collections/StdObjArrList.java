//add object of student in arraylist
import java.util.*;  

class Student
{  
	int rollno;  
	String name;  
	int age;  

	public Student(int rollno,String name,int age)
	{  
		this.rollno=rollno;  
		this.name=name;  	
		this.age=age;  
  	}  
	public void disp()
	{
		System.out.println(rollno+" "+name+" "+age);  
	}
}  

public class StdObjArrList
{  
	public static void main(String args[])
	{  

		Student s1=new Student(101,"ABC",20);  
		Student s2=new Student(102,"BCD",21);  
		Student s3=new Student(103,"DEF",25);  

		ArrayList<Student> al=new ArrayList<Student>();  
  
		al.add(s1);  
		al.add(s2);  
		al.add(s3);  

		Iterator itr=al.iterator();  
		while(itr.hasNext())
		{
	  		Student st=(Student)itr.next();  
			st.disp();
  		}  
 	}  
}  