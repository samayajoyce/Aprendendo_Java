//curto circuito
public class CurtoCircuito{
	public static void main(String[] args){
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso && verdadeiro;//curto circuito,nessa caso quando é notado que o primeiro é falso ele nao olha o segundo
		boolean resultado2 = falso & verdadeiro;//nao é curto circuito
		System.out.println(resultado1);
		System.out.println(resultado2);
		
		
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);
	}
}
