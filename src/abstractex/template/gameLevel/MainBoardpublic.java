package abstractex.template.gameLevel;

public class MainBoardpublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel superLevel = new SuperLevel();
		player.upgradeLevel(superLevel);
		player.play(3);

	}

}
