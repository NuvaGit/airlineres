import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPage extends JFrame implements ActionListener{

	JFrame frame = new JFrame();
	JLabel label = new JLabel("Bank of Nuva");
	JPanel panel = new JPanel();
    JButton accountservice = new JButton("service on account");
    JButton action = new JButton("Actions");
    ImageIcon icon = new ImageIcon("airplane.png");
    JLabel label1 = new JLabel();
	

	MainPage() {
		
		label.setFont(new Font("Comic Sans",Font.CENTER_BASELINE,24));
		label.setBounds(0,0,200,100);
		
		panel.setBounds(0, 100, 420, 320);
		panel.setBackground(Color.red);
		
		accountservice.setBounds(30, 300, 200, 30);
		accountservice.addActionListener(this);
		action.setBounds(230,300,200,30);
		action.addActionListener(this);
		
		label1.setIcon(icon);
        label1.setBounds(200, 20, 50, 50);
        
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);
		frame.add(panel);
		frame.add(accountservice);
		frame.add(action);
		frame.add(label1);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == accountservice ) { 
			Services Services = new Services();
			
		}
		if(e.getSource() == action) {
			Actions action = new Actions();
		}
	}
}
