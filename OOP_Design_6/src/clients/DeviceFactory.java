package clients;
import processes.GeneralManufacturingProcess;
import processes.SmartphoneManufacturingProcess;

public class DeviceFactory {

	public static void main(String[] args) {
		
		GeneralManufacturingProcess manFacturer = new SmartphoneManufacturingProcess("Iphone process");
		manFacturer.launchProcess();

	}

}
