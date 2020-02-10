package sec07;

import java.util.Vector;

public class VectorEx {
	
	static void printVector(Vector<Integer> v) {
		for(int i=0; i<v.size(); i++) {
			v.elementAt(i); // v.get(i)
			System.out.println(v.elementAt(i));
		}
	}
	
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>(3); //아무것도 안줬을시 10칸 생성 = 백터용량은 10,, 벡터용량을 입력시 초과하면 입력된 용량의 2배가 된다.
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		System.out.println(v.capacity()); //범위 출력
		System.out.println();
		
		printVector(v); //전체 출력 메소드
	}
}
