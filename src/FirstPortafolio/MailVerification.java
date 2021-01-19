package FirstPortafolio;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.*;

public class MailVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
			FramePassword myFrame = new FramePassword ();
			
			myFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE );

		}

	}
class FramePassword extends JFrame{
		
		public FramePassword () {
			
			setBounds (400,350,450,400);
			
			LayerPassword myLayer = new LayerPassword ();
			
			add (myLayer);
			
			setVisible (true);
			
			}
	}
	
class LayerPassword extends JPanel {
		
		public LayerPassword () {
		
		setLayout (new BorderLayout());
		
		JPanel mainLayer = new JPanel (); 
		
		mainLayer.setLayout(new GridLayout (2,2));
		
		add (mainLayer, BorderLayout.NORTH);
		
		JLabel label1 = new JLabel ("User");
		
		JLabel label2 = new JLabel ("Password");
		
		JTextField p_user = new JTextField (15);
		//number of characteres inside Label
		
		Check_password myEvent = new Check_password ();
		
		u_password = new JPasswordField (15);
		
		u_password.getDocument ().addDocumentListener(myEvent);
		
		mainLayer.add(label1);
		
		mainLayer.add(p_user);
		
		mainLayer.add(label2);
		
		mainLayer.add(u_password);
		
		JButton send = new JButton ("Send");
		
		add (send, BorderLayout.SOUTH);
		
		}
		
private class Check_password implements DocumentListener {

			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
				char [] password;	
				
				password = u_password.getPassword ();
				
					if (password.length <8 || password.length > 12) {
					
					u_password.setBackground(Color.red);
					
					} else {
					
					u_password.setBackground(Color.white);
					
					}
			
			}

			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
			
				char [] password;	
				
				password = u_password.getPassword ();
				
					if (password.length <8 || password.length > 12) {
					
					u_password.setBackground(Color.red);
					
					} else {
					
					u_password.setBackground(Color.white);
					
					}
			}
			

			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
		}
		
		JPasswordField u_password;
	}