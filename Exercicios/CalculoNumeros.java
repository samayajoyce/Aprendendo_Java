/*exercicio 11
Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.*/
import java.util.Scanner;
public class CalculoNumeros{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		//pedindo numero inteiro
		System.out.println("digite primeiro numero inteiro:");
		int valor1 = scan.nextInt();
		System.out.println("digite segundo numero inteiro: ");
		int valor2 = scan.nextInt();
		//pedindo valor real
		System.out.println("digite um numero real: ");
		double valor3 = scan.nextDouble();
		
		//calculando os valores
		//começando pela questao a)(valor1*2)*(valor2/2)
		int produtoA = (valor1*2)*(valor2/2);
		
		//fazendo a questao b)(valor1*3) + valor3
		double somaB =(valor1*3)+valor3;
		
		//fazendo a questao c) valor3 * valor3 * valor3
		double cuboC = Math.pow(valor3,3);
		
		System.out.println("Resultado de A: "+produtoA);
		System.out.println("Resuldado de B: "+somaB);
		System.out.println("Resultado de C: "+cuboC);
		
		
	}
}
