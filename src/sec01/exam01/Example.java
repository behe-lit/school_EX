package sec01.exam01;

public class Example {
	//반지름이 0~4인 ex객체 5개를 가지는 배열을 생성 후 각각 면적을 출력하기
	int radius;

	public Example(int radius) {
		this.radius = radius;
	}

	public double method() {
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		Example[] ex = new Example[5]; //5개의 객체 레퍼런스 생성

		for(int i=0; i<ex.length; i++) {
			ex[i] = new Example(i); //객체 생성
		}

		for(int i=0; i<ex.length; i++) {
			System.out.print((int)(ex[i].method()) + " ");
		}

	}

}
