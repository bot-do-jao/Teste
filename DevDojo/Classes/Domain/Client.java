package Domain;

public class Client {
	
	
	private String name;
	private ClientType clientType;
	private PaymentType paymentType;
	
	
	public Client(String name, ClientType clientType, PaymentType paymentType) {
		this.name = name;
		this.clientType = clientType;
		this.paymentType = paymentType;
	}


	@Override
	public String toString() {
		return "Client [name= " + name + ", clientType= " + clientType.getNameSpreadsheet() + ", clientTypeInt= " + 
	clientType.VALUE +", paymentType= " + paymentType + "]";
	}
	
	
}
