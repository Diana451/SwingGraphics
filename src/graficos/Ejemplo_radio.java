package graficos;

//video 94 https://www.youtube.com/watch?v=DxrcffniQKQ
//there is a simpler version in the class called Ejemplo_Radio2

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejemplo_radio {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_radio mimarco = new Marco_radio();
		
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		}
}

class Marco_radio extends JFrame {
	
	public Marco_radio() {
		
	setBounds (550,300,550,350);
		
	Lamina_radio milamina = new Lamina_radio ();
	
	add(milamina);
	
	setVisible (true);
		
	}	
}

class Lamina_radio extends JPanel{
	
	public Lamina_radio () {
		
		setLayout (new BorderLayout());
		
		texto = new JLabel ("En un lugar de la mancha...");
		
		texto.setFont(new Font ("Serif", Font.PLAIN,12));
		
		add (texto, BorderLayout.CENTER);
		
		lamina_botones = new JPanel ();
		
		migrupo = new ButtonGroup ();
		//we had to initialize migrupo y laminabotones because otherwise shows null error
		//because thwey were not initialiser previously
		
		colocarBotones ("Pequeno", false, 12);
		
		colocarBotones ("Mediano", true, 18);
		
		colocarBotones ("Grande", false, 24);
		
		colocarBotones ("Muy grande", false, 32);
		
		add (lamina_botones, BorderLayout.SOUTH);
	}


	public void colocarBotones (String nombre, boolean seleccionado, final int tamano) {
	//We put final to avoid modifications and to implement actionListener cause it requires a constant
	JRadioButton boton = new JRadioButton (nombre, seleccionado);
	
	migrupo.add(boton);
	
	lamina_botones.add(boton);
	
	ActionListener mievento = new ActionListener () {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			texto.setFont(new Font ("Serif", Font.PLAIN, tamano));
		}

	};
//we put this ; here to finish the method that started with ActionListener
		
		boton.addActionListener(mievento);
	}	

	
private JLabel texto;

private JRadioButton boton1, boton2, boton3, boton4;

private ButtonGroup migrupo;

private JPanel lamina_botones;

}
