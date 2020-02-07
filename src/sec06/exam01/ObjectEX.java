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
	
	public static void print(Object obj) { //Object�� ���� Ŭ���� �̹Ƿ� �ٷ� ���� ����
	System.out.println(obj.getClass().getName()); //��Ű�� �̸�, Ŭ�����̸�
	System.out.println(obj.hashCode()); 
	System.out.println(obj.toString()); //��ü�� ���ڿ��� ����� ���
	System.out.println(obj); //��ü ���
	
	}
	
	
	public static void main(String[] args) {
		Point p = new Point(2,3); //��ü ������ obj��ü�� ����(ObjectŬ������ ���Ŭ������ �ڵ� �θ�Ŭ��������)
		print(p);
		Point p1 = new Point(3,4);
		System.out.println(p.toString());
		System.out.println(p1.toString());
	}
}
