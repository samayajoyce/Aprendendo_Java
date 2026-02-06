//exercicio 9
//converte Farenheit para Celsius
import java.util.Scanner;
public class ConverteParaCelsius{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		System.out.println("infome o valor da temperatura em °F:");
		double temperaturaF = scan.nextDouble();
		double converteParaC = (5 * (temperaturaF - 32) / 9);
		
		System.out.println("temperatura convertida para Celsius é: "+converteParaC);
	}
}
