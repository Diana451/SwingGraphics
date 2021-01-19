package graficos;

//video 70 Pild Inform https://www.youtube.com/watch?v=H_1kldp-d7I

import javax.swing.*;
import java.awt.Frame;
import java.awt.event.*;

public class CambioEstado
	{

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{
		MarcoEstado mimarco=new MarcoEstado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

class MarcoEstado extends JFrame
	{
	public MarcoEstado ()
		{
		setVisible(true);
		
		setBounds(300,300,500,350);
		
		CambiaEstado nuevo_estado = new CambiaEstado();
			
		//ahora se implementa el metodo awindow state listener. o cambio de ventana
		addWindowStateListener (nuevo_estado);
		}
	}

class CambiaEstado implements WindowStateListener
{
	public void windowStateChanged (WindowEvent e)
	{
		///System.out.println ("La ventana ha cambiado de estado");
		
		///System.out.println (e.getNewState());
		//se pone la e, con esa instancia puedo acceder a los metods de la clase window event
		
		if (e.getNewState()==Frame.MAXIMIZED_BOTH){
			//te informa si la pantalla esta en forma completa
		
			System.out.println("La ventana esta a pantalla completa");
		
		} else if (e.getNewState()==Frame.NORMAL){
			
			System.out.println("La ventana esta Normal");
			
		} else if (e.getNewState()==Frame.ICONIFIED) {
			
			System.out.println("La ventana esta minimizada");
		}
	}

}