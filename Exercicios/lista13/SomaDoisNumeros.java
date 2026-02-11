//exercicio 3
import java.util.Scanner;
public class SomaDoisNumeros{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("informe primeiro valor: ");
		int valor1 = scan.nextInt();
		System.out.println("informe segundo valor: ");
		int valor2 = scan.nextInt();
		int somaValor = valor1 + valor2;
		
		System.out.println("a soma dos valores digitados é: "+somaValor);
	}
}
