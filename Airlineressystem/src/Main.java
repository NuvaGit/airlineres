import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame implements ActionListener{

JFrame frame = new JFrame();
JPanel panel1 = new JPanel();
JButton enter = new JButton("Enter");
JLabel message = new JLabel("Bank of Nuva");
IdandPasswords idandPasswords = new IdandPasswords();
ImageIcon icon = new ImageIcon("airplane.png");
JLabel label = new JLabel();


	Main() {
		
		
		
        enter.setBounds(70,140,200,60);
		enter.setFocusable(false);
		enter.addActionListener(this);
		
		message.setBounds(0,0,200,100);
		message.setFont(new Font("Comic Sans",Font.BOLD,28));
		panel1.setBounds(45,120,250,100);
        panel1.setBackground(Color.black);
        panel1.setOpaque(true);
		
        label.setIcon(icon);
        label.setBounds(200, 20, 50, 50);	
        
        frame.add(enter);
        frame.add(panel1);
        frame.add(message);
        frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.red);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == enter) {
			LoginPage login = new LoginPage(idandPasswords.getlogininfo());
		}
		
	}
}

