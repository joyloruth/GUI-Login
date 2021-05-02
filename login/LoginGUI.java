package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LoginGUI implements ActionListener {
	
	private static JFrame frame;
	private static JPanel panel;

	private static JLabel userLabel;
	private static JLabel passwordLabel;
	private static JLabel success;
	
	private static JTextField userText;
	private static JTextField passwordText;
	private static JButton button; 


	
	
	
	public static void main(String[] args) {
		
		
		
////////////////////////////////////////////////////////////////////////////////
		
//JPANEL
		
		panel = new JPanel();
		panel.setLayout(null);	


////////////////////////////////////////////////////////////////////////////////	
 
///USER
			//JLABEL 
				userLabel = new JLabel("User");
				userLabel.setBounds(10, 20, 80, 25);
			
			//JTXTFLD		
				userText = new JTextField(20);
				userText.setBounds(100,20,175,25);
			
			//JPANEL
				panel.add(userText);
				panel.add(userLabel);
				
			
			
///PASSWORD
			//JLABEL
				passwordLabel = new JLabel("Password");
				passwordLabel.setBounds(10, 35, 100, 55);
			
			//JTXTFLD		
				passwordText = new JTextField(50);
				passwordText.setBounds(100,50,175,25);
				
			//JPANEL
				panel.add(passwordText);
				panel.add(passwordLabel);
				

//LOGIN SUCCESS
			//JLABEL
				success = new JLabel("");
				
			
			//JPANEL
				panel.setBounds(10,110,300,25);
				panel.add(success);
				
////////////////////////////////////////////////////////////////////////////////
		
//JBUTTON
				button = new JButton();
				button.setText("Login");
				button.setSize(80, 25);
				button.setBounds(130,90, 110, 25);
				button.addActionListener(new LoginGUI());
			
			//JPANEL
				panel.add(button);

////////////////////////////////////////////////////////////////////////////////			
		
//JFRAME	
				frame = new JFrame();
				frame.setSize(400, 250);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame.setTitle("Graphical User InterFace");
				frame.add(panel);
				
	
////////////////////////////////////////////////////////////////////////////////
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String user = userText.getText();
		String password = userText.getText();
		
	}
}