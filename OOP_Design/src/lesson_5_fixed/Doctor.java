package lesson_5_fixed;

public class Doctor extends Employee {

	public Doctor(int id, String name, String departmentString, boolean working) {
		super(id, name, departmentString, working);
		System.out.println("Doctor in action...");
	}
	// Doctors:
	private void prescribeMedicine() {
		System.out.println("Doctor prescribing medicine");
	}
		
	private void diagnosePatients() {
		System.out.println("Doctor diagnosing patients...");
	}
	@Override
	public void performDuties() {
		prescribeMedicine();
		diagnosePatients();
		
	}

}
