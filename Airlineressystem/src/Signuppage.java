import java.awt.Color;
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

public class Signuppage extends JFrame implements ActionListener{
	
	JLabel UserPasswordLabel = new JLabel("password");
	JLabel UserIDLabel = new JLabel("user ID");
    JPanel panel1 = new JPanel();
	JFrame frame = new JFrame();
	ImageIcon icon = new ImageIcon("airplane.png");
	JLabel label = new JLabel();
	JTextField UserIDField = new JTextField();
	JPasswordField UserPasswordField = new 	JPasswordField();
	JButton signupbutton = new JButton("SIGN UP");

	
	
	HashMap<String,String> logininfo = new HashMap<String,String>();

	

	Signuppage() {


		
		UserIDLabel.setBounds(50,100,75,20);
		UserPasswordLabel.setBounds(50,150,75,20);
		panel1.setBounds(45,90,300,100);
        panel1.setBackground(Color.black);
        
        UserIDField.setBounds(125,100,200,25);
		UserPasswordField.setBounds(125,150,200,25);
        
        label.setIcon(icon);
        label.setBounds(200, 20, 50, 50);		
        
        signupbutton.setBounds(125,230,200,25);
		signupbutton.setFocusable(false);
		signupbutton.addActionListener(this);
		
		
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	frame.setSize(420,420);
	frame.getContentPane().setBackground(Color.cyan);
	frame.add(label);
	frame.add(UserIDField);
	frame.add(UserPasswordField);
	frame.add(UserIDLabel);
	frame.add(UserPasswordLabel);
	frame.add(panel1);
	frame.add(signupbutton);
	frame.setLayout(null);
	frame.setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == signupbutton) {
			String userID = UserIDField.getText(); 
			String password = String.valueOf(UserPasswordField.getPassword());	
			logininfo.put(userID, password);
			
			IdandPasswords idandPasswords = new IdandPasswords();
			idandPasswords.setidpass(userID,password);
            LoginPage login = new LoginPage(idandPasswords.getlogininfo());
            
            // sign up finally done
		}
	}
}
