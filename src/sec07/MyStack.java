package sec07;

class GStack<T> {
	int tos; //인덱스 번호로 사용할 int 변수
	Object [] stck;
	
	GStack() {
		tos = 0;
		stck = new Object[10];
	}
	
	void push(T item) {
		if(tos == 10) //중요
			return;
//		else
		
		stck[tos] = item;	//중요
		tos++;
	}
	
	T pop() { //T타입의 메소드로 선언
		if(tos == 0)
			return null;
//		else
			tos--;
		return (T) stck[tos]; //타입 매개변수 타입으로 캐스팅
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
			System.out.println(stringStack.pop()); //10이 넘어가면 null값을 출력한다
		}
	}
}
