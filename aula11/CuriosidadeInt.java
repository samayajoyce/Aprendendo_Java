//curiosidade inteiro
public class CuriosidadeInt{
	public static void main(String[] args){
		
		int var1 = 2147483647;
		int var2 = 100;
		System.out.println(var1+var2);//o proximo valor que excede o limite volta para seu menor valor
		
		//declarando long lembre de especificar usando "l"apos digitar valor
		long valor3 = 20l;
		
		//literais:hexadecimais,octais,binarios
		int decVal = 26;
		int hexVal = 0x1a;
		int octVal = 032;
		int binVal = 0b11010;
		
		//para ficar legivel leitura de numeros usar underscore
		long creditCarNumber = 1234_5678_9012_3456l;
		long cpf = 101_134_156_68l;
		float pi = 3.14_15f;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7ffff_ffff_ffffl;
		byte nybytes = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;
		
		/*escape-char
		 \t = tab
		  \b= backspace
		 \n=novalinha
		  \r=retorno de carro
		 \f=avanço de pagina
		 \'=aspas simples
		 \\= barra invertida*/
		 
		 
		 
		 //"hello,world"
		 System.out.println("\"Hello,world\"\n\r");
		 //1\4
		 System.out.println("1\\4");
		 
		
	}
}
