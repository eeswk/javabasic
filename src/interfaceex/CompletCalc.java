package interfaceex;

public class CompletCalc extends Calculator {

	@Override
	public int multiply(int x, int y) {
		return x * y;
	}

	@Override
	public int divide(int x, int y) {
		return (y !=0 ) ? x/y : ERROR;
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현");
	}

	@Override
	public int squrt(int x, int y) {
		
		return x^y;
	}
	
	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("정수 계산기 재정의");
	}
	
}
