package lab3;
import javax.swing.*;
import java.awt.*;
public class SignUp
{
	public static void main(String[] args) 
	{
		JFrame signUp=new JFrame();
		signUp.setSize(600,300);
		signUp.setTitle("Sign Up");
		JPanel panel= new JPanel();
		panel.setLayout(new GridLayout(6,2,10,10));
		JLabel nameLabel=new JLabel("Name");
		JTextField nameField=new JTextField();
		JLabel emailLabel=new JLabel("Email");
		JTextField emailField=new JTextField();
		JLabel genderLabel=new JLabel("Gender");
		JRadioButton male=new JRadioButton("Male");
		JRadioButton female=new JRadioButton("Female");
		ButtonGroup genderButtonGroup= new ButtonGroup();
		genderButtonGroup.add(male);
		genderButtonGroup.add(female);
		JPanel genderPanel=new JPanel();
		genderPanel.setLayout(new FlowLayout());
		genderPanel.add(male);
		genderPanel.add(female);
		JLabel countryLabel=new JLabel("Countries");
		String[] countries= {"India","Korea","Thailand","Finland"};
		JComboBox<String> countryBox= new JComboBox<>(countries);
		JLabel addressLabel=new JLabel("Address");
		JTextArea addressArea=new JTextArea(3,4);
		JButton submitButton=new JButton("Submit");
		
		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(emailLabel);
		panel.add(emailField);
		panel.add(addressLabel);
		panel.add(addressArea);
		panel.add(genderLabel);
		panel.add(male);
		panel.add(female);
		panel.add(countryLabel);
		panel.add(countryBox);
		panel.add(submitButton);
		panel.add(new JLabel(" "));
		
		signUp.add(panel);
		signUp.setLocationRelativeTo(null);
		signUp.setVisible(true);
	}

}
