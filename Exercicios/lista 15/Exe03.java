/*
 Aula 15 exercicio 03
 Faça um programa que verifique se uma letra digitada é F ou M. Conforme a letra F-feminino
 M-masculino, Sexo invalido 
 */

import java.util.Scanner;
public class Exe03 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe seu sexo(f ou m): ");
		char letra = scan.next().charAt(0);
		
		if(letra == 'f' || letra == 'F'){
			System.out.println("sexo feminino");
		}else if (letra == 'm' || letra == 'M'){
			System.out.println("sexo masculino");
		}else{
			System.out.println("sexo invalido");
		}
	}
}

