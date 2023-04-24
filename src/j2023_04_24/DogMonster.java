package j2023_04_24;

public class DogMonster implements Monster, MonsterInfo {

	@Override
	public void attack() {
		System.out.println("이빨로 물어서 공격");
	}

	@Override
	public void move() {
		System.out.println("땅을 달려서 이동");
	}

	@Override
	public void energy() {
		
	}

	@Override
	public void health() {
		
	}

}
