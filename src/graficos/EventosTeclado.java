package graficos;
//video 71 crear oyente para los eventos de teclado, keyListener
//https://www.youtube.com/watch?v=hgHvmjyHxpU&t=419s

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTeclas mimarco = new MarcoConTeclas ();
	
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConTeclas extends JFrame {

	public MarcoConTeclas () 
	{
	setVisible (true);
	
	setBounds (700,300,600,450);
	
	EventosDeTeclado tecla = new EventosDeTeclado ();
	//aqui instanciamos la classe eventosDeTeclado

	
	addKeyListener (tecla);
	/*como yacreamos la instancia, ahora ponemos nuestro objeto a la
	escucha de los eventos de teclado*/
	}
}
/*la siguiente es la clase/objeto oyente.
por eso en el marco de la clase anterior ponemos esta clase a la escucha*/

class EventosDeTeclado implements KeyListener{
/*en estos tres metodos, cuando quiero que se desensacede la accion, 
cuando el usuario presiona la tecla, cuando la suelta, o cuando ha hecho
las dos cosas */
	
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
			char letra = e.getKeyChar()	;
			System.out.println (letra);
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int codigo = e.getKeyCode();
		
		System.out.println (codigo);
		
		/*con el cog getKeyCode, devuelve el cod de tipo entero asociado con la tecla
		 * evento
		 * el numero que muestra el display puede ser corroborado yendo a la 
		 * clase ava.awt.event, Class KeyEvent, y alli en vk J, medio triki, not sure how*/
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
