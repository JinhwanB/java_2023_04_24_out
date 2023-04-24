package j2023_04_24;

public class Point {// super class
	private int x, y;
	
	public Point() {
		System.out.println("부모 클래스 생성자1번 실행됨!!");
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("부모 클래스 생성자2번 실행됨!!");
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	public void helloPrint() {
		System.out.println("안녕하세요 저는 부모 클래스 Point 클래스입니다!!");
	}
}
