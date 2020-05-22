package lesson_5_fixed;

public abstract class Employee {
	
	private int id;
	private String name;
	private String departmentString;
	private boolean working;
	
	public Employee(int id, String name, String departmentString, boolean working) {
		super();
		this.id = id;
		this.name = name;
		this.departmentString = departmentString;
		this.working = working;
	}
	
	public abstract void performDuties();

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", departmentString=" + departmentString + ", working="
				+ working + "]";
	}
	
	
	
	

}
