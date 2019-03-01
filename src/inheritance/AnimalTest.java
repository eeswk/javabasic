package inheritance;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
	List<Animal> animalList = new ArrayList<Animal>(); 
	
	public static void main(String[] args) {
/*		Penguin pororo = new Penguin();
		pororo.favor ="잠자기";
		pororo.hello();
		
		Animal pety = new Penguin();
		pety.name ="페티";
		pety.hello();
		
		AnimalTest test = new AnimalTest();
		test.helloAnimal(new Penguin());
		test.helloAnimal(new Fox());
		test.helloAnimal(new Bear());
*/
		
		AnimalTest listTest = new AnimalTest();
		listTest.addAnimal();
		listTest.downCasting();
		
		
	}

	private void downCasting() {
		for(Animal ani : animalList) {
			if(ani instanceof Penguin) {
				Penguin p = (Penguin) ani;
				p.swimming();
			} else if (ani instanceof Fox) {
				Fox f = (Fox) ani;
				f.invent();
			} else if (ani instanceof Bear) {
				Bear b = (Bear) ani;
				b.tall();
			} else {
				System.out.println("지원되지 않는 형변환이다.");
			}
				
		}
		
	}

	private void addAnimal() {
		animalList.add(new Penguin());
		animalList.add(new Fox());
		animalList.add(new Bear());
		
		for(Animal ani : animalList) {
			ani.hello();
		}
		
	}

	private void helloAnimal(Animal animal) {
		animal.hello();
	}
}

class Animal {
	protected String name;
	
	public Animal() {
		this.name = "동물";
	}

	public void hello() {
		System.out.println("동물 인사.");
	}
}

class Penguin extends Animal {
	String favor;
	
	public Penguin() {
		name = "뽀로로";
		favor = "수영";
	}
	@Override
	public void hello() {
		System.out.println("안녕, 난 꼬마 펭귄 "+ name +" 야");
		System.out.println("그리고 "+ favor +" 잘해");
	}
	
	public void swimming() {
		System.out.println("펭귄은 수영하다.");
	}
} 
	
class Fox extends Animal {
	int iq; 
	public Fox() {
		name = "에디";
		iq = 150;
	}
	
	@Override
	public void hello() {
		System.out.println("안녕, 난 척척박사 사막여우 " + name + "야");
		System.out.println("아이큐가 "+ iq +" 이상이야");
	}
	
	public void invent() {
		System.out.println("여우는 똑독하다.");
	}
}
	
class Bear extends Animal {
	String color;
	public Bear() {
		name = "포비";
		color = "흰색";
	}
	@Override
	public void hello() {
		System.out.println("안녕, 난 곰 " + name +"야");
		System.out.println("내 피부는 "+ color + " 이야");
	}
	
	public void tall() {
		System.out.println("곰은 키가 크다.");
	}
	
}
