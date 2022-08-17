import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Balance extends JFrame implements ActionListener{
User user = new User();
	JFrame frame = new JFrame();
	
	
	JButton button = new JButton(user.cash);
	JButton button1 = new JButton("Back");

	Balance() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(420,420);
        frame.getContentPane().setBackground(Color.red);
        button.setBounds(50,50,100,50);
        button1.setBounds(50,100,100,50);
        button1.addActionListener(this);
        frame.add(button1);
        frame.add(button);
        frame.setVisible(true);
        
        
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== button1) {
			Services service = new Services();
		}
	}
}
