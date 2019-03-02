package interfaceex;

public class CalcuartorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompletCalc calc = new CompletCalc(); 
//		Calc calc1 = new Calc();  // 인터페이스 인스턴스 불가
//		Calc cacl2 = new Calcuartor(); //추상클래스 인스턴스 불가
		Calculator calc3 = new CompletCalc(); //
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.squrt(num1, num2));
		calc.showInfo();
		calc.description();
		
		int[] arr =  {1,2,3,4};
		int sum = Calc.total(arr);
		System.out.println(sum);

	}

}
