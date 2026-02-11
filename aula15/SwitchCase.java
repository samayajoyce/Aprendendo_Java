/*
aula 15 switchcase
 */
import java.util.Scanner;

public class SwitchCase {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(java.util.Locale.US);
		
		System.out.println("informe dia da semana(1-7): ");
		int diaSemana = scan.nextInt();
		
		/*if (diaSemana == 1){
			System.out.println("domingo");
		}else if (diaSemana == 2){
			System.out.println("segunda");
		}else if (diaSemana == 3){
			System.out.println("terça");
		}else if (diaSemana == 4){
			System.out.println("quarta");
		}else if (diaSemana == 5){
			System.out.println("quinta");
		}else if (diaSemana == 6){
			System.out.println("sexta");
		}else if (diaSemana == 7){
			System.out.println("sabado");
		}else{
			System.out.println("valor invalido");
		}*/
		//agora usando o switch case
		switch(diaSemana){
			//se nao usar break executa toda linha de codigo
			case 2: 
			case 3: 
			case 4: 
			case 5: 
			case 6: System.out.println("dia util");break;
			case 1:
			case 7: System.out.println("fim de semana");break;
			default: System.out.println("nao é dia da semana valido");
			
		}
		
		
	}
}

