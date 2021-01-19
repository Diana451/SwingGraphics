package graficos;
//https://www.youtube.com/watcVideo 67 PI otra forma de hacer botones con fondos de colores: https://www.youtube.com/watch?v=R8fnLtVuLxA&t=205s
//segunda forma de hacer botones y fondo lamina colores
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PruebaEventos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoBotones2 mimarco = new MarcoBotones2 ();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones2 extends JFrame {
	
	public MarcoBotones2 () {
		
		setTitle ("Botones y Eventos");
		
		setBounds (700,300,500,300);
		
		LaminaBotones milamina = new LaminaBotones ();
		
		add (milamina);
	}
}

class LaminaBotones2 extends JPanel  {
	//para este ej quitamos la interfaz action listener
	
	JButton botonAzul = new JButton ("Azul");
	//ahora le agregamos el boton a la lamina, asi que creamos el contructor
	
	JButton botonAmarillo = new JButton ("Amarillo");
	
	JButton botonRojo = new JButton ("Rojo");
	
	public LaminaBotones2 () {
		//agregamos nuestro primer boton
		
		add(botonAzul);
		
		add(botonAmarillo);
		
		add(botonRojo);
		
		ColorFondo2 Amarillo = new ColorFondo2 (Color.yellow);
		
		ColorFondo2 Azul = new ColorFondo2 (Color.blue);
		
		ColorFondo2 Rojo = new ColorFondo2 (Color.red);
		
		botonAzul.addActionListener(Azul);
		/* aqui los tres eventos: primero, objeto Evento, es "Action", o hacer click
		 * El objeto fuente es "botonAzul"
		 * El listener u objeto que recibe el evento, es "this", q hace referencia a la propia clase en la que estamos q es la q recibe el evento
		 */
		 
		botonRojo.addActionListener(Rojo);
		
		botonAmarillo.addActionListener(Amarillo);
		
	//en esta area borramos el action performance que es el que se ejecuta
	//cuando tiene lugar un evento, o action event, desaparece en esta clase
	}
	
private class ColorFondo2 implements ActionListener {
	
	//creamos el contructor de esta clase
	public ColorFondo2 (Color c) {
		
		Color ColorDeFondo2 = c;
		
		
	}
	public void actionPerformed2 (ActionEvent e) {
		
		setBackground (colorDeFondo);
		
	}
	private Color colorDeFondo;
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
	
}
