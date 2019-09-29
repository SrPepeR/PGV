package pgv.primeraEv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LecturaFichero {

	public static void main(String[] args) {
		
		recogeDatos();

	}
	
	static public int[] recogeDatos() {
		
		ArrayList<Integer> recogida = new ArrayList<Integer>();
		
		try {
			FileInputStream archivo = new FileInputStream("datos.txt");
			InputStreamReader lector = new InputStreamReader(archivo, "UTF8");
			BufferedReader datos = new BufferedReader(lector);
			
			String linea = "";
			int num = 0;
			
			while( (linea = datos.readLine()) != null && (num = Integer.parseInt(linea)) != -1 ) {
				recogida.add(num);
			}
			
			archivo.close();
			lector.close();
			datos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int[] ordenada = PGVArrays.ordenaBurbuja(recogida);
		
		return ordenada;
	}

}
