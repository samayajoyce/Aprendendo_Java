/*
aula 15 exercicio 02
Faça um programa que peça um valr e mostre na tela se o valor é positivo
ou negativo
 */

import java.util.Scanner;
public class Exe02 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("informe um valor positivo ou negativo:");
		int valor = scan.nextInt();
		
		if(valor > 0){
			System.out.println("valor positivo");
		}else{
			System.out.println("valor negativo");
		}
		
	}
}

