package graficos;

import java.awt.Toolkit;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCentrado myFrame = new MarcoCentrado ();
		//crear instancia tipo marco centrato llamado myFrame
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		//toca hacer el marco visible porque por defecto es invisible
		
	}

}
class MarcoCentrado  extends JFrame {
	
	public MarcoCentrado() {
		
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		//this to store in the variable miPantalle our 
		//native system of frames
		 Dimension screenSize = myScreen.getScreenSize(); 
		 		//getScreeSize is public, nos da size de la ventana
	
		 int screenHeigh = screenSize.height;
		 int widthScreen = screenSize.width;
		 
		 setSize(widthScreen/2,screenHeigh/2);
		 setLocation (widthScreen/4,screenHeigh/4);
		 setTitle ("Central Frame");
		 
		 Image myIcon = myScreen.getImage("Icon.jpg");
		 //para cambiar el icon de gava por el mio
		 setIconImage(myIcon);
		 
		 
	}
	
}