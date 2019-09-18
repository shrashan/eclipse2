import java.util.Scanner;

//also known as mutators
class Robot{
	
	private String name;
	private int memory;
	public void setName(String name) {
		this.name=name;
		
	}
	public void setMemory(int memory) {
		this.memory=memory;
		
	}
	
	public String getName() {
		return name;
	}
	public int getMem() {
		return memory;
	}
	public void setInfo(String name, int memory) {
		setName(name);
		setMemory(memory);
		
	}
	public String getNamee() {
		return name;
	}
	public int getMeem() {
		return memory;
	}
	
}

public class Setters {

	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
	Robot robo1=new Robot();
	
	System.out.println("Enter the name of the robot");
	String Nm=input.nextLine();
	System.out.println("Enter the memory of the robot");
	int mem=input.nextInt();
	
	robo1.setName(Nm);
	robo1.setMemory(mem);
	
	System.out.println("The name of the robot is "+robo1.getName());
	System.out.println("The memory of the robot is "+robo1.getMem());
	
	robo1.setInfo("smauel", 10);
	System.out.println("The name of the robot is "+robo1.getNamee());
	System.out.println("The memory of the robot is "+robo1.getMeem());
	
	
	
		
	}
}
