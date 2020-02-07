package sec06.exam02;


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

public class ToStringEx {
	
	public static void main(String[] args) {
		Point p = new Point(2,3);
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p + "¿‘¥œ¥Ÿ");
	}


}