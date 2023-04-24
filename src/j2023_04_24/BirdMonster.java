package j2023_04_24;

public class BirdMonster implements Monster {

	@Override
	public void attack() {
		System.out.println("부리로 찍어서 공격");
	}

	@Override
	public void move() {
		System.out.println("하늘을 날아서 이동");
	}

}
