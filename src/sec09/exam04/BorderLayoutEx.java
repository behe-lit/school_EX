package sec09.exam04;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame {
	
	
	public BorderLayoutEx() {
		setTitle("정신차려라");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); //컨텐트팬 얻어오기
		c.setLayout(new BorderLayout(30,20));
		
		c.add(new JButton("Calculate"),BorderLayout.CENTER);
		c.add(new JButton("add"),BorderLayout.NORTH);
		c.add(new JButton("sub"),BorderLayout.SOUTH);
		c.add(new JButton("mul"),BorderLayout.EAST);
		c.add(new JButton("div"),BorderLayout.WEST);
		
		setSize(300,300);
		setVisible(true);
	}
		public static void main(String[] args) {
			new BorderLayoutEx();
		}
}
