package sec01.exam01;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
		//203페이지
	
		static Scanner input = new Scanner(System.in);
	
		static String title, author;
		
		Book(String title, String athor) {
			this.title = title;
			this.author = author;
		}
		
		public static void main(String[] args) {
			Book[] book = new Book[2];
			
			for(int i=0; i<book.length; i++) {
				System.out.print("제목>>");
				Book.title = input.nextLine();
				System.out.print("저자>>");
				Book.author = input.nextLine();
				book[i] = new Book(title,author); //배열 원소 객체 생성
			}
			
			for(int i=0; i<book.length; i++) {
				System.out.print(book[i].title +", "+ book[i].author + ", ");
			}
		}
	}
