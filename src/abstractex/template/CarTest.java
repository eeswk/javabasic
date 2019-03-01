package abstractex.template;

import abstractex.MenualCar;

public class CarTest {
	
	public static void main(String[] args) {
		System.out.println("====자율주행차=========");
		Car myCar = new AICar();
		myCar.run();
		System.out.println("====사람이 운전하는 차=========");
		Car hisCar = new MenualCar();
		hisCar.run();
	}
}
