package sec07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListEx {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> a = new ArrayList<String>();
		
		
		for(int i=0; i<4; i++) {
			System.out.println("�̸��� �Է��ϼ���>>");
			String s = br.readLine();
			a.add(s); //arrayList �÷��ǿ� ����
		}
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println("name["+i+"]: "+a.get(i));
		}
		
		
		
		
		//���� �� �̸� ����ϴ� ����
		int longestIndex = 0;
		
		for(int i=1; i<a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length())
				longestIndex = i;
		}
		System.out.println(a.get(longestIndex));
	}
	
}
