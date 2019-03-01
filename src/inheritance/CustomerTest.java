package inheritance;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
//		Customer customerLee = new Customer();
//		customerLee.setCustomerId(1001);
//		customerLee.setCustomerName("이순신");
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.showCustomerInfo());
//		
//		VIPCustomer customerKim = new VIPCustomer(1002, "김유신", 12345);
//		customerKim.bonusPoint = 10000;
//		customerKim.saleRatio = 0.2;
//		System.out.println(customerKim.showCustomerInfo());
//		
//		//호출되는 메서드는 인스턴스에 따라 결정된다. 
//		//(선언된 클래스형이 아닌 생성된 인스턴스의 메서드를 호출)
//		//인스턴스의 메서드가 호출되는 기술을 가상메서드
//		Customer customerPark = new VIPCustomer(1003, "박문수", 5678);
//		customerPark.bonusPoint = 10000;
//		System.out.println(customerPark.showCustomerInfo());
//		
//		int price = 10000;
//		
//		System.out.println(customerLee.getCustomerName() + " 님의 지불해야 하는 가격은 " + customerLee.calcPrice(price) + "원입니다.");
//		System.out.println(customerKim.getCustomerName() + " 님의 지불해야 하는 가격은 " + customerKim.calcPrice(price) + "원입니다.");
//		System.out.println(customerPark.getCustomerName() + " 님의 지불해야 하는 가격은 " + customerPark.calcPrice(price) + "원입니다.");
//		
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(1001, "이순신");
		Customer customerkang = new Customer(1002, "강감찬");
		GoldCustomer customerPark = new GoldCustomer(1003, "박문수");
		GoldCustomer customerChoi = new GoldCustomer(1004, "최영");
		VIPCustomer customerYang = new VIPCustomer(1005, "양만춘", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerkang);
		customerList.add(customerPark);
		customerList.add(customerChoi);
		customerList.add(customerYang);
		
		System.out.println("=====고객 정보======");
		for (Customer customer : customerList)
			System.out.println(customer.showCustomerInfo());
		
		System.out.println("===할인율과 적립 포인트 계산====");
		
		int price = 10000;
		
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이  " + cost + "원 지불했습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 적립 포인트는 " + customer.bonusPoint + "점 입니다.");
			
		}
		
		
	}
}
