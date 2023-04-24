package j2023_04_24;

public class SpiderMonster implements Monster {

	@Override
	public void attack() {
		System.out.println("거미줄로 공격");
	}

	@Override
	public void move() {
		System.out.println("땅을 기어서 이동");
	}

}
