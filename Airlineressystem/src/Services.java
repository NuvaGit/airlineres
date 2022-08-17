import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Services extends JFrame implements ActionListener{
	IdandPasswords idandPasswords = new IdandPasswords();


	JFrame frame = new JFrame();
	JButton button1 = new JButton("Log In");
	JButton button2 = new JButton("View Balance");
	JButton button3 = new JButton("Transfer");
	JButton button4 = new JButton("Users");
	JButton button5 = new JButton("Change pass");
	JButton button6 = new JButton("Change ID");
	JButton button7 = new JButton("Delete");
	JButton button8 = new JButton("Withdraw");
	JButton button9 = new JButton("Deposit");
	Services() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
        frame.setLayout(new GridLayout(3,3));
        
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

        
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);

		
		
		frame.setVisible(true);

		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			LoginPage login = new LoginPage(idandPasswords.getlogininfo());
		}
		if(e.getSource() == button2) {
			Balance balance = new Balance();
		}
	}
}
