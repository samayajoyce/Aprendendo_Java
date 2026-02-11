//exercicio 2 aula 13
import java.util.Scanner;
public class PedeNumero{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("digite um numero:");
		int numeroDigitado = scan.nextInt();
		System.out.println("O numero informado foi: "+numeroDigitado);
	}
}
