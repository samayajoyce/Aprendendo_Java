/*
 Aula 15 exercicio 11
 As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% Após o
aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento.
 */
import java.util.Scanner;

public class Exe11 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("Informe seu valor do salario: ");
		double salarioAtual = scan.nextDouble();
		System.out.println("salario atual: "+salarioAtual);
		if (salarioAtual <= 280){
			double aumento20 = salarioAtual * 20 / 100;
			double salarioReajuste = salarioAtual + aumento20;
			System.out.println("voce teve um aumento de 20 porcento");
			System.out.println("valor do aumento: "+aumento20);
			System.out.println("salario com reajuste: "+salarioReajuste);
		}else if (salarioAtual <= 700){
			double aumento15 = salarioAtual * 15 / 100;
			double salarioReajuste = salarioAtual + aumento15;
			System.out.println("voce teve aumento de 15 porcento");
			System.out.println("valor do aumento: "+aumento15);
			System.out.println("salario com reajuste: "+salarioReajuste);
		}else if (salarioAtual <= 1500){
			double aumento10 = salarioAtual * 10 /100;
			double salarioReajuste = salarioAtual + aumento10;
			System.out.println("voce teve aumento de 10 porcento");
			System.out.println("valor do aumento: "+aumento10);
			System.out.println("salario com reajuste: "+salarioReajuste);
		}else{
			double aumento5 = salarioAtual * 5 /100;
			double salarioReajuste = salarioAtual + aumento5;
			System.out.println("voce teve aumento de 5 porcento");
			System.out.println("valor do aumento: "+aumento5);
			System.out.println("salario com reajuste: "+salarioReajuste);
		}
		
	}
}

