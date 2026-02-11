/*
Aula 13 exercicio 13
Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
. Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou
abaixo do peso.
 */
import java.util.Scanner;

public class PesoIdeal2 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("informe M-mulher ou H-homem: ");
		char sexo = scan.next().charAt(0);
		System.out.println("informe sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("informe seu peso: ");
		double pesoAtual = scan.nextDouble();
		
		if(sexo == 'm' || sexo == 'M'){
			double  pesoIdeal = (62.1 * altura)-44.7;
			if (Math.abs(pesoAtual - pesoIdeal) < 0.1){
				System.out.println("Voce esta dentro do peso");
			}else if(pesoAtual < pesoIdeal){
				System.out.println("voce esta abaixo do peso");
			}else{
				System.out.println("voce esta acima do peso");
			}
		}else if(sexo == 'h' || sexo == 'H'){
			double pesoIdeal = (72.7 * altura) - 58;
			System.out.println("pesoideal:"+pesoIdeal);
			if(Math.abs(pesoAtual - pesoIdeal) < 0.1){
				System.out.println("voce esta dentro do peso");
			}else if(pesoAtual < pesoIdeal){
				System.out.println("voce esta abaixo do peso");
			}else{
				System.out.println("voce esta acima do peso");
			}
		}else{
			System.out.println("valor invalido");
		}
		
		
	}
}

