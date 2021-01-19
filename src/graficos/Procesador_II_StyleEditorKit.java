package graficos;
//cambiso introducidos con metod Style EditorKit Video 106 minuto 11+ https://www.youtube.com/watch?v=EbhWqyIPjzA
//Version corta de este ver clase Procesador_IIefficientCode

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.StyledEditorKit.FontSizeAction;;

public class Procesador_II_StyleEditorKit {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuProcesador mimarco = new MenuProcesador();
		
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		}
}

class MenuProcesador extends JFrame {
	
	public MenuProcesador() {
		
	setBounds (500,300,550,400);
		
	LaminaProcesadores milamina = new LaminaProcesadores ();
	
	add(milamina);
	
	setVisible (true);
		
	}	
}

class LaminaProcesadores extends JPanel{
	 
	public LaminaProcesadores () {
		
		setLayout (new BorderLayout ());
		
		JPanel laminamenu = new JPanel (); //lamina que estara en la parte interior de la principal
		
		//crear barra de menus:
		JMenuBar mibarra = new JMenuBar ();
		//-----------------a continuacion creamos los tres elementos de la barra principal del menu
		
		fuente = new JMenu ("Fuente");
		
		estilo = new JMenu ("Estilo");
		
		tamagno = new JMenu ("Tamano");
		
		
		//creamos en estos menus al final cadenas vacias apra poder usar las imagenes?iconos de negrita y cursiva en las que corresponde,
		//sin afectar el parametro de configura_menus que con las condiciones hace q se ap[lique el criterio a todas las variables
		configura_menus ("Arial", "fuente","Arial",9,10, "");
		
		configura_menus ("Courier New", "fuente","Courier New",9,10, "");
		
		configura_menus ("Verdana", "fuente","Verdana",9,10, "");
		
		//--------ahora creamos los elementos de estilo
		//en los estilos dejamos vacio el tipo de letra porq esos no se encargan de cambiar el tipo de letra
		
		configura_menus ("Negrita", "estilo","",Font.BOLD,1, "src\\graficos\\bold.png");
		
		configura_menus ("Cursiva", "estilo","",Font.ITALIC,1, "src\\graficos\\italic.png");
		
		//--------ahora creamos elementos de tamano.LOs siguientes elem no modifican tipo de letra ni estilo, entonces no se cambian esas variables.Unicamente tamano
		//se pone valor 9 porq para estilos es NADA, 1 means negrita
		configura_menus ("12", "Tamano","",9,12,"");
		
		configura_menus ("16", "Tamano","",9,16,"");
		
		configura_menus ("20", "Tamano","",9,20, "");
		
		configura_menus ("24", "Tamano","",9,24, "");
		
			
		//------------agregamos los 3 elementos a la barra de Menus, paso 1:
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
	/*salimos del contructor y creamos este method rotulo especifica que clase y tamano de letra. Menu se encarga de especificar si el elemmento q creamos en cada instante, va al menu fuente, estilo, o tamagno
	tipo_letra, especifica tipo letra en fuente, int estilos porque para especificar el tipo de letra se usa font.bold q son constantes de clase de tipo numeros enteros
	parametro q especifica el tamano de la fuente */
	
	public void configura_menus (String rotulo, String menu, String tipo_letra, int estilos, int tam, String ruta_icono) {
		
		//creo ruta_icono para introducir los iconos de negrita y cursiva. voy al constructor  y creo ese objeto depsuyes de rotulo,.ver abajo
		//config elementos y los pone a la escucha. Comnezamos a instanciar Jmenuitem, usamos un parametro de tipo string rotulo, por ejemplo arial, cursiva, negrita, etc
		
		JMenuItem elem_menu = new JMenuItem (rotulo, new ImageIcon(ruta_icono));
		
			if (menu == "fuente") {
				
				fuente.add(elem_menu);
				
				if (tipo_letra == "Arial") {
					
					elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra", "Arial"));
					
				} else if (tipo_letra == "Courier New") {
					
					elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra", "Courier New"));
					
				}else if (tipo_letra == "Verdana") {
					
					elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiar_letra", "Verdana"));
						
				}	
						
				//con lo anterior, a la hora de construir el primer elem del menui, primero se refiere al te
			} else if (menu == "estilo") {
				
				estilo.add(elem_menu);
				
				if (estilos == Font.BOLD) {
					
					elem_menu.addActionListener(new StyledEditorKit.BoldAction());
					
				} else if (estilos == Font.ITALIC) {
				
					elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
				
				}
			} else if (menu == "Tamano") {
				
				tamagno.add(elem_menu);
			
				elem_menu.addActionListener(new StyledEditorKit.FontSizeAction ("cambia_tamano", tam));
			}
	}
	
		
	//creo una clase interna, declaro unas variables dentro de JtextPane, para que sean accesibles desde clase interna y clase
	//principal
	JTextPane miarea; //la declaro aqui para evitar error en el contructor de ActionLsitener GestionaMenus

	JMenu fuente, estilo, tamagno;
	
	Font letras; 
	
	
}
