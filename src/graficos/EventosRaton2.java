package graficos;
//video 72 eventos de raton https://www.youtube.com/watch?v=SMLwQxlPa9w&t=491s

import java.awt.event.*;
import javax.swing.JFrame;


public class EventosRaton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRatona mimarca = new MarcoRatona ();
	
		mimarca.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRatona extends JFrame {

	public MarcoRatona() 
	{
	setVisible (true);
	
	setBounds (700,300,600,450);
	
	//determinamos cual es nuestro objeto oyente, en este caso ponemos el marco a la escucha
	
	EventosDeRat EventoRatona= new EventosDeRat ();
	
	addMouseMotionListener  (EventoRatona);
	
	}
}

//creamos clase para implementar la interface mouse listener

/*normalmente no usas todo los 5 methods, en ese caos puedes usar la sig clase,
los puedes dejar en blanco o usar la clase mouseAdaptar, heredar de esa calse adaptadora*/

class EventosDeRat implements MouseMotionListener {

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println ("Estas arrastrando el raton");
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println ("Estas moviendo el raton");
		
	}
	
	

}

	
