package graficos;
//video 69 PI. Using Adapter classes instead of using many window classes https://www.youtube.com/watch?v=QZrNfAJG3fA
//ver las comparaciones con video 68.para ver las simplificaciones

import javax.swing.*;

import java.awt.event.*;

public class EventosVentanaAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana2 mimarco = new MarcoVentana2 ();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MarcoVentana mimarco2 = new MarcoVentana ();
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.setTitle("Ventana 1");
		
		mimarco2.setTitle("Ventana 2");
		
		mimarco.setBounds(300,300,500,350);
		
		mimarco.setBounds(900,300,500,350);
	}

}

class MarcoVentana2 extends JFrame {
	
	public MarcoVentana2 () {
		
		setTitle ("Respondiendo");
		
		setBounds (300,300,500,350);
		
		setVisible (true);
		
		/*M_Ventana oyente_ventana = new M_Ventana ();
		
		addWindowListener (oyente_ventana);*/
		
		addWindowListener (new M_Ventana2());
		/*asi preparamos al marco para que escuche los eventos q puedan surgir de ventana, e instanciamos la 
		*classe oyente de manera directa en lso parametros de addWindowListener
		*Asi simplificamos mas el codigo
		*esto es una opcion a lo previamente comentafo pero supongo q solo aplica
		*cuando hay una sola ventana
		**/
		
		}
}

class M_Ventana2 extends WindowAdapter  {
	
	
	public void windowIconified (WindowEvent e) {
		
	
	System.out.println("Ventana minimizada");

 	}
	
}
	

