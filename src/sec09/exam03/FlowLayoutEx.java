package sec09.exam03;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {
	
	FlowLayoutEx() {
		setTitle("정신차려라");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); //컨텐트팬 얻어오기
		
		c.setLayout(new FlowLayout(FlowLayout.CENTER,30,40));
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300,300);
		setVisible(true);
		
	}
		public static void main(String[] args) {
			new FlowLayoutEx();
		}
}
