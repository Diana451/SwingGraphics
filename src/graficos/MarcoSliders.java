package graficos;
//JSlider method / desplaza mouse to specific thicks or numbers in the frame
// video 96 https://www.youtube.com/watch?v=XtoSO1yXgSc
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MarcoSliders {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame_Sliders mimarco = new Frame_Sliders();
		
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		}
}

class Frame_Sliders extends JFrame {
	
	public Frame_Sliders () {
		
	setBounds (550,400,550,350);
		
	Lamina_Sliders milamina = new Lamina_Sliders ();
	
	add(milamina);
	
	setVisible (true);
		
	}	
}

class Lamina_Sliders extends JPanel{
	
	public Lamina_Sliders () {
		
		//uses methid Swing constant to change it to vertical position. It was horizontal by defect
		//JSlider control = new JSlider (SwingConstants.VERTICAL, 20, 100,25);
		
		JSlider control = new JSlider (0,100,50);
		
		control.setMajorTickSpacing(25);
		
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true);
		
		control.setPaintLabels(true);
		
		//next method arrastra el pointer al tick mas cercano
		//control.setSnapToTicks(true);
		
		control.setFont(new Font ("Serif", Font.ITALIC,12));
		
		add (control);
		
				
	}

}
