/*exercicio 18
. Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).*/
import java.util.Scanner;
public class TempoDownload{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("informe o tamanho do arquivo em MB: ");
		double tamanhoArquivo = scan.nextDouble();
		System.out.println("informe a velocidade da internet: ");
		double velocidadeInt = scan.nextDouble();
		
		double tempoMinuto = tamanhoArquivo / velocidadeInt;
		
		System.out.println("Tempo aproximado de download é de: "+tempoMinuto+" minutos.");
	}
}
