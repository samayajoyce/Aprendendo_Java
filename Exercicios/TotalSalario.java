//exercicio 8
import java.util.Scanner;
public class TotalSalario{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("Quanto voce cobra por hora?: ");
		double precoHora = scan.nextDouble();
		System.out.println("informe total de horas trabalhadas no mes: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioDoMes = precoHora * horasTrabalhadas;
		
		System.out.println("Total do seu salario no referido mês é: "+salarioDoMes);
	}
}
