package sec01.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Book {
		
	
		static Scanner sc = new Scanner(System.in);
		//�ʵ�
		String title, author;
		
		//������
		Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
		
		public static void main(String[] args) throws IOException {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			
			Book[] book = new Book[2]; //���۷����� 2�� ���� (���⼭�� ��ü�� �����Ȱ��� �ƴ�)
			
			for(int i=0; i<book.length; i++) {

				System.out.print("����>>");
				String title = br.readLine(); // Ŭ����,�ν��Ͻ�����ʹ� ������ ������
				System.out.print("����>>");
				String author = br.readLine();
				
				book[i] = new Book(title, author); //��ü�� ���⼭ ����, �׷� �迭�� ������ ��ü�� ���� ��ü�ΰ�?

			}
			
			for(int i=0; i<book.length; i++) {
				System.out.print(book[i].title +", "+ book[i].author + ", ");
			
				br.close();
			}
		
		}
	
	}
