/*
Aula 15 exercicio 10
Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso. 
 */

import java.util.Scanner;
public class Exe10 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe em que turno estuda:M-matutino,V-vespertino,N-noturno: ");
		char turno = scan.next().charAt(0);
		
		switch(turno){
			case 'm':
			case 'M':System.out.println("Bom dia!");break;
			case 'v':
			case 'V':System.out.println("Boa tarde!");break;
			case 'n':
			case 'N':System.out.println("Boa noite!");break;
			default:System.out.println("Valor invalido!");
		}
		
	}
}

