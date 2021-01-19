
package graficos;
import javax.swing.*;

import java.awt.GraphicsEnvironment;

public class PruebaFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fuente = JOptionPane.showInputDialog("Introduce Fuente");
		
		boolean estalafuente = false;
		
		String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		//este array para almacenar todos los tipos de fuente que tengo en mi ordenador
	
		//recorremos ese array, le damos el array que vamos a recorrer
		for (String nombredelaFuente: nombresDeFuentes)
		{
			///System.out.println(nombredelaFuente);
			//este print para saber cuales son todas las fuentes en mi pc
			//lo usamos antes de usar el boolean y condiciones para introducir y orpbar tipos de fuentes
			
			if(nombredelaFuente.equals(fuente))
			{
				estalafuente = true;
			}
		}
		
		//aqui imprime la variable que le pedimos, es decir, nombre de fuente
	    if (estalafuente) {
	    	System.out.println ("Fuente Instalada");
	    }
	    else {
	    	System.out.println ("No esta Instalada la Fuente");
	    	 
	    }

	}
}