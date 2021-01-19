package graficos;
/*video 74 y 75, eventos de foco https://www.youtube.com/watch?v=LMhk2Z7PcoE
https://www.youtube.com/watch?v=NvNZNEVWYO8 */

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.*;


public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoFoco mimarco = new MarcoFoco ();
	
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoFoco extends JFrame {

	public MarcoFoco() 
	{
	setVisible (true);
	
	setBounds (300,300,600,450);
	
	add (new LaminaFoco ());
	
	}
}

class LaminaFoco extends JPanel {
	
/*This method is needed to draw something on JPanel other than
 *  drawing the background color. This method already exists in a JPanel class so that
 *   we need to use the super declaration to add something to this method and takes Graphics objects as parameters
 */
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		setLayout (null);
		//invalidamos la configuracion de posicion por defecto del contendio de la ventana
		
		cuadro1 = new JTextField ();
		
		cuadro2 = new JTextField ();
	
		//ahora le damos tamano y posicion a la ventana porque invalidadmos la one by defect
		
		cuadro1.setBounds(120, 10, 150, 20);
		
		cuadro2.setBounds(120, 50, 150, 20);
		
		//ahora agregamos los cuadros a la lamina
		
		add(cuadro1);
		
		add (cuadro2);
		
		LanzaFocos elFoco = new LanzaFocos ();
		
		cuadro1.addFocusListener(elFoco);
	}
	
private class LanzaFocos implements FocusListener {
		/*cuando ocurre un evento de foco se construye un objeto de tipo FocusEvent
		 * el cual se almacena en el parametro e, q es el argumento de los dos sig metods
		 * PRIVAtE LANZA FOCOS  es la clase oyente, dentro de la lamina, lo que nos permite acceder DESDE los metodos 
		 * focusGained y FocusLost HASTA los objetos cuadros 1 y 2, que pertenencen a la clase padre
		 */

		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub, cuando el objeto gana la escucha
						
		}

		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub, cuando el objeto PIERDE la escucha
			
			String email = cuadro1.getText();
			
			boolean comprobacion = false;
			
			for (int i = 0; i<email.length(); i++) {
				
				if (email.charAt(i) == '@') {
					
					comprobacion = true;
				}
			}
			
			if (comprobacion) {				
				
				System.out.println("Correcto");
				
			} else {
				
				System.out.println("Incorrecto");
			}
			// con este puedes ver si se ilumina o no,System.out.println("Has perdido el foco");
		}
		//puede lanzar error en LanzaFocus si no has implementado lso emtodos de focusListener
	}

//class JtextField, usa constructores para crear nuevos campos de texto
	
	JTextField cuadro1;
	
	JTextField cuadro2;
	
	//ahora le damos tamano y posicion a la ventana porque invalidadmos la one by defect
	
}
//ahora vamoa a crear la clase oyente, crear la interface listener

