package sec01.exam01;

public class Parent {
	//필드
	String name;
	double area;
	
	Parent(String name, double area) {
		this.name = name;
		this.area = area;
	}
	
	public static void main(String[] args) {
		Parent pizza = new Parent("자바피자", 314.0);
		System.out.println(pizza.name +":"+pizza.area);
		
		Parent donut = new Parent("도넛피자", 3.14);
		System.out.println(donut.name +":"+donut.area);
	}
}
