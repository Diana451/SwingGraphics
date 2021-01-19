package graficos;

import java.awt.*;
//videos  82 a 84
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCalculadora mimarco = new MarcoCalculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}
class MarcoCalculadora extends JFrame {
	
	public MarcoCalculadora () {
		
		setTitle ("Calculadora");
		
		setBounds (500,300,450,300);
		
		LaminaCalculadora milamina = new LaminaCalculadora ();
		
		add (milamina);
		
		//pack ();
		/*This method belong to Window class. usando pack decimos que el contenedor se tiene que adaptar al tamano por defecto
		de lo que contiene en su interior, ethis could replace setBoundMetod*/		
	}
}

class LaminaCalculadora extends JPanel { 
	
	public LaminaCalculadora () {
		
		principio = true;
		/*we put that here so every new time it opens, the condition in InsertNumero class will be true
		as the condition written there says.*/
		 
		setLayout (new BorderLayout());
		
		pantalla = new JButton ("0");
		
		pantalla.setEnabled(false);
		
		//esto apra que no se pueda dar click en la pantalla del 0
		
		add (pantalla, BorderLayout.NORTH);
		
		milamina2 = new JPanel ();
			
		milamina2.setLayout(new GridLayout (4,4));
		
		ActionListener insertar = new InsertaNumero ();
		
		//esto con el fin de instertar el segundo parametro
		
		ActionListener orden = new AccionOrden();
		
		ponerBoton ("7", insertar);
		//se escribe solo en botones que queremos q aparezcan en el display
		//no en signos numericos porq no queremos verlos
		
		ponerBoton ("8", insertar);
		
		ponerBoton ("9", insertar);
		
		ponerBoton ("/", orden);
		
		ponerBoton ("4", insertar);
		
		ponerBoton ("5", insertar);
		
		ponerBoton ("6", insertar);
		
		ponerBoton ("*", orden);
		
		ponerBoton ("1", insertar);
		
		ponerBoton ("2", insertar);
		
		ponerBoton ("3", insertar);
		
		ponerBoton ("-", orden);
		
		
		ponerBoton ("0", insertar);
		
		ponerBoton (".", orden);
		
		ponerBoton ("=", orden);
		
		ponerBoton ("+", orden);
		
		/* esta es la forma tradicional de agregar botones, pero muy larga
		JButton boton1 = new JButton ("1");
		milamina2.add (boton1);
		
		JButton boton2 = new JButton ("2");
		milamina2.add (boton2);
		
		JButton boton3 = new JButton ("3");
		milamina2.add (boton3);
		
		JButton boton4 = new JButton ("4");
		milamina2.add (boton4);
				
		JButton boton5 = new JButton ("5");
		milamina2.add (boton5);
		
		JButton boton6 = new JButton ("6");
		milamina2.add (boton6);
		
		JButton boton7 = new JButton ("7");
		milamina2.add (boton7);
		
		JButton boton8 = new JButton ("8");
		milamina2.add (boton8);
			
		
		JButton boton9 = new JButton ("9");
		milamina2.add (boton9);
		
		
		JButton boton10 = new JButton ("=");
		milamina2.add (boton10);
		
		JButton boton11 = new JButton ("*");
		milamina2.add (boton11);
		
		JButton boton12 = new JButton ("+");
		milamina2.add (boton12);
		
		JButton boton13 = new JButton (".");
		milamina2.add (boton13);
		
		JButton boton14 = new JButton ("/");
		milamina2.add (boton14);
		
		JButton boton15 = new JButton ("-");
		milamina2.add (boton15);
		
		JButton boton16 = new JButton ("%");
		milamina2.add (boton16);
		*/
		
		add (milamina2, BorderLayout.CENTER);
		
		ultimaOperacion = "=";
		
	}
	private void ponerBoton (String rotulo, ActionListener oyente) {
		
		JButton boton = new JButton (rotulo);
	
		boton.addActionListener(oyente);
		//LINEA CLAVE QUE PONE A LA ESCUCHA  A CADA UNO DE LOS BOTONES. este con el fin de q el objeto este a la escucha y una vez se rpesione el boton se almacene la accion
		//en el objeto oyente.
	
		milamina2.add (boton);
	
		}	

	 private class InsertaNumero implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			String entrada = e.getActionCommand();
			//ALMACENA DENTRO DE LA VARIABLE EL TEXTO DEL BOTON QUE DESENCADENA EL EVENTO
			//getaction devuelve el comando string asociado con la accion
			
				if (principio) {
					/*if (principio == true) It is the same than the original because if you
					dont give a comparison operator it will be equal to true.*/
				
					pantalla.setText("");
				
					principio = false;
							
				}
			
			pantalla.setText (pantalla.getText() + entrada);
			/*AQUI PONES EL TEXTO DEL BOTON
			 at the screen you write a text, that has to add what you had written before
			 and then you add the very new thing */
		}
				 
	 }
	 
	 private class AccionOrden implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			/*call a method that will make mathematical operations, the parameter will be the content on display.
			 * So will use parsedoble to convert string to double
			 */
			
			String operacion  = e.getActionCommand();
			//con este metod almaceno un string q corresponde al texto del boton
			
			
			
			calcular (Double.parseDouble(pantalla.getText()));
			/*means, take what is at the screen, me los apsas a doble, ej 7 to 7.0, and that value
			 * pass it as parameter of calcular
			 */
			 
			ultimaOperacion = operacion;
			/*aqui almaceno las operaciones que el usuario va realizando
			 * 
			 */
			principio = true;
			/*sirve para resetear y poner la proxima vez que introduzca un numero
			 despues de que he digitado el simbolo de alguna operacion */
			
		}
		//this method is the main for calculations, so I have to save what user does:
		
		public void calcular (double x) {
			//recuerda q parametro x es el valor de pantalla
			
			if (ultimaOperacion.equals("+")) {
				
				resultado+=x;
				
				System.out.println (resultado);
			}
			else if (ultimaOperacion.equals("-")) {
				
				resultado-=x;
			}
				
			else if (ultimaOperacion.equals("*")) {
					
				resultado*=x;
			}
					
			else if (ultimaOperacion.equals("/")) {
						
						resultado/=x;
			}
			else if (ultimaOperacion.equals("=")){
				
				resultado = x;
			}

			pantalla.setText("" + resultado);
			
			
			//pantalla.setText (resultado) da error de tipo porq settext es un String mientras q resultado es double
			//para solucionarlo ponemos una cadena de string concatenada a resultado y asi tiene  los dos parametros
		}
	}	 
			
	 private JPanel milamina2;
	//la declaramos por fuera del cosntructor para pdoer usarla en toda la clase
	
	private JButton pantalla;
	//para pdoer usarla dentro de toda la clase, no puede se rparte del cosntructor
	
	private boolean principio;
	//boolen by deffect is false unless you change the value of it when initializing it
	
	//crear una variable de clase que almacene la informacion q vamos agregando:
	
	private double  resultado;
	
	private String ultimaOperacion;
	//to save last operation user did in the calculator

			
}