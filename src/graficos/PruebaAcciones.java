package graficos;
/*videos 76 y 77 y 78 https://www.youtube.com/watch?v=YSCNtyNqizk&t=624s y https://www.youtube.com/watch?v=8FQnwZrr8Ck
Interface action y varias fuentes de eventos, agregamos lamina, botones y combinaciones de letras
combinacion de teclas ,79 y 80 rtl b for exam 
https://www.youtube.com/watch?v=Nkyt5DT2mA0 */

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoAccion marco = new MarcoAccion ();
	
		marco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible (true);
	}

}

class MarcoAccion extends JFrame {
	
	public MarcoAccion() {

	setTitle ("Prueba Acciones");
	
	setBounds (600,350,600,450);
	
	PanelAccion lamina = new PanelAccion ();
	
	add (lamina);
	
	}
}

class PanelAccion extends JPanel {
	//creamos los botones con J Button
	
		 public PanelAccion() {
		
	AccionColor accionAmarillo = new AccionColor ("Amarillo", new ImageIcon ("src/graficos/yellow.png"), Color.YELLOW);
	
	AccionColor accionAzul = new AccionColor ("Azul", new ImageIcon ("src/graficos/blue.png"), Color.BLUE);		
		
	AccionColor accionRojo = new AccionColor ("Rojo", new ImageIcon ("src/graficos/red.png"), Color.RED);		
	
	add (new JButton (accionAmarillo));
	
	add (new JButton (accionAzul));
	
	add (new JButton (accionRojo));
	
		/*JButton botonAmarillo = new JButton ("Amarillo");
		
		JButton botonAzul = new JButton ("Azul");
		
		JButton botonRojo = new JButton ("Rojo");
		
		add (botonAmarillo);
		
		add (botonAzul);
		
		add (botonRojo);*/
		
	//LO SIGUIENte para crear el color de fondo de la lamina amarilla, 4 steps
	
	InputMap mapaEntrada = getInputMap (JComponent.WHEN_IN_FOCUSED_WINDOW);
	//this focus deniota que es foco es dentro de la lamina
	
	/*1.Mapa de entrada. este metod devuelve objeto inputmap (de la clase jetcomponent) para almacenar lo que devuelve ese metodo 
	dentro de la mapaEntrada.Usa la constante de clase whenInFocused, de tipo entero */
	
	//2.crear conmbinacion de teclas
	//KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("crtl A");
	

	/*represneta una accion con una tecla del teclado, es una clase inmutable, no tiene construcor pero si methods, tiene varios
	ese method string , los nethods tiene difernetes modificadores,*/
	
	/*3.Assignar la combinacion de teclas a un objeto
	 * perenece a la claseinputMap, permite combinacion d etecalas y el objeto que se asocia a la accion
	 */
	mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
	//si quiero puede aplicar mas teclas a un mismo color si lo quiero, por ej, ctrl T
	
	mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
	
	mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
	
	/*4. Assignar el objeto a la accion
	 * crea vinculo entre ovjeto y accion. Esa metod 
	 */
	ActionMap mapaAccion = getActionMap ();
	
	
	mapaAccion.put("fondo_amarillo", accionAmarillo);
	
	mapaAccion.put("fondo_azul", accionAzul);
	
	mapaAccion.put("fondo_rojo", accionRojo);
	
	
	
	}

private class AccionColor extends AbstractAction {
	//hacemos esta clase parte de Jpanel para que reconozca todos los metodos de esa clase

				
				//public AccionColor(String string, ImageIcon imageIcon, Color yellow) {
					// TODO Auto-generated constructor stub
				

				//creamos el contructor para realizar varias acciones con nuestro objeto fuente
					
	  public AccionColor (String nombre, Icon icono, Color color_boton) {
					
					putValue (Action.NAME, nombre);
					//cuando instanciamos esta clase pasamos nombre, icono y color de boton
					
					putValue(Action.SMALL_ICON, icono);
					
					putValue (Action.SHORT_DESCRIPTION, "Poner lamina de color " + nombre);
					
					putValue("color_de_fondo", color_boton);
					
				}

		public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					Color c=(Color)getValue ("color_de_fondo");
					//hay que poner el sehundo Color para que retorne en objeto tipo valor
							//esye metodo permite a la interfaz action, rescata el valor 
					//Ponemos en getvalue el valor de la clave, obtenemos esa clave
					
					setBackground (c);
					//al ser ahora una clase interna de JPanel reconoce el background
					
					System.out.println("nombre: " + getValue(Action.NAME) + " Descripcion: " + getValue (Action.SHORT_DESCRIPTION));
					
				}

}
/*Los botones estan creados, no hacen nada, entonces toca poner a la lamina como fuente de escucha
	para que esta cambie de color, puede implementar la interfacz action o heredar de la clase Abstractaction */
	
}	

	
		

	


