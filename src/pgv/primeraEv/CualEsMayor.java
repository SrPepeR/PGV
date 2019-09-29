package pgv.primeraEv;

import java.util.Scanner;

public class CualEsMayor {

	static int cualMayor() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce el primer numero...");
		int num1 = scanner.nextInt();
		System.out.println("Introduce el segundo numero...");
		int num2 = scanner.nextInt();

		scanner.close();
		System.out.print("El mayor es:  ");

		if (num1 > num2) {

			return num1;

		} else {

			return num2;

		}

	}

}
