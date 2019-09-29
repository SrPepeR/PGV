package pgv.primeraEv;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		int[] datos = LecturaFichero.recogeDatos();
		ArrayList<Integer> datosAr = PGVArrays.toArrayList(datos);
		System.out.println("El mayor es: " + PGVArrays.mayor(datosAr));
		System.out.println("El menor es: " + PGVArrays.menor(datosAr));
		System.out.println("La suma es: " + PGVArrays.suma(datosAr));
		System.out.println("La media es: " + PGVArrays.media(datosAr));
		EscribirEnFichero.escritura(datos);
		Grafico.hacerGrafico(datos);

	}

}
