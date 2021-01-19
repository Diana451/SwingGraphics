package graficos;
 
//Creating a Menu including Font, Style and Size, using ProcesadorCheckButton and JRadioButtonMenuItem

import javax.swing.*;
import javax.swing.text.*;
import javax.swing.JMenuItem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.StyledEditorKit.FontSizeAction;;

public class ProcesadorCheckButton {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuProcessor myframework = new MenuProcessor();
		
		myframework.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		}
}

class MenuProcessor extends JFrame {
	
	public MenuProcessor () {
		
	setBounds (500,300,550,400);
		
	LayerProcessor mylayer = new LayerProcessor ();
	
	add(mylayer);
	
	setVisible (true);
		
	}	
}

class LayerProcessor extends JPanel{
	 
	public LayerProcessor () {
		
		setLayout (new BorderLayout ());
		
		//this layer will be inside of the main layer:
		JPanel layermenu = new JPanel (); 
		
		//Create a bar to store the menus
		JMenuBar mybar= new JMenuBar ();
		
		//----Create three elements that contain the main menu:		
		font= new JMenu ("Font");
		
		style = new JMenu ("Style");
		
		size = new JMenu ("Size");
		
		
		/*Introduce config_menu arguments. The strings at the end represents the empty spaces that will 
		store the images bold and italic icons:*/		
		config_menus ("Arial", "font","Arial",9,10, "");
		
		config_menus ("Courier New", "font","Courier New",9,10, "");
		
		config_menus ("Verdana", "font","Verdana",9,10, "");
		
		/*---Create checkBox items in the menu style. It applies for bold and italic.
		 * Also, we introduce the image that represents each of them:*/		 
		
		JCheckBoxMenuItem boldi = new JCheckBoxMenuItem ("Bold", new ImageIcon ("src\\graficos\\bold.png"));
		
		JCheckBoxMenuItem italic = new JCheckBoxMenuItem ("Italic", new ImageIcon ("src\\graficos\\italic.png"));
		
		boldi.addActionListener(new StyledEditorKit.BoldAction());
		
		italic.addActionListener(new StyledEditorKit.ItalicAction());
		
		style.add(boldi);
		
		style.add(italic);
		
		
		//---Create a button to store all sizes in the menu Size:		
		ButtonGroup letter_size = new ButtonGroup (); 
		
		JRadioButtonMenuItem twuelve = new JRadioButtonMenuItem ("12");
		
		JRadioButtonMenuItem sixteen = new JRadioButtonMenuItem ("16");
		
		JRadioButtonMenuItem twenty = new JRadioButtonMenuItem ("20");
		
		JRadioButtonMenuItem twenty_four = new JRadioButtonMenuItem ("24");
		
		//-Add those buttons to letter_size group, to make them work equal:		
		letter_size.add(twuelve);
		
		letter_size.add(sixteen);
		
		letter_size.add(twenty);
		
		letter_size.add(twenty_four);
			
					
		/*-To make work the previous elements, we have to create their functionality. Using ActiionListner, the element make a change 
		every time some push a button. Using StyledEditorKit.FontSizeAction, make changes in the text, in this case,related to size (JEditorPane):*/		
		twuelve.addActionListener(new StyledEditorKit.FontSizeAction("change_size", 12));
		
		sixteen.addActionListener(new StyledEditorKit.FontSizeAction("change_size", 16));
		
		twenty.addActionListener(new StyledEditorKit.FontSizeAction("change_size", 20));
		
		twenty_four.addActionListener(new StyledEditorKit.FontSizeAction("change_size", 24));
		
		//add to the menu size all the elements that will be display on it:		
		size.add(twuelve);
		
		size.add(sixteen);
		
		size.add(twenty);
		
		size.add(twenty_four);
		
		//we add to the bar, which is the main menu, the tree main contents of the menu:		
		mybar.add(font);
		
		mybar.add(style);
		
		mybar.add(size);
		
		//Second main step. Add the main menu called bar to LayerMenu to make it visible.Has to be located on top of the frame, north of it:		
		layermenu.add(mybar);
		
		add(layermenu, BorderLayout.NORTH);		
		
		//----Build an object "myarea" to add it to the central part of the frame, so we can write text on it:	
		myarea = new JTextPane ();
		
		add (myarea, BorderLayout.CENTER);
		
		 				
	}
	
	/*---3 Step. Once the previous constructor is finished, we create the method config_menus. Creates "label" to determine the type of font, "menu", to specify if the element 
	 * we creates goes to "font, style or size" each time; "letter_style", determines font type; styles, determines if is bold or italic.Also, "route_icon will store the route 
	 * add the images to use in the menu style for bold and italic":*/	
	public void config_menus (String label, String menu, String letter_style, int styles, int sizes, String route_icon) {
		
		
	//Start to instantiate JMenuItem, using the parameter String type called "label", so we can change the font to "Arial", Courier or Verdana": 		
		JMenuItem elem_menu = new JMenuItem (label);
		
			if (menu == "font") {
				
				font.add(elem_menu);
				
				if (letter_style == "Arial") {
					
					elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("change_letter", "Arial"));
					
					} else if (letter_style == "Courier New") {
					
						elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("change_letter", "Courier New"));
					
					}else if (letter_style == "Verdana") {
					
						elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("change_letter", "Verdana"));
					}	
						
			} 
	}
	
		
	/*Creating an internal class we can declare variables inside JTextPane. So we can access to them from the main class and the internal class as well
	Better to declare them here to avoid errors in the constructor ActionListener*/
	JTextPane myarea; 

	JMenu font, style, size;
	
	Font letters; 
	
	
}
