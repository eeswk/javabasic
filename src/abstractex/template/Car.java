package abstractex.template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	//와이퍼 추가
	public abstract void wiper();
	
	public void wiperCar() {}
	
	public void startCar() {
		System.out.println("시동을 켠다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끈다");
	}
	
	//템플릿 메서드
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		//필요에따라서 재정의 훅메서드
		wiperCar();
		turnOff();
	}
}
