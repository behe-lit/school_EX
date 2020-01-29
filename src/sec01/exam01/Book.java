package sec01.exam01;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
		//203í˜ì´ì§€
	
		static Scanner input = new Scanner(System.in);
	
		String title, author;
		
		Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
		
		public static void main(String[] args) {
			Book[] book = new Book[2];
			
			for(int i=0; i<book.length; i++) {
<<<<<<< HEAD
				System.out.print("Á¦¸ñ>>");
				book.title = input.nextLine(); // book.°¡ ¿Ö ¾È¸ÔÈú±î?
				System.out.print("ÀúÀÚ>>");
				book.author = input.nextLine();
				
				book[i] = new Book(title, author);
=======
				System.out.print("ì œëª©>>");
				String title = input.nextLine();
				System.out.print("ì €ì>>");
				String author = input.nextLine();
				book[i] = new Book(title,author); //ë°°ì—´ ì›ì†Œ ê°ì²´ ìƒì„±
>>>>>>> refs/remotes/origin/master
			}
			
			for(int i=0; i<book.length; i++) {
				System.out.print(book[i].title +", "+ book[i].author + ", ");
			
				input.close();
			}
		
		}
	
	}
