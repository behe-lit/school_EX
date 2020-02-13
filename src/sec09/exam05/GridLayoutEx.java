package sec09.exam05;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {
	
	GridLayoutEx() {
		setTitle("����������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,2); //4X2 ������ ��ġ������ ����
		grid.setVgap(5); //���ڻ����� ��������
		
		Container c = getContentPane(); //����Ʈ�� ������
		
		c.setLayout(grid);
		
		c.add(new JLabel(" �̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �й�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" �а�"));
		c.add(new JTextField(""));
		c.add(new JLabel(" ����"));
		c.add(new JTextField(""));
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
