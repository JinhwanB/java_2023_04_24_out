package j2023_04_24;

public class MainClass3 {

	public static void main(String[] args) {
		//Car car1 = new Car(); // 추상클래스는 객체를 생성할 수 없다!
		
		Truck truck1 = new Truck();
		truck1.carName = "소나타";
		truck1.printCarName();
	}

}
