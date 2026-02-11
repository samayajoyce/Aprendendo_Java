/*
Aula 15 exercicio 04
Faça um programa que verifique se uma letra digitada é vogal ou consoante
 */

import java.util.Scanner;
public class Exe04 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe uma letra de (a-z):");
		char letra = scan.next().charAt(0);
		
		switch(letra){
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':System.out.println("isso é uma vogal");break;
			default: System.out.println("isso é uma consoante");break;
		}
		
		
	}
}

