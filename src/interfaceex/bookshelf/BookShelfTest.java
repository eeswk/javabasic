package interfaceex.bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("토비의 스프링");
		shelfQueue.enQueue("JPA 프로그래밍");
		shelfQueue.enQueue("스프링 부트");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
