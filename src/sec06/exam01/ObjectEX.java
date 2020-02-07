package sec06.exam01;


class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point("+x+","+y+")";
	}
}

public class ObjectEX {
	
	public static void print(Object obj) { //Object는 상위 클래스 이므로 바로 선언 가능
	System.out.println(obj.getClass().getName()); //패키지 이름, 클래스이름
	System.out.println(obj.hashCode()); 
	System.out.println(obj.toString()); //객체를 문자열로 만들어 출력
	System.out.println(obj); //객체 출력
	
	}
	
	
	public static void main(String[] args) {
		Point p = new Point(2,3); //객체 생성시 obj객체도 생성(Object클래스는 모든클래스에 자동 부모클래스개념)
		print(p);
		Point p1 = new Point(3,4);
		System.out.println(p.toString());
		System.out.println(p1.toString());
	}
}
