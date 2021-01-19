package graficos;
//videos 65 y 66 pildoras inftcas https://www.youtube.com/watch?v=zwSub29uORc
//vamos a crear botones que afecten la lamina
//
//primera forma de crear botones y fondo laminas de colores


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones mimarco = new MarcoBotones ();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame {
	
	public MarcoBotones () {
		
		setTitle ("Botones y Eventos");
		
		setBounds (700,300,500,300);
		
		LaminaBotones milamina = new LaminaBotones ();
		
		add (milamina);
	}
}
//la sig lamina implementa el actionListener porque ella misma es la que va a recibir el evento
class LaminaBotones extends JPanel implements ActionListener {
	//primero construimos el bonton
	
	JButton botonAzul = new JButton ("Azul");
	//ahora le agregamos el boton a la lamina, asi que creamos el contructor
	
	JButton botonAmarillo = new JButton ("Amarillo");
	
	JButton botonRojo = new JButton ("Rojo");
	
	public LaminaBotones() {
		//agregamos nuestro primer boton
		
		add(botonAzul);
		
		add(botonAmarillo);
		
		add(botonRojo);
		
		botonAzul.addActionListener(this);
		/* aqui los tres eventos: primero, objeto Evento, es "Action", o hacer click
		 * El objeto fuente es "botonAzul"
		 * El listener u objeto que recibe el evento, es "this", q hace referencia a la propia clase en la que estamos q es la q recibe el evento
		 */
		 
		botonRojo.addActionListener(this);
		
		botonAmarillo.addActionListener(this);
	}
	
	public void actionPerformed (ActionEvent e) {
		/*con este method implementa la interfaz action listener recibe por parametros
		un evento de tipo evento, debe ser de tipo mouse, action event se denomina e por convencion
		ahora le decimos al methodo que debe hacer*/
		
		Object botonPulsado = e.getSource();
		
		if (botonPulsado == botonAzul) {
			
			setBackground (Color.blue);
		}
		else if (botonPulsado == botonAmarillo) {
			
			setBackground (Color.yellow);
			
		}
			
		else {
			setBackground (Color.red);
		
			}
	}
}
	

