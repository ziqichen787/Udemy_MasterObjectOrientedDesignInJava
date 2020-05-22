package processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {

	public SmartphoneManufacturingProcess(String processName) {
		super(processName);
	}

	@Override
	protected void assembleDevice() {
		System.out.println("Assembled smartphone...");
		
	}

	@Override
	protected void testDevice() {
		System.out.println("Tested smartphone...");
		
	}

	@Override
	protected void packageDevice() {
		System.out.println("Packaged smartphone...");
		
	}

	@Override
	protected void storeDevice() {
		System.out.println("Stored smartphone...");
		
	}

}
