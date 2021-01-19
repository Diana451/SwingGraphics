package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoArea mimarco = new MarcoArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}
	
}
class MarcoArea extends JFrame {
	
	public MarcoArea () {
		
		setBounds (500,300,500,650);
		
		LaminaArea milamina = new LaminaArea ();
		
		add (milamina);
		
		setVisible (true);
		
		}
}

class LaminaArea extends JPanel {
	
	public LaminaArea () {
		
		miarea = new JTextArea (8,20);
		/*este mnetodo set the behaviour by deffect of the area to writte se expande o contrae cada vez que escribiimos texto*/
		
		JScrollPane laminaBarras = new JScrollPane(miarea);
		/*con este metodo le das al area de tecto barras de desplazamiento*/
		
		
		//miarea.setLineWrap(true);
		/*el programa tiene un area determina y solo cabe el texto a lo largo pero aun no evita el salto de linea a lo alto
		no se puede meter barra de scroll en el elemento pero si se puede crear esa caracteristica en la lamina */
		add (laminaBarras);
		
		JButton miboton = new JButton ("Dale");
		//este boton debe estar a kla aescucha delke vento click
		
		miboton.addActionListener(new GestionaArea());
		
		add (miboton);
	}
	
	private class GestionaArea implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println (miarea.getText ());
		}
		
		
	}
	private JTextArea miarea;
}