package sec07;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		Iterator<Integer> it = v.iterator(); // ??? 1ȸ��
		
		while(it.hasNext()) { 
			int n = it.next();
			System.out.println(n +" ");
		}
		
		
		
		int sum =0;
		it = v.iterator(); //�缱�� �ؾ��ϴ� ���� ??
		while(it.hasNext()) {
			int n = it.next();
			sum+=n;
		}
		
		
		System.out.println("�հ�: "+sum);
		
		
		
	}
	

}
