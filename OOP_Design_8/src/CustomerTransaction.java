import java.util.Date;

public class CustomerTransaction {
	
	public String getName() {
		return "name...";
	}
	
	public Date getDate() {
		return new Date();
	}
	
	public String getProductBreakdown() {
		return "list of products for reporting...";
	}
	
	public String prepareInvoice() {
		return "this is the receipt...";
	}
	
	public String chargeCustomer() {
		return "charge the customer...";
	}
}
