package graficos;
/*video 89 https://www.youtube.com/watch?v=uQWVgMeOeHw
usuario, contraseno,caracteres ocultos en contrasena, borras carracteres
activa color con uno o mas caracteres*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;


import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;


public class CampoPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPassword mimarco = new MarcoPassword ();
		
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	 
		}

	}

	class MarcoPassword extends JFrame {
	
	public MarcoPassword () {
		
		setBounds (400,300,550,400);
	
		LaminaPassword milamina = new LaminaPassword ();
	
		add (milamina);
	
		setVisible (true);
	
		}
	
	}

	class LaminaPassword extends JPanel {
	
	public LaminaPassword () {
		
		setLayout (new BorderLayout ());
		
		//debemos creer dos laminas y doistribuirlas. SEGUNDA LAMINA:
		JPanel lamina_superior = new JPanel ();
		
		lamina_superior.setLayout(new GridLayout (2,2));
		//nueva lamina con dos columnas dos filas
		
		add (lamina_superior, BorderLayout.NORTH);
		
		//en la lamina superior habran dos etiquetas, una es texto de usuario y otra de contrasena
		
		JLabel etiqueta1 = new JLabel ("Usuario");
				
		JLabel etiqueta2 = new JLabel ("contrasena");
		
		JTextField c_usuario = new JTextField (15);
		//haremos que aparezxcan asteriscoscuando introducen la contrasena:
		
		Comprueba_pass mievento = new Comprueba_pass ();
		
		c_contra = new JPasswordField (15);
		
		c_contra.getDocument().addDocumentListener (mievento);
		
		
		//ahora le diremos donde ubicarlos:
		
		lamina_superior.add(etiqueta1);

		lamina_superior.add(c_usuario);
		
		lamina_superior.add(etiqueta2);
		
		lamina_superior.add(c_contra);
		
		JButton enviar = new JButton ("Enviar");
		
		add (enviar, BorderLayout.SOUTH);
		
		}
	
		
	private class Comprueba_pass implements DocumentListener {

		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			//este metodo se ejecuta cada vez q el usuario introduce un caracter
			char [] contrasena;	
			
			contrasena = c_contra.getPassword ();
			/*de este modo almaceno en el array cada uno de los caracteres
			 * que tiene la contrasena
			 */
				if (contrasena.length <8 || contrasena.length > 12) {
				
				c_contra.setBackground(Color.red);
				
				} else {
				
				c_contra.setBackground(Color.white);
				
				}
		}

		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			char [] contrasena;	
			
			contrasena = c_contra.getPassword ();
			/*de este modo almaceno en el array cada uno de los caracteres
			 * que tiene la contrasena*/
			 
				if (contrasena.length <8 || contrasena.length > 12) {
				
				c_contra.setBackground(Color.red);
				
				} else {
				
				c_contra.setBackground(Color.white);
				
				}
		}

		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
		}
		
	}
	
	JPasswordField c_contra;
	//para que me apliquye en todos los metodos lo defino en la clase principal
}