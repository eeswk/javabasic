package object;

public class Circle implements Cloneable{
	Point point;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "원점 " + this.point +" 이고, 반지름은 " + radius + " 이다.";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 3);
		Circle circleClone = (Circle) circle.clone();
		
		//circle.radius = 5;
		System.out.println(circle);
		System.out.println(circleClone);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(circleClone));
	}
}
