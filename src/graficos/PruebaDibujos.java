package graficos;
import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class PruebaDibujos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ahora vamos a instanciar la clase y ahcerla visible:
		MarcoConDibujos mimarco = new MarcoConDibujos ();
		
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConDibujos extends JFrame {
	
	public MarcoConDibujos () {
		
		setTitle ("prueba de Dibujo");
		
		setSize(400,400);
		
	//tenemos que instanciar la clase lamina para hacerla visible	
	LaminaConFiguras milamina = new LaminaConFiguras();
	
	add (milamina);
	}
}

class LaminaConFiguras extends JPanel {
	
	public void paintComponent (Graphics g) {
	
	super.paintComponent(g);
	
	Graphics2D g2 = (Graphics2D) g;
	
	//se debe instanciar la clase recyangle2D, asi que no se puede instanciar
	//entonces usamos rectangle2d, que se puede instanciar y hereda de rectangle
	
	Rectangle2D rectangulo = new Rectangle2D.Double (100,100,200,150);
	
	g2.draw (rectangulo);
	
	Ellipse2D elipse = new Ellipse2D.Double();
			
	//elipse2D es abstracta, ese constructor no recbe parametros
	
	elipse.setFrame(rectangulo);
	//lo que vamos a hacer a dibujar la elipse dentro de este cuadrado 
	g2.draw(elipse);
	g2.draw(new Line2D.Double (100,100,300,250));
	
	//usamos el objeto tipo graphics 2d que hemos llamado g2,
	//llamamos el metodo draw y pasamos como parametro el rectangulo
	//q es un parametro que implementa la interfaz safe
	
	
	//se hace una refundicion, se convierte el objeto de tipo grafic en un
	//objeto graphic 2D, que queda representado con la variable objeto g2
	
	
	/*aqui llamamos al methodo de la calse padre, a paint component
	//para que ese method haga su trabajo
	
	//ahora si podemos dibujar
	
	 ///g.drawRect(50, 50, 200, 200);
	//este para un cuadrado, uncoment to make it work
	 //atributes son esquina sup izquierda, distancia borde superior
	 //luego el ancho y la altura
	 ///g.drawLine(100, 100, 300, 200);
	 //este sirve para trazar una linea
	
	///g.drawArc(50, 100, 100, 200, 120, 150);
	//este para dibujar un arco
	
	//la clase graphic no permite cambiar grosos, ni rozar figuras
	//geometricas*/
	
	}
}