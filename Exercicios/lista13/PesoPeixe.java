/*
 Aula 13 exercicio 14
 João Papo-de-Pescador, homem de bem, comprou um
microcomputador para controlar o rendimento diário de seu trabalho.
Toda vez que ele traz um peso de peixes maior que o estabelecido
pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
você faça um programa que leia a variável peso (peso de peixes) e
verifique se há excesso. Se houver, gravar na variável excesso e na
variável multa o valor da multa que João deverá pagar. Caso contrário
mostrar tais variáveis com o conteúdo ZERO.
 */

import java.util.Scanner;
public class PesoPeixe {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		double excesso;
		double multa;
		System.out.println("informe o peso do peixe:");
		double pesoPeixe = scan.nextDouble();
		
		if(pesoPeixe > 50){
			excesso = pesoPeixe - 50;
			multa = excesso *4;
			System.out.println("valor a pagar de multa: "+multa);
		}else{
			excesso = 0;
			multa = 0;
			System.out.println("nao a multa a pagar");
		}
		
	}
}

