package j2023_04_24;

public class MainClass {

	public static void main(String[] args) {
		Point superP = new Point(); // 부모클래스 객체 선언
		ColorPoint subColor = new ColorPoint(); // 자식클래스 객체 선언
		
		superP = subColor; // 부모는 자식의 모든 것을 받아 줄 수 있다!(업캐스팅)
		subColor = (ColorPoint)superP; // 자식 객체를 부모 객체에 대입할 때는 형변환이 필요함!(다운캐스팅)
	}

}
