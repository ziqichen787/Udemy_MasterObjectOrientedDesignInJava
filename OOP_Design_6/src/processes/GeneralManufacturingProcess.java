package processes;

public abstract class GeneralManufacturingProcess {
	public String processName;
	
	
	
	public GeneralManufacturingProcess(String processName) {
		this.processName = processName;
	}
	protected abstract void assembleDevice();
	protected abstract void testDevice();	
	protected abstract void packageDevice();	
	protected abstract void storeDevice();
	
	/**
	 *  This type of design pattern is called "Template Method Design Pattern"
	 *  It defines a flow without getting the details.
	 *  The process is the same but the details can be different based on what device is being processed.
	 */
	// template method
	// lower level modules (LaptopManufacturingProcess) depend on higher level modules (GeneralManufacturing)
	public void launchProcess() {
		if(processName != null && !processName.isEmpty()) {
			assembleDevice();
			testDevice();
			packageDevice();
			storeDevice(); 
		} else {
			System.out.print("No process name was specified...");
		}
		
	}
}
