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
		
		Vector<Integer> v = new Vector<Integer>(3); //�ƹ��͵� �������� 10ĭ ���� = ���Ϳ뷮�� 10,, ���Ϳ뷮�� �Է½� �ʰ��ϸ� �Էµ� �뷮�� 2�谡 �ȴ�.
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		System.out.println(v.capacity()); //���� ���
		System.out.println();
		
		printVector(v); //��ü ��� �޼ҵ�
	}
}
