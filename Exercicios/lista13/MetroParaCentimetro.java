//exercicio 5
import java.util.Scanner;
public class MetroParaCentimetro{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("informe um valor em metros: ");
		double valorMetro = scan.nextDouble();
		
		double converteParaCentimetro = valorMetro * 100;
		
		System.out.println("Valor digitado convertido para centimentro é: "+converteParaCentimetro);
	}
}
