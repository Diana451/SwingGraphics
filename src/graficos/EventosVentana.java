package graficos;
//video 68 PI.crear marco JFrame, desencadena accion cuando se minimiza,imprime en consola https://www.youtube.com/watch?v=mtO5AJxCMio&t=250s

import javax.swing.*;

import java.awt.event.*;

public class EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana mimarco = new MarcoVentana ();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MarcoVentana mimarco2 = new MarcoVentana ();
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.setTitle("Ventana 1");
		
		mimarco2.setTitle("Ventana 2");
		
		mimarco.setBounds(300,300,500,350);
		
		mimarco.setBounds(900,300,500,350);
	}

}

class MarcoVentana extends JFrame {
	
	public MarcoVentana () {
		
		setTitle ("Respondiendo");
		
		setBounds (300,300,500,350);
		
		setVisible (true);
		
		M_Ventana oyente_ventana = new M_Ventana ();
		
		addWindowListener (oyente_ventana);
		
		}
}

class M_Ventana implements WindowListener  {
	
	public void windowActivated (WindowEvent e) {
		
		System.out.println("Ventana activada");
	}
	
	public void windowClosed (WindowEvent e) {
		
		System.out.println("La ventana ha sido cerrada");
	}
	
	
	public void windowClosing (WindowEvent e) {
		
		System.out.println("Ventana cerrada");
	}
	
	public void windowDeactivated (WindowEvent e) {
		
		System.out.println("Ventana desactivada");
	}
	
	public void windowDeiconified (WindowEvent e) {
		//aplica cuando la venta se restaura
		
		System.out.println("Ventana Restaurada");
	}
	
	public void windowIconified (WindowEvent e) {
		/*para un method como este lo que ocurre es que se pueden escribir mil
		 * lineas de codigo que apareceran cuando la venta se minimiza, por ej
		 * pero para este efecto solo sera este print:
		 */
	
	System.out.println("Ventana minimizada");

/*aqui estan todos los metodos de wondowListener, les ponen
	*triangulos para notar que estamos sobre escribiendo el metodo q pertenece a la interfaz
	*aunque solo necesito un method me toca escribirlos todos*/
	
	}
	public void windowOpened (WindowEvent e) {
		
		System.out.println("Ventana Abierta");
	}
	

	

}
	

