
public class AccountsReceivable {
	
	private Accounting transactionObjectAccounting;
	
	public AccountsReceivable(Accounting customerTransaction) {
		this.transactionObjectAccounting = customerTransaction;
	}
	
	public void postPayment() {
		transactionObjectAccounting.chargeCustomer();
	}
	
	public void sendInvoice() {
		transactionObjectAccounting.prepareInvoice();
	}
}
