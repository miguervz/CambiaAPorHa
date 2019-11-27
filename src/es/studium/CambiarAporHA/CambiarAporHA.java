package es.studium.CambiarAporHA;

import java.util.Scanner;

public class CambiarAporHA {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String cadena1;
		
		System.out.println("Escribe la cadena");
		cadena1=teclado.next();
		System.out.println(cadena1.replaceAll("a", "ha"));

		teclado.close();

	
	}
	}


