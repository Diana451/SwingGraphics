package graficos;

import java.awt.*;
import javax.swing.*;
//video 62 pildoras informaticas

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConFuentes mimarco = new MarcoConFuentes ();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		mimarco.setVisible(true);
			
		}

	}

	class MarcoConFuentes extends JFrame {
		
		public MarcoConFuentes() {
			
		setTitle ("Prueba con Fuentes");
			
		setSize(400,400);
			
		//tenemos que instanciar la clase lamina para hacerla visible	
		LaminaConFuentes milamina = new LaminaConFuentes();
		
		add (milamina);
		milamina.setForeground(Color.GREEN);
		//En este caso para poner a todo el contenido de la lamima la misma fuente
		//pero si se quiere hacer por partes, morar los coments de lamina
		
		
		}
	}

	class LaminaConFuentes extends JPanel {
		
		public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		Font mifuente = new Font ("Verdana", Font.BOLD,26);
		g2.setFont(mifuente);
		///g2.setColor(Color.blue);
		
		g2.drawString("Juan", 150, 150);
		
		g2.setFont(new Font ("Arial", Font.ITALIC, 32));
		///g2.setColor(new Color (128,90,50).brighter());
		g2.drawString("Curso de Java", 100, 200);
		}
	}

