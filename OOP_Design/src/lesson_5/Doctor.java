package lesson_5;

public class Doctor extends Employee {

	public Doctor(int id, String name, String departmentString, boolean working) {
		super(id, name, departmentString, working);
		System.out.println("Doctor in action...");
	}

}
