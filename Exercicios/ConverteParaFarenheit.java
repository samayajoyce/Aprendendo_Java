//exercicio 10
//converte temperatura Celsius para Farenheit
import java.util.Scanner;
public class ConverteParaFarenheit{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("informe a temperatura em Celsius: ");
		double temperaturaC = scan.nextDouble();
		double converteParaF = (temperaturaC * 9/ 5) + 32;
		
		System.out.println("A temperatura "+temperaturaC+"°C em Farenheit é: "+converteParaF+"°F");
	}
	
}
