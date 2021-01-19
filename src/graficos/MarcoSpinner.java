/*package graficos; see class MArcoSpinner
//JPinner method / control que se desplaza with this and other changes
// video 98 https://www.youtube.com/watch?v=06acFKm-kcQ&t=42s
import javax.swing.*;
import javax.swing.JSpinner;
import java.awt.*;
import java.awt.event.*;

public class MarcoSpinner {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrameSpinner mimarco = new FrameSpinner();
		
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		}
}

class FrameSpinner extends JFrame {
	
	public FrameSpinner () {
		
	setBounds (550,350,550,350);
		
	add (new LaminaSpinner());
	//ver la clase spinner para ver otros formatos de fecha, hora, etc
	
	setVisible (true);
		
	}	
}

class LaminaSpinner extends JPanel{
	
	public LaminaSpinner () {
		
		//alamacenasmos en la lista todas las fuentes de mletra disponibles en mi pc
		//String lista [ ] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		//String lista [] = {"Enero", "Febrero", "Marzo", "Abril"};
 		
		JSpinner control = new JSpinner (new SpinnerNumberModel (5,0,10,2));
		//en argumento:contador empieza en 5, siemre mas de 0, maximo 1, y cuenta de 2 en 2
		//fijate q los botones aumentan al contrario que los normales
		
		//JSpinner control = new JSpinner (new SpinnerListModel(lista));
		//this one requires an argument array type
		
		//JSpinner control = new JSpinner (new SpinnerDateModel());
		//This one to create date and hour
		//para cambiar tamano de JSpiner  use SetPrefereSize
		Dimension d = new Dimension (200,20);
		
		control.setPreferredSize(d);
		
		add(control);
		
		
				
	}

}
*/