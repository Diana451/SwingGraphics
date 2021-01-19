package graficos;
//video 91 see EjemploArea before to understand this
/*ver al finale n la condicon otra forma de hacer condiciones
en el coment, usando ? : */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPruebaArea mimarco = new MarcoPruebaArea();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}
	
}
class MarcoPruebaArea extends JFrame {
	
	public MarcoPruebaArea () {
		
		setTitle ("Probando Area de Texto");
		
		setBounds (500,300,500,650);
		
		setLayout (new BorderLayout ());
		
		laminaBotones = new JPanel ();
		
		botonInsertar = new JButton ("Insertar");
		
		botonInsertar.addActionListener(new ActionListener () 
		
		{

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			areaTexto.append ("En un lugar de la Mancha...");
				//happn va a gregando texto una y otra vez y pide parametro de tipo String
			}
			
			});
		
		laminaBotones.add(botonInsertar);	
		
		botonSaltoLinea = new JButton ("Salto Linea");
		//botoin que se encarga de quitar y poner altos de line
		
		botonSaltoLinea.addActionListener (new ActionListener () {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				boolean saltar =! areaTexto.getLineWrap();
				
				//almacenamos en la variable saltar lo contrario al contenido del area de texto
				//si en el area de texto no hay salto de linea, en saltar se almacena un true
				areaTexto.setLineWrap(saltar);
				//con es te metodo hacemos salto de linea, las areas de texto por efecto no tiene salto de linea
			
				if (saltar){
					
					botonSaltoLinea.setText("Quitar Salto");
				} else {
					
					botonSaltoLinea.setText("Salto Linea");
				}
			
						
			// otra opcion es la siguiente, istead of the conditional
			 //botonSaltoLinea.setText (saltar ? "QuitarSalto" : "Salto Linea");
			} 
		});
		
		laminaBotones.add(botonSaltoLinea);
		
		add (laminaBotones, BorderLayout.SOUTH);
		
		areaTexto = new JTextArea (8,20);
		
		laminaConBarras = new JScrollPane (areaTexto);
		
		add (laminaConBarras, BorderLayout.CENTER);
					
	}
		
	private JPanel laminaBotones;
	
	private JButton botonInsertar, botonSaltoLinea;
	
	private JTextArea areaTexto;
	
	private JScrollPane laminaConBarras;
	
	
	
}

