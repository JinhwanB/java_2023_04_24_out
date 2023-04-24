package j2023_04_24;

public class ColorPoint extends Point {// sub class
	private String color;
	
	public ColorPoint() {
		super(); // 부모 클래스의 기본 생성자 호출(생략 가능)
		//super(10, 20); // 부모 클래스의 생성자 호출
		System.out.println("자식 클래스 생성자 실행됨!!");
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint(); // super class method
	}
}
