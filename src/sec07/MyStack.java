package sec07;

class GStack<T> {
	int tos; //�ε��� ��ȣ�� ����� int ����
	Object [] stck;
	
	GStack() {
		tos = 0;
		stck = new Object[10];
	}
	
	void push(T item) {
		if(tos == 10) //�߿�
			return;
//		else
		
		stck[tos] = item;	//�߿�
		tos++;
	}
	
	T pop() { //TŸ���� �޼ҵ�� ����
		if(tos == 0)
			return null;
//		else
			tos--;
		return (T) stck[tos]; //Ÿ�� �Ű����� Ÿ������ ĳ����
	}
	
}

public class MyStack {
	
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		
		stringStack.push("1");
		stringStack.push("2");
		stringStack.push("3");
		stringStack.push("4");
		stringStack.push("5");
		stringStack.push("6");
		stringStack.push("7");
		stringStack.push("8");
		stringStack.push("9");
		stringStack.push("10");
		stringStack.push("11");
	
		
		for(int i=0; i<12; i++) {
			System.out.println(stringStack.pop()); //10�� �Ѿ�� null���� ����Ѵ�
		}
	}
}
