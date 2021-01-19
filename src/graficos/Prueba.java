package graficos;

/*cuando el usuario introduce o borra texto
util para crear contrasenas y ver su validez
*/
//video 88 https://www.youtube.com/watch?v=-Q_gHYLTRPQ
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;


public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPrueba mimarco = new MarcoPrueba ();
		
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	
	
	}

}

class MarcoPrueba extends JFrame {
	
	public MarcoPrueba () {
		
		setBounds (500,300,500,350);
	
		LaminaPrueba milamina = new LaminaPrueba ();
	
		add (milamina);
	
		setVisible (true);
	
		}
	
}

class LaminaPrueba extends JPanel {
	
	public LaminaPrueba () {
		
		JTextField micampo = new JTextField (20);
		
		EscuchaTexto el_evento = new EscuchaTexto ();
		
		Document midoc = micampo.getDocument();
		
		midoc.addDocumentListener(el_evento);
		
		add (micampo);
	}

	private class EscuchaTexto implements DocumentListener {

		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println ("Has insertado texto");
		}

		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println ("Has borrado texto");
		}

		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
	
		
		
	}
}