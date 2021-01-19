package graficos;
/*JPinner method / control que se desplaza
 * video 98 https://www.youtube.com/watch?v=06acFKm-kcQ&t=42s
*Inner classes / reduce code, make it shorter
 video 99 https://www.youtube.com/watch?v=nOisCjNznaE */
import javax.swing.*;
import javax.swing.JSpinner;
import java.awt.*;
import java.awt.event.*;

public class MarcoSpinner2 {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrameSpinner mimarco= new FrameSpinner();
		
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		}
}

class FrameSpinner extends JFrame {
	
	public FrameSpinner () {
		
	setBounds (550,350,550,350);
		
	add (new LaminaSpinner());
	//ver la clase spinner para ver otros formatos de fecha, hora, etc
	
	setVisible (true);
		
	}	
}

class LaminaSpinner extends JPanel{
	
	public LaminaSpinner () {
		
		//opcion1: this is instead inner class
		//JSpinner control = new JSpinner (new MiModeloJspinner());
		
		JSpinner control = new JSpinner (new SpinnerNumberModel (5,0,10,1) {
		
			public Object getNextValue () {
				
				return super.getPreviousValue ();
				
			}
			public Object getPreviousValue () {
				
				return super.getNextValue ();
			}
			
		});
		
		Dimension d = new Dimension (200,20);
		
		control.setPreferredSize(d);
		
		add(control);
		
	}
	
	//opcion 1 continuacion. esta es al forma original pero la idea es hacer inner class
	/*private class MiModeloJspinner extends SpinnerNumberModel {
		
		public MiModeloJspinner () {
			
			super (5,0,10,1);
					
		}
		
		public Object getNextValue () {
			
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue () {
		
			return super.getNextValue();
		
		}
	}*/

}
