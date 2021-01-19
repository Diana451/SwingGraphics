package graficos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.geom.*;
import javax.swing.*;


public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	MarcoConColor mimarco = new MarcoConColor ();
		
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	mimarco.setVisible(true);
		
	}

}

class MarcoConColor extends JFrame {
	
	public MarcoConColor() {
		
	setTitle ("Prueba de Colores");
		
	setSize(400,400);
		
	//tenemos que instanciar la clase lamina para hacerla visible	
	LaminaConColor milamina = new LaminaConColor();
	
	add (milamina);
	milamina.setBackground(Color.PINK);
	//tambien puedes usar system color para poner el color por defecto
	//de el sistema operativo, por ej windows:
	///milamina.setBackground(SystemColor.window);
	
	}
}

class LaminaConColor extends JPanel {
	
	public void paintComponent (Graphics g) {
	
	super.paintComponent(g);
	Graphics2D g2 = (Graphics2D) g;
	
	//se debe instanciar la clase recyangle2D, asi que no se puede instanciar
	//entonces usamos rectangle2d, que se puede instanciar y hereda de rectangle
	
	Rectangle2D rectangulo = new Rectangle2D.Double (100,100,200,150);
	//primero establezco elr ectangulo, luego le dpongo color:
	g2.setPaint(Color.blue);
	g2.draw(rectangulo);
	g2.setPaint(Color.RED);
	//luego escojo otro color para rellenar el rectangulo
	g2.fill(rectangulo);
	//g2.draw (rectangulo);
	
	Ellipse2D elipse = new Ellipse2D.Double();
			
	//elipse2D es abstracta, ese constructor no recbe parametros
	
	elipse.setFrame(rectangulo);
	Color miColor = new Color (125,189,200);
	//este color lo puedes usar cuando quieras, ejemplo:
	//g2.setPaint (miColor);
	g2.setPaint(new Color (109,172,59).darker().darker());
	//puedes usar.brigter(), o.darker, hasta 3 veces, segun desees
	//puedes usar phoshop para saber que color number
	g2.fill(elipse);
	//lo que vamos a hacer a dibujar la elipse dentro de este cuadrado 
	g2.draw(elipse);
	
	
	}
}
