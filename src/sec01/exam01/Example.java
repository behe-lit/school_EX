package sec01.exam01;

public class Example {
	//�������� 0~4�� ex��ü 5���� ������ �迭�� ���� �� ���� ������ ����ϱ�
	int radius;

	public Example(int radius) {
		this.radius = radius;
	}

	public double method() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Example[] ex = new Example[5]; //5���� ��ü ���۷��� ����

		for(int i=0; i<ex.length; i++) {
			ex[i] = new Example(i); //��ü ����
		}

		for(int i=0; i<ex.length; i++) {
			System.out.print((int)(ex[i].method()) + " ");
		}

	}

}
