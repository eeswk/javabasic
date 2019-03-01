package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer2 = new DeskTop();
		Computer computer3 = new MyNoteBook();
		NoteBook computer4 = new MyNoteBook();
		
		computer2.display();
	

	}

}
