package graficos;

//video 80 

import java.awt.event.*;

import javax.swing.*;

public class Varios_Oyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Marco_Principal mimarco = new Marco_Principal();
	
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	mimarco.setVisible (true);
	
	}

}
class Marco_Principal extends JFrame {
	
	public Marco_Principal () {
		
		setTitle ("Prueba Varios");
		
		setBounds (1300,100,300,200);
		
		Lamina_Principal lamina = new Lamina_Principal ();
		
		add (lamina);
		
	}
		
}

class Lamina_Principal extends JPanel {
	
	public Lamina_Principal () {
		
		JButton boton_nuevo = new JButton ("Nuevo");
		
		add (boton_nuevo);
		
		boton_cerrar = new JButton ("Cerrar todo");
		
		add (boton_cerrar);
		
		OyenteNuevo miOyente = new OyenteNuevo ();
		
		boton_nuevo.addActionListener(miOyente);
	}
	
	private class OyenteNuevo implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Marco_Emergente marco = new Marco_Emergente (boton_cerrar);
			
			marco.setVisible (true);
			
			
		}
		
		
	}
	
	JButton boton_cerrar;
	//este objeto se pone aparte porque va a a ser usado dentro y fuera del constructor, es decir, en otros metods
	
}
	class Marco_Emergente extends JFrame {
		
		public Marco_Emergente(JButton boton_principal) {
			
			contador++;
			
			setTitle ("Ventana " + contador);
			//contador va a ser comun para todas las ventanas. es una variable estatica
			
			setBounds (40*contador, 40*contador, 300,150);
			
			CierraTodos oyenteCerrar = new CierraTodos ();
			
			boton_principal.addActionListener(oyenteCerrar);
			
		}
		
	private class CierraTodos implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				dispose ();
				
			}
			//el methodo dispose libera todos los recursos de las ventanas, los cierra, pertenece a JFrame, heredado de Window
			
		}
		private static int contador = 0;
	}
	

