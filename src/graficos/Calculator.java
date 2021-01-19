package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameCalculator myFrame = new FrameCalculator();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFrame.setVisible(true);
	}

}

class FrameCalculator extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameCalculator () {
		
		setTitle ("Calculator");
		
		setBounds (500,300,450,300);
		
		SheetCalculator mySheet = new SheetCalculator ();
		
		add (mySheet);
		
			
	}
}

class SheetCalculator extends JPanel { 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SheetCalculator () {
		
		start = true;
		/*we put that here so every new time it opens, the condition in InsertNumero class will be true
		as the condition written there says.*/
		 
		setLayout (new BorderLayout());
		
		screen = new JButton ("0");
		
		screen.setEnabled(false);
		
		//enables to show 0 on screen
		
		add (screen, BorderLayout.NORTH);
		
		myScreen1 = new JPanel ();
			
		myScreen1.setLayout(new GridLayout (4,4));
		
		ActionListener insertar = new InsertaNumero ();
		
		//to insert the second parameter
		
		ActionListener orden = new AccionOrden();
		//inserting buttons in the order we want to appear:
		ponerBoton ("7", insertar);
				
		ponerBoton ("8", insertar);
		
		ponerBoton ("9", insertar);
		
		ponerBoton ("/", orden);
		
		ponerBoton ("4", insertar);
		
		ponerBoton ("5", insertar);
		
		ponerBoton ("6", insertar);
		
		ponerBoton ("*", orden);
		
		ponerBoton ("1", insertar);
		
		ponerBoton ("2", insertar);
		
		ponerBoton ("3", insertar);
		
		ponerBoton ("-", orden);
		
		
		ponerBoton ("0", insertar);
		
		ponerBoton (".", orden);
		
		ponerBoton ("=", orden);
		
		ponerBoton ("+", orden);
		
				
		add (myScreen1, BorderLayout.CENTER);
		
		lastOperation = "=";
		
	}
	
	private void ponerBoton (String rotulo, ActionListener oyente) {
		
		JButton boton = new JButton (rotulo);
	
		boton.addActionListener(oyente);
		//Listening to each one of the buttons, once you press it, the action is saved in the object that listens to.
	
		myScreen1.add (boton);
	
	}	

	private class InsertaNumero implements ActionListener {

	public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
		String entrada = e.getActionCommand();
		/*it saves into the variable the text the button that creates the event.getAction returns the command
			string related to the action*/
			
			
			if (start) {
					/*if (principio == true) It is the same than the original because no providing a comparison operator it will be equal to true.*/
				
				screen.setText("");
			
				start = false;
							
				}
			
			screen.setText (screen.getText() + entrada);
			/*BUTTON TEXT. Writing the text at the screen. It will add what you had written before
			 and then you can add the very new thing */
		}
				 
	 }
	 
	 private class AccionOrden implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String operacion  = e.getActionCommand();
			//To save the String that correspond with the text of the button.
			
						
			calcular (Double.parseDouble(screen.getText()));
			/*ParseDouble to convert string to double, take what is at the screen, "7" to 7.0, and pass that value
			 * as parameter for the calculation. */
			 
			lastOperation = operacion;
			//contents last operation made by the user.
			 
			start = true;
			//Once you press a button that contains any operation like *, you are able to writre a number
			
		}
		//Next method is the main for calculations, so we have to save what user does:
		
		public void calcular (double x) {
			//x represents the value shown in the screen 
			
			if (lastOperation.equals("+")) {
				
				results+=x;
				
				System.out.println (results);
			}
			else if (lastOperation.equals("-")) {
				
				results-=x;
			}
				
			else if (lastOperation.equals("*")) {
					
				results*=x;
			}
					
			else if (lastOperation.equals("/")) {
						
						results/=x;
			}
			else if (lastOperation.equals("=")){
				
				results = x;
			}

			screen.setText("" + results);
			
			/*pantalla.setText (resultado). This alone has an error because setText is String while resultado is double
			To sort it, we put a String concatenated to resultado.So now it has two parameters and works*/
		}
	}	 
			
	 private JPanel myScreen1;
	//used outside the constructor so can be used in the whole program
	
	private JButton screen;
		
	private boolean start;
	//Boolean by defect is false unless you change the value of it when initialising it
	
	//Now we create a variable that saves the information that we keep saving:
	
	private double  results;
	
	private String lastOperation;
	//to save last operation user did in the calculator

			
}