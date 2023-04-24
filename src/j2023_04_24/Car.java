package j2023_04_24;

public abstract class Car { // 추상 클래스 선언
	private int door;
	int tire;
	String carName;
	
	public abstract void printTire(); // 추상메소드(메소드 선언부만 있는 메소드)
	
//	public Car() {
//		
//	}
//
//	public Car(int door, int tire, String carName) {
//		this.door = door;
//		this.tire = tire;
//		this.carName = carName;
//	}

	public void printCarName() {
		System.out.println(carName);
	}
}
