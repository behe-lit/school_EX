package sec09.exam06;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame {

	public NullContainerEx() {
		
		setTitle("정신차려라");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); //배치관리자 제거
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		
		
		
		for (int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i));
					b.setLocation(i*15, i*15); //버튼 위치설정
					b.setSize(50,20); // 9개의 버튼 크기 50X20
					c.add(b); // 버튼을 컨테트팬에 부착
		}		
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
			new NullContainerEx();
	}

}
