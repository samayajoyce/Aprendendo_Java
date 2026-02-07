/*exercicio15
Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês, sabendo-se que são descontados 11% para o
Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
programa que nos dê:
. salário bruto.
a. quanto pagou ao INSS.
b. quanto pagou ao sindicato.
c. o salário líquido.
d. calcule os descontos e o salário líquido, conforme a tabela
abaixo:
+ Salário Bruto : R$ - IR (11%) : R$ - INSS
(8%) : R$ - Sindicato ( 5%) : R$ = Salário
Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.*/
import java.util.Scanner;
public class SalarioLiquido{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		//Calculando salario bruto
		System.out.println("quanto voce cobra por hora: ");
		double valorHora = scan.nextDouble();
		System.out.println("Informe quantidade de horas trabalhadas no mes:");
		double horaTrabalhada = scan.nextDouble();
		double salarioBruto = valorHora * horaTrabalhada;
		
		
		//calculando descontos
		// desconto do INSS
		double descontoInss = salarioBruto * 8/100;
		
		//desconto do sindicato
		double descontoSindicato = salarioBruto *5/100;
		
		//desconto do Imposto de Renda
		double descontoImpR = salarioBruto * 11/100;
		
		// calculando salario liquido
		double salarioLiquido = salarioBruto - descontoImpR - descontoInss - descontoSindicato;
		
		System.out.println("salario bruto: " +salarioBruto);
		System.out.println("valor pago ao INSS foi: "+descontoInss);
		System.out.println("valor pago ao Sindicato foi: "+descontoSindicato);
		System.out.println("Seu salario liquido é: "+salarioLiquido);
	}
}
