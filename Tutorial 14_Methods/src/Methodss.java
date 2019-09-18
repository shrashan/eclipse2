import java.util.Scanner;

class Student{
	String name;
	int age;
	float grades;
	
	void describeMyself() {//subroutine or method
		System.out.println("Myname is "+ name);
		System.out.println("My age is "+age);
		System.out.println("My grade is "+grades);
		system.out.println("My grade is "+grades);
		
	}
	
}



public class Methodss {

	public static void main(String[] args) {
		
		Student std1=new Student();
		Student std2=new Student();
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the name of the first student");
		std1.name=input.nextLine();
		System.out.println("Enter the age of the first student");
		std1.age=input.nextInt();
		System.out.println("Enter the grades (float) of the first student");
		std1.grades=input.nextFloat();
		
		System.out.println("Enter the name of the Second student");
		std2.name=input.next();
		System.out.println("Enter the age of the Second student");
		std2.age=input.nextInt();
		System.out.println("Enter the grades (float) of the Second student");
		std2.grades=input.nextFloat();
		
		
		std1.describeMyself();
		
		std2.describeMyself();
		
		
		describe("Rashan",5,3.33);
		
		
		
	}
	  static void describe(String names,int ages,double d) {//can do private static void/int/string
		System.out.println("Myname is "+ names);
		System.out.println("My age is "+ages);
		System.out.println("My grade is "+d);
	}
}
