package graficos;

//This VERSION is same 94 but with a shorter and more efficient 
//video 94 https://www.youtube.com/watch?v=DxrcffniQKQ

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo_radio2 {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_radio2 mimarco = new Marco_radio2 ();
		
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		}

}

class Marco_radio2 extends JFrame {
	
	public Marco_radio2() {
		
	setBounds (550,300,550,350);
		
	Lamina_radio2 milamina = new Lamina_radio2 ();
	
	add(milamina);
	
	setVisible (true);
		
	 }	
}

class Lamina_radio2 extends JPanel{
	
	public Lamina_radio2 () {
		
		setLayout (new BorderLayout());
		
		texto = new JLabel ("En un lugar de la mancha...");
		
		add (texto, BorderLayout.CENTER);
		
		ButtonGroup migrupo = new ButtonGroup ();
		
		boton1 = new JRadioButton ("Pequeno", false);
		
		boton2 = new JRadioButton ("Mediano", true);
		
		boton3 = new JRadioButton ("Grande", false);
		
		boton4 = new JRadioButton ("Muy Grande", false);
		
		JPanel lamina_radio = new JPanel ();
		
		Evento_radio mievento = new Evento_radio ();
		//ponemos el evento a la escucha asi pone en consola lo que pasa en el marco
		
		boton1.addActionListener(mievento);
		
		boton2.addActionListener(mievento);
		
		boton3.addActionListener(mievento);
		
		boton4.addActionListener(mievento);
		
		migrupo.add(boton1);
		
		migrupo.add(boton2);
		
		migrupo.add(boton3);
		
		migrupo.add(boton4);
		
		lamina_radio.add (boton1);
		
		lamina_radio.add (boton2);
		
		lamina_radio.add (boton3);
		
		lamina_radio.add (boton4);
		
		add (lamina_radio, BorderLayout.SOUTH);
		
		
		//el grupo nynca se puede agregar a la lamina, hay que agragar lpos botones uno a uno
	}

	
private class Evento_radio implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == boton1) {
			texto.setFont(new Font ("Serif", Font.PLAIN,10));
			//System.out.println ("Has pulsado el boton1");
			
		} else if (e.getSource() == boton2) {
			texto.setFont(new Font ("Serif", Font.PLAIN,12));
			
		} else if (e.getSource() == boton3) {
			texto.setFont(new Font ("Serif", Font.PLAIN,18));
			
		}else if (e.getSource() == boton4) {
			texto.setFont(new Font ("Serif", Font.PLAIN,24));
		
		}
	}
	
	
}
	
private JLabel texto;

private JRadioButton boton1, boton2, boton3, boton4;

}
