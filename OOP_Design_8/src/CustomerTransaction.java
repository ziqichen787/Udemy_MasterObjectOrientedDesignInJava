import java.util.List;
import java.util.Date;

public class CustomerTransaction implements Accounting, Reporting {
	
	private List<Product> products;
	private Customer customer;
	
	
	
	public CustomerTransaction(List<Product> products, Customer customer) {
		this.products = products;
		this.customer = customer;
	}

	@Override
	public String getName() {
		return customer.getName();
		
	}
	
	@Override
	public Date getDate() {
		return new Date();
	}
	
	@Override
	public String getProductBreakdown() {
		String reportListingString = null;
		for(Product product: products) {
			reportListingString += product.getProductName();
		}
		return reportListingString;
	}
	

	public void prepareInvoice() {
		System.out.println("this is the receipt...");
	}
	
	
	public void chargeCustomer() {
		System.out.println("charge the customer...");
	}
}
