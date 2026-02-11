/*
Aula 14 If - Else 
 */

import java.util.Scanner;
public class IfElse {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		/*System.out.println("Entre com sua idade");
		int idade = scan.nextInt();
		
		if(idade >= 18){
			System.out.println("È maior de idade.");	
		}else {
			System.out.println("nao é maior de idade");
		}*/
		//barato <= 10
		//10 < valor < 15 pedir desconto
		// 15 <= valor < 17 pesquisar mais
		// >= 17 muito caro
		
		System.out.println("entre com um valor");
		double valor =scan.nextDouble();
		
		if (valor <= 10){
			System.out.println("esta barato pode comprar");
		}else if (valor > 10 && valor < 15){
			System.out.println("voce pode pedir desconto");
		}else if (valor >= 15 && valor < 17){
			System.out.println("Pesquisar mais");
		}else{
			System.out.println("muito caro");
		}
		
	}
}

