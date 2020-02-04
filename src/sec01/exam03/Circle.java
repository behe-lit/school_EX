package sec01.exam03;

public class Circle {

	int radius; //반지름 인스턴스 변수 선언
	
	public Circle(int r) {
		 this.radius = r;//생성자에 반지름 매개변수와 인스턴스변수 대입
	}
	
	void set(int r) {
		this.radius = r; //메소드에서 다시 인스턴스 변수를 고칠 수 있다.
	}
	double getArea() {
		return Math.PI*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		System.out.println(circle.radius);
		
		
		
		Circle[] ca = new Circle[5];
		for (int i = 0; i < ca.length; i++) {
			ca[i] = new Circle(i);
		}
		
		
		for(int i=0; i<ca.length; i++) {
			System.out.println(String.format("%.2f", ca[i].getArea()));
		}

	}
	

}
