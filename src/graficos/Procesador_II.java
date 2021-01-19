//package graficos;
// I will coment this in spite of being correct, see class Procesador_II efficientCode to finish the whole menu with less code
//Creando Procesador de Textos /estilo correcto pero MUCHO CODIGO, EN VIdeo 103 es mas eficiente
//JTextPanel class para crerar areas de texto, 
// video 101 https://www.youtube.com/watch?v=JEy3hb8Fpig
//y video 102 introduce elementos a la escucha para escribir texto https://www.youtube.com/watch?v=dIKKelWI8K8



/*
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
*/

/*public class Procesador_II {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuProcesador_II mimarco = new MenuProcesador_II();
		
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		}
}

class MenuProcesador_II extends JFrame {
	
	public MenuProcesador_II() {
		
	setBounds (500,300,550,400);
		
	LaminaProcesador milamina = new LaminaProcesador ();
	
	add(milamina);
	
	setVisible (true);
		
	}	
}

class LaminaProcesador extends JPanel{
	
	public LaminaProcesador () {
		
		setLayout (new BorderLayout ());
		
		JPanel laminamenu = new JPanel (); //lamina que estara en la parte interior de la principal
		
		//crear barra de menus:
		JMenuBar mibarra = new JMenuBar ();
		//-----------------a continuacion creamos los tres menus principales
		
		JMenu fuente = new JMenu ("Fuente");
		
		JMenu estilo = new JMenu ("Estilo");
		
		JMenu tamagno = new JMenu ("Tamano");
		
		//----------agregamos los items a los elementps de menu con JMenuItem
		
		JMenuItem arial = new JMenuItem ("Arial");
		
		arial.addActionListener(new ActionListener () {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				miarea.setFont (new Font ("Arial", Font.PLAIN, 12));
				
				}
		});
		
		//note that hasta to be Courier New as my laptop does not have Courier alone
		JMenuItem courier = new JMenuItem ("Courier New");
		
		//Gestiona_menus tipo_letra = new Gestiona_menus ();
		
		   //aqui creamos la clase interna actionListener para adoptar ese tipo de letra
		courier.addActionListener(new ActionListener () {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				miarea.setFont (new Font ("Courier New", Font.PLAIN, 12));
				
				}
		});
				
		JMenuItem verdana = new JMenuItem ("Verdana");
		
		verdana.addActionListener(new ActionListener () {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				miarea.setFont (new Font ("Verdana", Font.PLAIN, 12));
				
				}
		});
		
		
		//-----agregamos esos elementos a fuente
		
		fuente.add(arial);		
		
		fuente.add(courier);
		
		fuente.add(verdana);
		
		//----determinamos que cuelga de estilo 
		
		
	    JMenuItem negrita = new JMenuItem ("Negrita");
		
		JMenuItem cursiva = new JMenuItem ("Cursiva");
		
		estilo.add("Negrita");
		
		estilo.add("Cursiva");
		
		//----- now we create the ones related to Tamano
		
		JMenuItem tam_12 = new JMenuItem ("12");
		
		JMenuItem tam_16 = new JMenuItem ("14");
		
		JMenuItem tam_20 = new JMenuItem ("16");
		
		JMenuItem tam_24 = new JMenuItem ("18");
		
		//--- add items to  tamagnio
		
		tamagno.add(tam_12);		
		
		tamagno.add(tam_16);
		
		tamagno.add(tam_20);
		
		tamagno.add(tam_24);
				
		//------------------agregamos los 3 elementos a la barra de Menus, paso 1:
		mibarra.add(fuente);
		
		mibarra.add(estilo);
		
		mibarra.add(tamagno);
		
		//paso 2:
		
		laminamenu.add(mibarra);
		
		add(laminamenu, BorderLayout.NORTH);
		
		//-------Vamos a contruir un objeto y agregarloa la zona central del frame
		
		miarea = new JTextPane ();
		
		add (miarea, BorderLayout.CENTER);
		
		 				
		}
	
	
	JTextPane miarea; //la declaro aqui para evitar error en el contructor de ActionLsitener GestionaMenus
	}

*/
