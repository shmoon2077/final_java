package java014_ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class MyView implements ActionListener {
	//멤버 변수 (frame / button)
	JFrame frame; JButton button;
	//멤버 함수
	
	public MyView() {
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
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(button, "click!");

		
	}
}


public class NoNameEx002 {
	public static void main(String[] args) {
		new MyView().create();
	}

}
