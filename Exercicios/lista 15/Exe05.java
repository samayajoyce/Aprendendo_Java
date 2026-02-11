/*
 aula 15 exercicio 05
 Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a
dez.
 */

import java.util.Scanner;
public class Exe05{
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("informe nota1: ");
		double nota1 = scan.nextDouble();
		System.out.println("informe nota2: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if (media == 10){
			System.out.println("aprovado com distinçao");
		}else if (media >= 7){
			System.out.println("aprovado");
		}else{
			System.out.println("Reprovado");
		}
		
		
	}
}

