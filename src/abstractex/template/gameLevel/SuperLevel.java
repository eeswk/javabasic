package abstractex.template.gameLevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달린다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void jump() {
		System.out.println("2단 점프를 한다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void turn() {
		System.out.println("한바퀴 턴을 한다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void showLevelMessage() {
		System.out.println("고급자 레벨이다.");
		// TODO Auto-generated method stub

	}

}
