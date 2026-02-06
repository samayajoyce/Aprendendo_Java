//exercicio 7
import java.util.Scanner;
public class DobroAreaDoQuadrado{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("informe a medida do lado do quadrado: ");
		int lado = scan.nextInt();
		
		int areaQuadrado = lado * lado;
		int dobroDaArea = areaQuadrado * 2;
		
		System.out.println("O dobro da area do quadrado é: "+dobroDaArea);
		
	}
	
}
