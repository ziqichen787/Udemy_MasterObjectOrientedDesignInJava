package lesson_5_fixed;

public class Nurse extends Employee {

	public Nurse(int id, String name, String departmentString, boolean working) {
		super(id, name, departmentString, working);
		System.out.println("Nurse in action...");
	}
	
	// Nurses:
	private void checkVitalSigns() {
		System.out.println("Nurse checking vital signs...");

	}
		
	private void drawBlood() {
		System.out.println("Nurse drawing blood...");
	}
		
	private void cleanPatientArea() {
		System.out.println("Nurse cleaning patient area...");
	}

	@Override
	public void performDuties() {
		checkVitalSigns();
		drawBlood();
		cleanPatientArea();
		
	}
	
	
	

}
