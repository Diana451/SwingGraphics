package graficos;
//Menu bar, menu methods used: JMenuBar, JMenu, JMenuItem
// video 100 https://www.youtube.com/watch?v=L_QzjDWoKDo
//add video 107, add graphics to menu, copy, paste, etc https://www.youtube.com/watch?v=iRY6BIEFJks&t=783s
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

public class MarcoMenu {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menu_Frame mimarco = new Menu_Frame();
		
		mimarco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		}
}

class Menu_Frame extends JFrame {
	
	public Menu_Frame () {
		
	setBounds (500,300,550,400);
		
	MenuLamina milamina = new MenuLamina ();
	
	add(milamina);
	
	setVisible (true);
		
	}	
}

class MenuLamina extends JPanel{
	
	public MenuLamina () {
		
		JMenuBar mibarra = new JMenuBar ();
		
		JMenu archivo = new JMenu ("Archivo	");
		
		JMenu edicion = new JMenu ("Edicion	");
		
		JMenu herramientas = new JMenu ("Herramientas");
		
		JMenu opciones = new JMenu ("Opciones");
		
		JMenuItem guardar = new JMenuItem ("Guardar");
		
		JMenuItem guardar_como = new JMenuItem ("Guardar como");
		
		JMenuItem cortar = new JMenuItem ("cortar", new ImageIcon ("src\\graficos\\cortar.png"));
		//if I want to put the text at the left of the image:
		cortar.setHorizontalTextPosition(SwingConstants.LEFT);
		
		JMenuItem copiar = new JMenuItem ("Copiar", new ImageIcon ("src\\graficos\\copiar.png"));
		
		JMenuItem pegar = new JMenuItem ("Pegar", new ImageIcon ("src\\graficos\\pegar.png"));
		
		JMenuItem generales = new JMenuItem ("Generales");
		
		JMenuItem opcion1 = new JMenuItem ("Opcion 1");
		
		JMenuItem opcion2 = new JMenuItem ("Opcion 2");
		
		opciones.add(opcion1);
		
		opciones.add(opcion2);
		
		archivo.add(guardar);
		
		archivo.add(guardar_como);
		
		edicion.add(cortar);
		
		edicion.add(copiar);
		
		edicion.add(pegar);
		
		//separatopr pertenece a JManu y edicion es un objeto de tipo Jmenu
		//pones aqui el SEPARADOR para que opciones quede como algo extra de esa opcion del menu.
		edicion.addSeparator();
		
		edicion.add(opciones);
		
		herramientas.add(generales);
		
		mibarra.add(archivo);
		
		mibarra.add(edicion);
		
		mibarra.add(herramientas);
		
		add(mibarra);
		
								
	}
	
}
