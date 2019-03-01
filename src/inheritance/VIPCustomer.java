package inheritance;

public class VIPCustomer extends Customer {
	
	private int agentId;
	double saleRatio;

	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = .05;
		saleRatio = .1;
		this.agentId = agentId;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}
	
	public int getAgentId() {
		return agentId;
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo() + " 상품 할인율은 "+ saleRatio *100 +" % 입니다.";
	}
	
	
	

}
