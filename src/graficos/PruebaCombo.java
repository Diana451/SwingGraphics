package graficos;

//CMOBOX CLASS - MENU DESPLEGABLE - en este programa introducimos fuentes y le damos al usuario la opcion de introducir su fuente tambien
//video 95 https://www.youtube.com/watch?v=MYdAW9f7YHk
//there is a simpler version in the class called Ejemplo_Radio2

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaCombo {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCombo mimarco = new MarcoCombo();
		
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		}
}

class MarcoCombo extends JFrame {
	
	public MarcoCombo() {
		
	setBounds (550,300,550,350);
		
	LaminaCombo milamina = new LaminaCombo ();
	
	add(milamina);
	
	setVisible (true);
		
	}	
}

class LaminaCombo extends JPanel{
	
	public LaminaCombo () {
		
		setLayout (new BorderLayout ());
		
		texto = new JLabel ("En un lugar de la mancha que quisiera olvidar");
				
		texto.setFont (new Font ("Serif", Font.PLAIN,18));
		
		add(texto, BorderLayout.CENTER);
		
		JPanel lamina_norte = new JPanel ();
		
		micombo = new JComboBox ();
		
		micombo.setEditable(true);
		
		micombo.addItem("Serif");
		
		micombo.addItem("SansSerif");
		
		micombo.addItem("Courier");
		
		micombo.addItem("Arial");
		
		Evento_combo mievento = new Evento_combo ();
		
		micombo.addActionListener(mievento);
				
		lamina_norte.add(micombo);
		
		add (lamina_norte, BorderLayout.NORTH);
		
	}

private class Evento_combo implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		texto.setFont(new Font((String) micombo.getSelectedItem (), Font.PLAIN, 18));
		//el contructor pide un string asi que tenemos que convertir el objeto a string
	}
	
	
}
	
private JLabel texto;

private JComboBox micombo;

}
