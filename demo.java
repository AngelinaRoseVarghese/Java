package lab3;
import javax.swing.*;
import java.awt.*;
public class demo {

	public static void main(String[] args) 
	{
		JFrame main=new JFrame();
		main.setSize(300,150);
		main.setTitle("Happy Cats");
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(3,2,10,10));
		JLabel userLabel=new JLabel("Username");
		JTextField userField=new JTextField();
		JLabel pwdLabel=new JLabel("Password");
		JPasswordField pwdField= new JPasswordField();
		JButton loginButton=new JButton("Enter");
		
		panel.add(userLabel);
		panel.add(userField);
		panel.add(pwdLabel);
		panel.add(pwdField);
		panel.add(new JLabel(" "));
		panel.add(loginButton);
		main.add(panel);
		main.setLocationRelativeTo(null);
		main.setVisible(true);

	}

}
