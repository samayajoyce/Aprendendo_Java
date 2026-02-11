/*
Aula 15 exercicio 01
Faça um Programa que peça dois numeros e imprima o maior deles
 */

import java.util.Scanner;
public class Exe01{
	
	public static void main (String[] args) {
		Scanner scan =new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("informe um valor: ");
		int num1 = scan.nextInt();
		System.out.println("informe outro valor: ");
		int num2 = scan.nextInt();
		
		if (num1 > num2){
			System.out.println(+num1+" é maior que "+num2);
		}else{
			System.out.println(+num2+" é maior que "+num1);
		}
		
	}
}

