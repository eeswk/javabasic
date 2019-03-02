package interfaceex;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -9999;
	
	int add(int x, int y);
	int substract(int x, int y);
	int multiply(int x, int y);
	int divide(int x, int y);
	int squrt(int x, int y);
	
	//디폴트 메서드
	default void description() {
		System.out.println("정수 계산기를 구현");
		//private 메서드
		//descriptionFunctionInfo();
	}

	//정적 메서드
	static int total(int[] arr) {
		int total = 0;
		int lastValue = 0;
		for (int i : arr) {
				total += i;
				lastValue = i;
		}
		//lastValueFind(lastValue);
		
		
		return total;
	}
	
/*	
	private void descriptionFunctionInfo(){
		System.out.println("더하기, 빼기, 곱하기, 나누기, 제곱");
	}
	
	private static void lastValueFind(lastValue){
		System.out.println("마지막 할당 값 =" +  lastValue);
	}
*/	

}
