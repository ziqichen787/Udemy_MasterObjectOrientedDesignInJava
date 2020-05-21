package lesson_5;

public class HospitalManagement {
	
	public void callUpon(Employee employee) {
		if(employee instanceof Nurse) {
			checkVitalSigns();
			drawBlood();
			cleanPatientArea();
		} else if(employee instanceof Doctor) {
			prescribeMedicine();
			diagnosePatients();
		}
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
	
	// Doctors:
	private void prescribeMedicine() {
		System.out.println("Doctor prescribing medicine");
	}
	
	private void diagnosePatients() {
		System.out.println("Doctor diagnosing patients...");
	}
}
