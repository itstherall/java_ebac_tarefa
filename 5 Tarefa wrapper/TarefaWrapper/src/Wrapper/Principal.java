package Wrapper;

public class Principal {

	public static void main(String[] args) {
		//transformado variavel primitica em uma wrapper de seu tipo 
		
		int variavel_primitiva = 2;
		System.out.println("Variavel tipo inteiro primitiva: " + variavel_primitiva + "\n" );
		
		Integer variavel_wrapper = Integer.valueOf(variavel_primitiva);
		System.out.println("Variavel tipo inteiro wrapper: " + variavel_wrapper);

	}

}
