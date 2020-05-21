package lesson_5;

public class EmergencyRoomProcess {
	
	public static void main(String args[]) {
		HospitalManagement ERDirector = new HospitalManagement();
		Employee employee = new Nurse(1, "Peggy", "emergency", true);
		
		ERDirector.callUpon(employee);
		Employee employee2 = new Doctor(2, "Suzan", "emergency", true);
		ERDirector.callUpon(employee2);
	}

}
