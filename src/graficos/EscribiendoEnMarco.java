package graficos;

import javax.swing.*;
import java.awt.*;
public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTexto mimarco = new MarcoConTexto ();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	

}

class MarcoConTexto extends JFrame {
	
	public MarcoConTexto() {
		setVisible (true);
		setSize(600,450);
		setLocation (400,200);
		setTitle ("primer texto");
		
	Lamina milamina = new Lamina ();
	add(milamina);
  }

}

class Lamina extends JPanel{
	//con la clase lamina creamos la primera lamina del grphic
	
	public void paintComponent (Graphics g){
	    //este method pertenece a la clase component, y Jpanel hereda de component
		//el triangulo verde measn que estas sobre escribiendo el method
		//que heredaste de J Panel
		
		super.paintComponent(g);
		//llamamos al methodo pain comp here and after le decimos
		//que escribir en el string y los 100 100 x ej
		
		g.drawString("My First Swing Text", 100, 100);
		//cuando pones g te aparece toda la lista de los metodos que son de la 
		//clase graphics, que sirven para dibujar
	}
	
	

}