package sec01.exam01;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
		
		static Scanner input = new Scanner(System.in);
	
		String title, author;
		
		Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
		
		public static void main(String[] args) {
			Book[] book = new Book[2];
			
			for(int i=0; i<book.length; i++) {
				System.out.print("제목>>");
				String title = input.nextLine();
				System.out.print("저자>>");
				String author = input.nextLine();
				
				book[i] = new Book(title, author);
			}
			
			for(int i=0; i<book.length; i++) {
				System.out.print(book[i].title +", "+ book[i].author + ", ");
			
				input.close();
			}
		
		}
	
	}
