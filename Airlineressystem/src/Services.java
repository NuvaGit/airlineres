import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Services extends JFrame{

	JFrame frame = new JFrame();
	Services() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
        frame.setLayout(new GridLayout(3,3));
        
		frame.add(new JButton("Log into another account"));
		frame.add(new JButton("View account balance"));
		frame.add(new JButton("transfer money"));
		frame.add(new JButton("display users"));
		frame.add(new JButton("change password"));
		frame.add(new JButton("change username"));
		frame.add(new JButton("delete account"));
		frame.add(new JButton("withdraw"));
		frame.add(new JButton("deposit"));
		
		frame.setVisible(true);

		
	}
}
