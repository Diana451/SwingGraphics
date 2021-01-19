package graficos;


import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1 = new miMarco ();
		marco1.setVisible (true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//when we close the frame  ventana also we close the app (si tienes varias frames y cierras una, todas cierran)
		//if you write HIDE_ON_CLOSE, oculta las ventanas al cerrar
		//aplicable cuando hay varias ventanas, el porgrama sigue en ejecucion y las ventanas seguirian abiertas

	}

}

class miMarco extends JFrame {
	
	public miMarco () {
		
	///	setSize (500,300);
		
		///setLocation (500,300);
		
		setBounds (500,300,550,250);
		///setResizable (false);
		//incluyo esto para evitar que el user me amplie el frame
	
	///setExtendedState (Frame.MAXIMIZED_BOTH);
	//maximaze both is static so you have to use class` name,
	//in this case Frame
	//MB being a constant of whole type, tipo entero, can be replace for a number
	
		setTitle("Mi primera ventana");
 }
}