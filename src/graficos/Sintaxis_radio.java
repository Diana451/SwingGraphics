package graficos;
//button group class
//video 93 https://www.youtube.com/watch?v=CWl3ihbT4I0


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Sintaxis_radio {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_radio_sintaxis mimarco = new Marco_radio_sintaxis ();
		
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		}

	}

class Marco_radio_sintaxis extends JFrame {
	
	public Marco_radio_sintaxis () {
		
	setBounds (550,300,500,300);
		
	Lamina_radio_sintaxis milamina = new Lamina_radio_sintaxis ();
	
	add(milamina);
	
	setVisible (true);
		
	 }	
}

class Lamina_radio_sintaxis extends JPanel{
	
	public Lamina_radio_sintaxis () {
		
				
		ButtonGroup migrupo1 = new ButtonGroup ();
		//se usa el boton group para alinear el comportamiento de los elementos en la lamina
		
		ButtonGroup migrupo2 = new ButtonGroup ();
		
		JRadioButton boton1 = new JRadioButton ("Azul", false);
	
		JRadioButton boton2 = new JRadioButton ("Rojo", true);
		
		JRadioButton boton3 = new JRadioButton ("Verde", true);
		
		JRadioButton boton4 = new JRadioButton ("Masculino", false);
		
		JRadioButton boton5 = new JRadioButton ("Femenino", false);
	
		migrupo1.add(boton1);
		
		migrupo1.add(boton2);
		
		migrupo1.add(boton3);
		
		migrupo2.add(boton4);
		
		migrupo2.add(boton5);
		
		add (boton1);
		
		add (boton2);
		
		add (boton3);
		
		add (boton4);
		
		add (boton5);
		
		//el grupo nynca se puede agregar a la lamina, hay que agragar lpos botones uno a uno
	}

	
private JLabel texto;

private JRadioButton boton1, boton2, boton3, boton4;

}
