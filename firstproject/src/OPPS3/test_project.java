package OPPS3;
import java.util.Scanner;

public class test_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String my_name = scan.nextLine();
		
		System.out.println("enter your marks");
		int my_marks = scan.nextInt();
		
		Student obj = new Student( my_name, my_marks);
		
		obj.show_details();
		
	}

}
