/*exercicio 12
Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58*/
import java.util.Scanner;
public class PesoIdeal{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		//pedindo altura para o usuario
		System.out.println("Informe sua altura: ");
		double altura = scan.nextDouble();
		
		//calculando peso ideal
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é: "+pesoIdeal);
	}
}
