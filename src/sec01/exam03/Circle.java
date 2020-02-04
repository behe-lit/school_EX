package sec01.exam03;

public class Circle {

	int radius; //������ �ν��Ͻ� ���� ����
	
	public Circle(int r) {
		 this.radius = r;//�����ڿ� ������ �Ű������� �ν��Ͻ����� ����
	}
	
	void set(int r) {
		this.radius = r; //�޼ҵ忡�� �ٽ� �ν��Ͻ� ������ ��ĥ �� �ִ�.
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
