package abstractex;

import abstractex.template.Car;

public class MenualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전한다.");

	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지한다.");

	}

	@Override
	public void wiper() {
		System.out.println("사람이 빠르기를 조절한다.");
	}
}
