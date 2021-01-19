package graficos;
//video 75, https://www.youtube.com/watch?v=NvNZNEVWYO8&t=570s


import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.*;


public class FocoVentana extends JFrame implements WindowFocusListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FocoVentana mivent = new FocoVentana ();
		
		mivent.iniciar();
	}

	public void iniciar () {
		
		marco1 = new FocoVentana();
		
		marco2 = new FocoVentana();
		
		marco1.setVisible(true);
		
		marco2.setVisible(true);
		
		marco1.setBounds(200, 100, 600, 350);
		
		marco2.setBounds(900, 100, 600, 350);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco1.addWindowFocusListener(this);
		
		marco2.addWindowFocusListener(this);
		
	}
	//metodo para contruir los marcos
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == marco1) {
			
			marco1.setTitle("Tengo el Foco");
			
		//en todo caso toca crear una instruccion cuando pierda el foco
		
		}else {
			
			marco2.setTitle("Tengo el Foco!!");
		//es el objeto del evento que se genera
		}
		
		}

	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == marco1) {
			
			marco1.setTitle("");
			
		//en todo caso toca crear una instruccion cuando pierda el foco
		
		}else {
			
			marco2.setTitle("");
		//es el objeto del evento que se genera
		}

	//ponemos aqui las variables apra que le apliquen todos los metodos
	
	}
	
	FocoVentana marco1;
	
	FocoVentana marco2;
	
	
}


