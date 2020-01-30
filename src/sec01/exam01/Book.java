package sec01.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Book {
		
	
		static Scanner sc = new Scanner(System.in);
		//필드
		String title, author;
		
		//생성자
		Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
		
		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			
			Book[] book = new Book[2]; //레퍼런스를 2개 생성
			
			for(int i=0; i<book.length; i++) {

				System.out.print("제목>>");
				String title = br.readLine(); //입력 변수, 필드값과 독립적?
				System.out.print("저자>>");
				String author = br.readLine();
				
				book[i] = new Book(title, author); //전달 인자값을 여기서 생성

			}
			
			for(int i=0; i<book.length; i++) {
				System.out.print(book[i].title +", "+ book[i].author + ", ");
			
				br.close(); //연습커밋
			}
		
		}
	
	}
