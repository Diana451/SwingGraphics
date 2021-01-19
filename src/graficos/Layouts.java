package graficos;

//video 81 https://www.youtube.com/watch?v=Fr8lqCKwjmM
//VIDEO 82 https://www.youtube.com/watch?v=FAOGZuvvwrE espacio entre botones
//CREANDO BOTONES Y MOVIENDOLOS DE SITIO

import java.awt.*;

import javax.swing.*;

public class Layouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Marco_Layout marco = new Marco_Layout ();
	
	marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	marco.setVisible (true);
	
	}

}
class Marco_Layout extends JFrame {
	
	public Marco_Layout () {
		
		setTitle ("Prueba Acciones");
		
		setBounds (600,350,600,200);
		
		Panel_Layout lamina = new Panel_Layout();
		
		Panel_Layout2 lamina2 = new Panel_Layout2();
		
		add (lamina, BorderLayout.NORTH);
		add (lamina2, BorderLayout.SOUTH);
		//el metodo add tambien admite la posicion del componente, ambos ocupan cada espacio de su zona norte y sur para este ejm
		
	}
		
}

class Panel_Layout extends JPanel {
	
	public Panel_Layout() {
		
		/*//FlowLayout disposicion = new FlowLayout (FlowLayout.CENTER, 75, 100);
		 PUEDES DEJAR DERECHA, IZQ, CENTRO POR DEFECTO
		los numeros para separar las botones o elementos
		
		//lamina.setLayout(disposicion);
	    o podemos resumir las dos anteriores para mejor codigo: 	 
		 
		TODO ESTE CODIGO
		setLayout (new FlowLayout (FlowLayout.CENTER, 75, 100));
		TODO ESTE ANTERIOR CODIGO PARA HACER BOTONES EN LA POSICION POR DEFECTO
		*/
		
		setLayout (new FlowLayout (FlowLayout.LEFT));
		
		add (new JButton ("Amarillo"));
		
		add (new JButton ("Rojo"));
		
		
		}
}
	class Panel_Layout2 extends JPanel {
		
		public Panel_Layout2() {
			
			setLayout (new BorderLayout());
			
			add (new JButton ("Azul"), BorderLayout.WEST);
			
			add (new JButton ("Verde"), BorderLayout.EAST);
			
			add (new JButton ("Negro"), BorderLayout.CENTER);
			
		}
		
	}

