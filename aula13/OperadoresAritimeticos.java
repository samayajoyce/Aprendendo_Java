//operadores aritimeticos
public class OperadoresAritimeticos{
	public static void main(String[] args){
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "esta é";
		String segundoNome = " uma string concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		// 5
		System.out.println(resultado++);//imprime primeiro o valor depois soma mais 1 ao valor
		//mesma coisa
		//System.out.println(resultado);
		//resultado = resultado + 1;
		//resultado += 1;
		
		System.out.println(++resultado);//adiciona primeiro mais 1 ao valor e depois imprime o valor
		//mesma coisa
		//resultado += 1;
		//System.out.println(resultado);
		
		resultado --;
		System.out.println(resultado);
		
		System.out.println(resultado--);
		System.out.println(--resultado);
	}
}
