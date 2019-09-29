package pgv.primeraEv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PGVArrays {
	
	static ArrayList<Integer> rellenaArray() {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Introduce un numero");
		while( (num = scanner.nextInt()) != -1 ) {
			System.out.println("Introduce un numero");
			ar.add(num);
		}
		
		scanner.close();
		return ar;
		
	}
	
	static int mayor(ArrayList<Integer> ar) {
		
		int mayor = ar.get(0);
		
		for(int i = 1; i < ar.size(); i++) {
			if( ar.get(i) > mayor ) {
				mayor = ar.get(i);
			}
		}
		
		return mayor;
		
	}
	
	static int menor(ArrayList<Integer> ar) {
		
		int menor = ar.get(0);
		
		for(int i = 1; i < ar.size(); i++) {
			if( ar.get(i) < menor ) {
				menor = ar.get(i);
			}
		}
		
		return menor;
		
	}
	
	static int suma(ArrayList<Integer> ar) {
		
		int suma = 0;
		
		for(int i = 1; i < ar.size(); i++) {
			suma += ar.get(i);
		}
		
		return suma;
		
	}
	
	static int media(ArrayList<Integer> ar) {
		
		int media = suma(ar)/ar.size();
		
		return media;
		
	}
	
	static int[] ordenaBurbuja(ArrayList<Integer> ar){
		
		int[] ordenada = new int[ar.size()];
		int auxI;
		int auxE;
		
		for( int i = 0; i < ar.size(); i++ ) {
			
			ordenada[i] = ar.get(i);
			
		}
		
		System.out.println(Arrays.toString(ordenada));
		
		for( int i = 0; i < ar.size() - 1; i++ ) {
			
			for( int e = i; e < ar.size(); e++ ) {
				
				if( ordenada[i] > ordenada[e] ) {
					auxI = ordenada[i];
					auxE = ordenada[e];
					ordenada[i] = auxE;
					ordenada[e] = auxI;
					
					System.out.println(Arrays.toString(ordenada));
				}
				
			}
			
		}
		
		return ordenada;
	}
	
	static ArrayList<Integer> toArrayList(int[] datos) {
		
		ArrayList<Integer> datosAr = new ArrayList<Integer>();
		
		for(int i = 0; i < datos.length; i++) {
			datosAr.add(datos[i]);
		}
		
		return datosAr;
	}

}
