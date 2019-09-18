import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am machine";
	}
	public String start() {
		return "The machine has started.";
		
	}

}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am camera";
	}
	public String snap() {
		return"snap";
	}

}

public class Generics_wildcards {

	public static void main(String[] args) {

		ArrayList<Machine> arrayList1 = new ArrayList<Machine>();

		arrayList1.add(new Machine());
		arrayList1.add(new Machine());
		arrayList1.add(new Machine());

		ArrayList<Camera> arrayList2 = new ArrayList<Camera>();

		arrayList2.add(new Camera());
		arrayList2.add(new Camera());
		

		/*
		 * String hunam=arrayList.get(2); System.out.println(hunam);
		 */
		showList(arrayList1);
		 showList2(arrayList2);
		 showList3(arrayList1);

	}
	/*public static void showList(ArrayList<?> list) {
		for (Object value : list) {
			System.out.println(value);
		}

	}*/
	public static void showList(ArrayList<? extends Machine> list) {
		for (Machine value : list) {
			System.out.println(value);
			String starts=value.start();
			System.out.println(starts);
		}
		
		
		

	}
	public static void showList2(ArrayList<? extends Camera> list) {
		for (Camera value : list) {
			System.out.println(value);
			String starts=value.snap();
			System.out.println(starts);
		}
		
		
		

	}
	public static void showList3(ArrayList<?> list) {
		for (Object value : list) {
			System.out.println(value);
			
		}
		
		
		

	}

}
