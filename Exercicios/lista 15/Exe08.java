/*
Aula 15 execicio 08
Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre
pelo mais barato.
 */
import java.util.Scanner;

public class Exe08 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("informe o valor do porduto1: ");
		double valor1 = scan.nextDouble();
		System.out.println("informe o valor do produto2: ");
		double valor2 = scan.nextDouble();
		System.out.println("informe o valor do produto3: ");
		double valor3 = scan.nextDouble();
		
		
		if(valor1 < valor2 && valor1 < valor3){
			System.out.println("Produto1 é mais barato pode comprar");
		}else if(valor2 < valor1 && valor2 < valor3){
			System.out.println("Produto2 é mais barato pode comprar");
		}else{
			System.out.println("Produto3 é mais barato pode comprar");
		}
		
	}
}

