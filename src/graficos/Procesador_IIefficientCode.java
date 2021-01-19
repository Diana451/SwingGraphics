/*package graficos;
//Ver el sig mas eficiente condigo clase llamado Procesador_IIStyleEditorKit, donde se simplifican las condicionales permitiendo
//tambien que se pueda pasar de negrita y cursiva a letra normal
//Creando Procesador de Textos /estilo correcto pero MUCHO CODIGO, EN VIdeo 103 es mas eficiente, ES EL MISMO Procesador_II pero terminado y con mejor codigo
//JTextPanel class para crerar areas de texto, 
//video 103 introduce elementos a la escucha para escribir texto https:/ 
//video 104 https://www.youtube.com/watch?v=NiIN3jqC0NU&t=780s
//video 105 https://www.youtube.com/watch?v=YXWgGrjZfps
//video 106 mod negrita cursiva https://www.youtube.com/watch?v=EbhWqyIPjzA
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;

public class Procesador_IIefficientCode {

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
		
		configura_menu ("Arial", "fuente","Arial",9,10);
		
		configura_menu ("Courier New", "fuente","Courier New",9,10);
		
		configura_menu ("Verdana", "fuente","Verdana",9,10);
		
		//----ahora creamos los elementos de estilo
		//en los estilos dejamos vacio el tipo de letra porq esos no se encargan de cambiar el tipo de letra
		
		configura_menu ("Negrita", "estilo","",Font.BOLD,1);
		
		configura_menu ("Cursiva", "estilo","",Font.ITALIC,1);
		
		//----ahora creamos elementos de tamano.LOs siguientes elem no modifican tipo de letra ni estilo, entonces no se cambian esas variables.Unicamente tamano
		//se pone valor 9 porq para estilos es NADA, 1 means negrita
		configura_menu ("12", "Tamano","",9,12);
		
		configura_menu ("16", "Tamano","",9,16);
		
		configura_menu ("20", "Tamano","",9,20);
		
		configura_menu ("24", "Tamano","",9,24);
		
		
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
	/*salimos del contructor y creamos este method
	rotulo especifica que clase y tamano de letra
	menu se encarga de especificar si el elemmento q creamos en cada instante, va al menu fuente, estilo, o tamagno
	tipo_letra, especifica tipo letra en fuente
	int estilos porque para especificar el tipo de letra se usa font.bold q son constantes de clase de tipo numeros enteros
	parametro q especifica el tamano de la fuente */
	
/*
	public void configura_menu (String rotulo, String menu, String tipo_letra, int estilos, int tam) {
		
		//config elementos y los pone a la escucha. Comnezamos a instanciar Jmenuitem, usamos un parametro de tipo string rotulo, por ejemplo arial, cursiva, negrita, etc
		JMenuItem elem_menu = new JMenuItem (rotulo);
		
			if (menu == "fuente") {
				
				fuente.add(elem_menu);
				//con lo anterior, a la hora de construir el primer elem del menui, primero se refiere al te
			} else if (menu == "estilo") {
				
				estilo.add(elem_menu);
				
			} else if (menu == "Tamano") {
				
				tamagno.add(elem_menu);
			}
			
			//incluimos la intruccion correspondiente
		elem_menu.addActionListener(new Gestiona_Eventos(rotulo, tipo_letra, estilos, tam));	
	}
	
	//-------poner los anteriores elementos a la ewscucha para q cada uno haga su trabajo
	//----creamos una clase q  gestione eventos, puede ser clase interna, o clase normal
			
		private class Gestiona_Eventos implements ActionListener {
			
			String tipo_texto, menu;
			
			int estilo_letra, tamagno_letra;
			
/*contructor pasamos los atribnutos de clase padrae a clase hijo en el sig contructor
elemento, para detectar q elemmento del menu hemos pulsado
texto2 almacena el text del boton, cuando pulse en arial, o verdana, etc, para saber en cual de esos elementos se rpesiono
estilo2 estilo en cada momento
tam letra, tamano de la letra del elemento pulsado
para apsar esos elementos al contructort hacemos la llamada a la clase apdre en cuantro instanciemos la clase gestiona Eventos
en el constructor le damos valores a las primeras  4 variables
			*/
			
			Gestiona_Eventos (String elemento, String texto2, int estilo2, int tam_letra){
				
				
				tipo_texto = texto2;
				
				estilo_letra = estilo2;
				
				tamagno_letra = tam_letra;
				
				menu = elemento;
			} 
			

/*	public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			

			//before to establish letter type, we save in the variable of type Font, letras,el tipo de letra que hay dentro del area.
			//luego de alli extraemos estilos, tamano y letra. usando diferentes Font Metods
			
			*/
		/*	letras = miarea.getFont ();
			
				if (menu =="Arial" || menu == "Courier New" || menu == "Verdana") {
				//dejamos q permanezca estyilo y tamano,m y hacemos que cambie solo la la letra
				
						estilo_letra = letras.getStyle();
							
						tamagno_letra = letras.getSize();
							
				} else if (menu == "Cursiva" || menu == "Negrita") {
					
					//lo que haremos aahora es crear una condicion para que en caso q se elija negrita y/o cursiva, se mantenga el estilo y tamano de letra, de lo contrario,
					//al cambiar esos dos, pueden eprderse. Font.bold =1, font.italic = 2, la suma total, 3, equivale a mantenerlas ambas en funcionamiento
					
					if (letras.getStyle() == 1 || letras.getStyle() == 2){
						
						estilo_letra = 3;
					}
	
					tipo_texto = letras.getFontName();
					
					tamagno_letra = letras.getSize();
	
				} else if (menu == "12" || menu == "16" || menu == "20" || menu == "24") {
					
					estilo_letra = letras.getStyle();
					
					tipo_texto = letras.getFontName();
					
				}
					*/
			//debemos usar variables q vayan cambiando dependiendo del elemento del menu q pulses en cada momento
		//	miarea.setFont(new Font (tipo_texto, estilo_letra, tamagno_letra ));
				
			
			//System.out.println ("Tipo: " + tipo_texto + " Estilo: " + estilo_letra + " Tamagno: " + tamagno_letra);*/
	*/	}
			
	}	

	
	//creo una clase interna, declaro unas variables dentro de JtextPane, para que sean accesibles desde clase interna y clase
	//principal
	//JTextPane miarea; //la declaro aqui para evitar error en el contructor de ActionLsitener GestionaMenus

   //JMenu fuente, estilo, tamagno;
	
	//Font letras; 
	
	
}

*/
