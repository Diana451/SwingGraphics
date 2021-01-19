package graficos;
/*videos 86 https://www.youtube.com/watch?v=pl_FZDDDPZY&t=148s
 * video 87 https://www.youtube.com/watch?v=Fgt_ysSAXn8
 * evalua direccion correo electronico recorriendo un string
 * comprobar email, coprobar texto d ecuadro en consola
 * ponemos boton a escucha, cuando se pulsa debe jeecutar accion
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoTexto mimarco = new MarcoTexto ();
	
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		//marco.setVisible (true);
	}

}

class MarcoTexto extends JFrame {
	
		public MarcoTexto() {

			setBounds (600,300,600,350);
	
			LaminaTexto milamina = new LaminaTexto  ();
	
			add (milamina);
	
			setVisible (true);
	
		}
}

class LaminaTexto extends JPanel {
	//creamos los botones con J Button
	
		 public LaminaTexto() {
			 
			 setLayout (new BorderLayout ());
			 
			 JPanel milamina2 = new JPanel ();
			 
			 milamina2.setLayout(new FlowLayout());
			 
			 resultado = new JLabel ("", JLabel.CENTER);
			 //iniciamos el JBale y ahotra debemos agregarlo
			 
			 JLabel texto1 = new JLabel ("Email");
			 //el orden en que aparecen estos elementos es el orden ewn que se agregan
			 //esto depende de la clase flow Layout
			 
			 milamina2.add (texto1);
		
			 campo1 = new JTextField(20);
			 //constructor de tipoString, o y de entero, depende...
			 milamina2.add (campo1);
			 //agrega a ala lamina 2 el cuadro de texto
			 
			 add (resultado, BorderLayout.CENTER);
			 //lo agregamos aqui para que aparezca depsues del campo
			 
	
			 //System.out.println (campo1.getText());
			 //improme en consiola lo que esta en el cuadro
	
			 JButton miboton = new JButton ("Comprobar");
	
			 DameTexto mievento = new DameTexto ();
			 // debo crear esta clase mas tarde
		
			 miboton.addActionListener (mievento);
			 //pongo mi boton a la escucha del evento correspondiente
	
			 milamina2.add (miboton);
			 //tambien agregamos a esta lamina 2 el boton
			 
			 add (milamina2, BorderLayout.NORTH);
			 
			 
		 	}
		 
private class DameTexto implements ActionListener {
			 //nadie fuera de esta clase puede modificar este evento

		public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int correcto = 0;
				
				String email  = campo1.getText().trim ();
				
				for (int i = 0; i<email.length(); i++){
					
					
					if (email.charAt(i) == '@'){
						
						correcto++;
						/*le pedimos que icnremente la variable correcto en 1
						entonces, al salir de for correcto sera igual a 1
						 * en caso que nno haya arroba, valdra 0 porque nunca entraria emn el if
						 * si hay varios @, entraria varias veces en if e incrementaria varias veces
						 * el valor de correcto
						 */
						}
					
					}
					
			    if (correcto != 1) {
					
					resultado.setText("Incorrecto");
			    						
					} else {
						
						resultado.setText("Correcto");;
					}
				
				//esto es lo que pasara cuando el ususario haga click en el boton correspodiente
				//System.out.println(campo1.getText().trim ());
				/*con este methodo, cuando presionamos el boton dale, nos va a mostrar en la consola el texto que escribamos 
				dentro de la ventana.
				el trim me quita los especios
				campo1 es metod definido en el contructor no visto de fuera, entonces lo definimos en la clase as private
				para que no se pueda acceder a ese campo de clase por fuera de la clase*/
				}
				 			 
		 	}
		private JTextField campo1;
		 //lo defino en la clase, y arriba queda iniciado en el contructor. 
		 //este variabel debe estar dentro de la Lamina class

		private JLabel resultado;
		//este lo iniciamos en la clase lamina
}



	
		

	


