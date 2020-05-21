package reporting;

public class ReportFormatter {
	
	String formattedOutputString;
	
	public ReportFormatter(Object object, FormatType formatType) {
		switch(formatType) {
		case XML:
			formattedOutputString = convertObjectToXML(object);
			break;
		case CSV:
			formattedOutputString = convertObjectToCSV(object);
			break;
		}
		
  	}
	
	private String convertObjectToXML(Object object) {
		return "<title>" + object.toString() + "</title>";
	}
	
	private String convertObjectToCSV(Object object) {
		return "CSV: ..." + object.toString() + "...";
	}
	
	public String getFormattedValue() {
		return formattedOutputString;
	}
	
}
