package abstractex.template.gameLevel;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달린다.");
	}

	@Override
	public void jump() {
		System.out.println("점프를 못한다.");
	}

	@Override
	public void turn() {
		System.out.println("턴을 못한다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("초보자 레벨이다.");
	}
	

}
