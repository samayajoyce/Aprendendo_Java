//exercicio 4
import java.util.Scanner;
public class MediaDeNotas{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		//fazendo o usuario digitar os valores na mesma linha
		System.out.println("informe sequencialmente as notas do aluno(ex:1.2 5.7 8.9 10):");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		double nota4 = scan.nextDouble();
		
		double mediaNota = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("A media das notas é: "+mediaNota);
	}
}
