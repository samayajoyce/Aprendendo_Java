/*
Aula 15 exercicio 07
Faça um Programa que leia três números e mostre o maior e o menor
deles.
 */

import java.util.Scanner;
public class Exe07 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe primeiro valor: ");
		int valor1 = scan.nextInt();
		System.out.println("informe segundo valor: ");
		int valor2 = scan.nextInt();
		System.out.println("informe terceiro valor: ");
		int valor3 = scan.nextInt();
		int maior = 0;
		int menor = 0;
		if(valor1 > valor2 && valor1 > valor3){
			maior = valor1;
		}else if(valor2 > valor1 && valor2 > valor3){
			maior = valor2;
		}else{
			maior = valor3;
		}if (valor1 < valor2 && valor1 < valor3){
			menor = valor1;
		}else if (valor2 < valor1 && valor2 < valor3){
			menor = valor2;
		}else{
			menor = valor3;
		}
          
	
		System.out.println("maior: "+maior);
		System.out.println("menor: "+menor);
		
	}
}

