package interfaceex.scheduler;
//짧은 대기열 먼저 배분
public class LessJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져온다.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 할당한다.");
	}

}
