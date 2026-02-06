//exercicio 6
//formula da area do circulo pi x raio ², pi = 3.14
import java.util.Scanner;
public class AreaDoCirculo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("informe o valor do raio: ");
		double raio = scan.nextDouble();
		double areaCirculo = 3.14 * raio * raio;
		
		System.out.println("A area do circulo é: "+areaCirculo);
	}
}
