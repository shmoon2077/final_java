package java014_ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class MyView2  {
	//멤버 변수 (frame / button)
	JFrame frame; JButton button;
	//멤버 함수
	
	public MyView2() {
		frame = new JFrame("BOX");
		button = new JButton("BUTTON");
	}	
	
	public void create() {
		//2-1. frame.add(Component)
		//2-2. frame.size(가로/세로)
		//2-3. frame.setVisible
		frame.add(button);
		frame.setSize(300,300);
		frame.setVisible(true);
		button.addActionListener(new ActionListener() {

			@Override public void actionPerformed(ActionEvent e) { 
				JOptionPane.showMessageDialog(null, "click");
			}
			}
		);
		
	}


		
	}



public class NoNameEx002_1 {
	public static void main(String[] args) {
		new MyView2().create();
	}

}
