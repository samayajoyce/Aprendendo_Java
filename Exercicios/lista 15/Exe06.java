/*
aula 15 exercicio 06
Faça um Programa que leia três números e mostre o maior deles.
 */

import java.util.Scanner;
public class Exe06 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite primeiro numero: ");
		int num1 = scan.nextInt();
		System.out.println("digite segundo numero: ");
		int num2 = scan.nextInt();
		System.out.println("digite terceiro numero: ");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3){
			System.out.println(+num1+" é maior de todos");
		}else if (num2 > num1 && num2 > num3){
			System.out.println(+num2+" é maior de todos");
		}else{
			System.out.println(+num3+" é maior de todos");
		}
		
	}
}

