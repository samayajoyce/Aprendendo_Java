//Leitura de dados pelo teclado
import java.util.Scanner;
public class LeituraDadosTeclado{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo: "+nomeCompleto);
		
		System.out.println("digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Primeiro nome: "+primeiroNome);*/
		
		/*System.out.println("digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("idade: "+idade);
		
		System.out.println("digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("sua altura: "+altura);*/
		
		System.out.println("digite seu primeiro nome, altura, idade,quantodade de filhos e se tem pets: ");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("voce digitou os seguintes valores:");
		System.out.println("Primeiro nome: "+primeiroNome);
		System.out.println("idade: "+idade);
		System.out.println("quantidade de filhos: "+qtdFilhos);
		System.out.println("altura: "+altura);
		System.out.println("Tem pet: "+temPet);
	}
}
