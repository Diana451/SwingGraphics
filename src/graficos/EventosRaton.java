package graficos;
//video 72 eventos de raton https://www.youtube.com/watch?v=SMLwQxlPa9w&t=491s

import java.awt.event.*;
import javax.swing.JFrame;


public class EventosRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton mimarco = new MarcoRaton ();
	
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRaton extends JFrame {

	public MarcoRaton() 
	{
	setVisible (true);
	
	setBounds (700,300,600,450);
	
	//determinamos cual es nuestro objeto oyente, en este caso ponemos el marco a la escucha
	
	EventosDeRaton EventoRaton= new EventosDeRaton ();
	
	addMouseListener (EventoRaton);
	
	}
}

//creamos clase para implementar la interface mouse listener

/*normalmente no usas todo los 5 methods, en ese caos puedes usar la sig clase,
los puedes dejar en blanco o usar la clase mouseAdaptar, heredar de esa calse adaptadora*/

class EventosDeRaton extends MouseAdapter {
	
	/*public void mouseClicked(MouseEvent e)
	{
		//System.out.println ("Has hecho click buddita");
		
		//System.out.println ("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
		//inovcando get sabemos la posicion del mouse en la pantalla, ventana...
		
		//System.out.println (e.getClickCount());
		//para saber cuantos clicks hacemso sobre la pantalla
	
	}


//para usar todos lso metodos uncoment the class to see all the options you have
/*class EventosDeRaton implements MouseListener{

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println ("Has hecho click buddy");
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println ("Acabas de presionar el mouse");
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println ("Acabas de levantar el mouse");
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println ("Acabas de entrar");
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println ("Acabas de salir");
		
	}
	
}*/

public void mousePressed (MouseEvent e){
	
	//LA SIGUIENTE es una opcion cuando sabemos el valor de dar click a mouse izquierdo
	/*if (e.getModifiersEx() == 1024){
		
		System.out.println ("Has pulsado el boton izquierdo");
		}
	}*/
//with the next condition we will know what aprt of the mouse the user is moving.
		if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
		
			System.out.println ("Has pulsado el boton izquierdo");
		
		}else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
		
			System.out.println ("Has pulsado la rueda del Mouse");
		
		}else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			
			System.out.println ("Has pulsado el boton derecho");
		}
	
	}

}

	//esta es una alternativa para saber qu[e botones del mouse pulsamos:
	/*System.out.println (e.getModifiersEx());
	al compilar muestra el valor de las constantes de clase que vienen dentro
	 * de mouseEvent,1024,2048, y 4096, segun click derecho, izquierdo y el circulo del mouse*/
