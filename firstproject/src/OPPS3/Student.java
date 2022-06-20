package OPPS3;
import java.util.Scanner;

public class Student {
	
	String name = "";
	int marks = 0;
	
	public Student(String n, int m) { 
		
		name = n;
		marks = m;
	}
	
	public void show_details() {
		
		System.out.println("name of the student is " + name );
		System.out.println("marks of the student are " + marks);
	}
}
