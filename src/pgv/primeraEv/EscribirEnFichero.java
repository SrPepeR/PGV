package pgv.primeraEv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirEnFichero {
	
	static public void escritura(int[] datos) {
		
		try {
			FileWriter fichero = new FileWriter("ordenado.txt");
			PrintWriter writer = new PrintWriter(fichero);
			for(int i = 0; i < datos.length; i++) {
				writer.print(datos[i]);
				writer.print(";");
			}
			
			fichero.close();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
