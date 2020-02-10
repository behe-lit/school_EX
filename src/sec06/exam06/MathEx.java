package sec06.exam06;

import java.util.Random;

public class MathEx {
	
	
	public static void method1() {
		for(int i=0; i<5; i++) {
			System.out.print((int)(Math.random()*45+1)+" ");
		}
	}
	
	static void method2() {
		
		for(int i=0; i<10; i++)
		System.out.print((int)(Math.random()*100+1)+" ");
	}
	
	
	
	public static void main(String[] args) {

		System.out.println(Math.sqrt(9));
		  System.out.println(Math.exp(1));
		  
		  System.out.println("이번주 행운의 번호는? "); 
		  
		  
		  int[] array = new int[45];
		  Random r = new Random();
		  int m=0;
		  for(int i=0; i<5; i++) { 
			  m = r.nextInt(45); 
			  array[i] = m;
			  System.out.print(m + " "); 
			  }
		
		
//		method1();
//		System.out.println();
//		method2();
			
		}
	}
