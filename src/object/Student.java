package object;

public class Student {

	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId) return true;
			else return false;
		}
		return false;
	}
	
	
	
	@Override
	public int hashCode() {
		return studentId;
	}

	public static void main(String[] args) {
		Student studentLee = new Student(1000, "이순신");
		Student studentkim = new Student(1000, "김유신");
		
		if (studentLee == studentkim) {
			System.out.println("물리적 주소는 같다.");
		} else {
			System.out.println("물리적 주소는 다르다.");
		}
		
		if (studentLee.equals(studentkim)) {
			System.out.println("같은 사람이다.");
		} else {
			System.out.println("다른 사람이다.");
		}
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i1 = new Integer(1004);
		Integer i2 = new Integer(1004);
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		
		System.out.println(studentLee.hashCode());
		System.out.println(studentkim.hashCode());
		
		System.out.println(System.identityHashCode(studentLee));
		System.out.println(System.identityHashCode(studentkim));
	}
	
	
	
}
