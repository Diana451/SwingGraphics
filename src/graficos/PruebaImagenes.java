package graficos;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.*;
//video 63 y 64 pildoras: https://www.youtube.com/watch?v=z3CGPfjSYN8

public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

MarcoImagen mimarco = new MarcoImagen ();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		mimarco.setVisible(true);
			
		}

	}

	class MarcoImagen extends JFrame {
		
		public MarcoImagen () {
			
		setTitle ("Marco con Imagen");
			
		setBounds(750,300,300,200);
			
		//tenemos que instanciar la clase lamina para hacerla visible	
		LaminaConImagen milamina = new LaminaConImagen();
		
		add (milamina);
					
		}
	}

class LaminaConImagen extends JPanel {
		//creamos el contructor de la calse LaminaConImagen:
		public LaminaConImagen(){
		
			try {
				imagen = ImageIO.read(new File ("src/graficos/blue.png"));
			    }
				catch (IOException e) {
				// TODO Auto-generated catch block
				//este es el codigo a ejecutar en caso de error o de que no encuentre la imagen
				System.out.println("La imagen no se encuentra");
				}
			/*este try antes estaba debajo de super.Paint pero lo traemos para que cada vez que instanciemos
			LaminaCOnImagen, le damos un estado inicial a la lamina. que consiste en que ya tenemos una imagen
			cargada en Memoria (no pintada en la lamina). Eso se peude hacer tambien debido a la declaracion de la private
			variable Image creada por fuera de las clases en la aprte de abajo, asi que puede ser usada en cualquier
			metodo y en este caso en el cosntructor tambien */
			
		}
		
		public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		
		//File miimagen = new File ("src/graficos/blue.png");
		
		
		int anchuraImagen = imagen.getWidth(this);
		/*el operador this hace referencia al objeto en el que me encuentro
		es decir, la lamina, que es donde espero que el objeto sea cargado*/
		
		int alturaImagen = imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		///g.copyArea(0, 0, 15, 15, 630, 250);
		/*en imagen los 2 ceros e5 donde empieza la primer imagen,
		los 2 600 el tamano y los 630 y 250 la ubicacion de la segunda
		los 4 primeros parametros muestran que quiero copiar,
		los ultimos dos muestran el destino */
		for (int i = 0; i<100;i++)
		{
			for (int j = 0; j<50;j++)
			{
				if (i+j>0)
					/*esta condicion para que no me haga copia encima de la original, sino que empiece de la segunda
					no es mandatory but more organized*/
				{
			    g.copyArea(0, 0, alturaImagen, anchuraImagen,alturaImagen*i,anchuraImagen*j);
				/*si no conoces las dimensones de la imagen usas los metodos fetWidth, getHeigh
				es mas eficiente porque normalemente no las conoces */
			    }
			}
		}
		
	}
		private Image imagen;
		
}

