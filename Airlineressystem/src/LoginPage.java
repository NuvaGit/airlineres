import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	JFrame frame = new JFrame();
	JButton loginbutton = new JButton("login");
	JButton resetbutton = new JButton("reset");
	JButton signupbutton = new JButton("SIGN UP");
	JTextField UserIDField = new JTextField();
	JPasswordField UserPasswordField = new 	JPasswordField();
	JLabel UserIDLabel = new JLabel("user id");
	JLabel UserPasswordLabel = new JLabel("password");
	JLabel messagelabel = new JLabel();
	JPanel panel3 = new JPanel();
	ImageIcon icon = new ImageIcon("airplane.png");
	JLabel label = new JLabel();



	

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	LoginPage(HashMap<String,String> logininfooriginal) {
		
	
				logininfo = logininfooriginal;
		
		UserIDLabel.setBounds(50,100,75,20);
		UserPasswordLabel.setBounds(50,150,75,20);
		panel3.setBounds(45,90,300,100);
		panel3.setBackground(Color.black);
		messagelabel.setBounds(125,250,250,35);
		messagelabel.setFont(new Font(null,Font.ITALIC,25));
		
		UserIDField.setBounds(125,100,200,25);
		UserPasswordField.setBounds(125,150,200,25);
		
		loginbutton.setBounds(125,200,100,25);
		loginbutton.setFocusable(false);
		loginbutton.addActionListener(this);
		
		resetbutton.setBounds(225,200,100,25);
		resetbutton.setFocusable(false);
		resetbutton.addActionListener(this);
		
		signupbutton.setBounds(125,230,200,25);
		signupbutton.setFocusable(false);
		signupbutton.addActionListener(this);
		
		
		label.setIcon(icon);
        label.setBounds(200, 20, 50, 50);		

		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.add(UserIDLabel);
		frame.add(UserPasswordLabel);
		frame.add(messagelabel);
		frame.add(UserIDField);
		frame.add(UserPasswordField);
		frame.add(loginbutton);
		frame.add(resetbutton);
		frame.add(signupbutton);
		frame.add(panel3);
		frame.add(label);
		frame.setResizable(true);
		frame.getContentPane().setBackground(Color.red);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == resetbutton) {
			UserIDField.setText("");
			UserPasswordField.setText("");
		}
		if(e.getSource() == signupbutton) {
			Signuppage signup = new Signuppage();
		}
		if(e.getSource() == loginbutton) {
			String userID = UserIDField.getText(); 
			String password = String.valueOf(UserPasswordField.getPassword());	
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					MainPage main = new MainPage();
				}
			}
		}
	}
}
