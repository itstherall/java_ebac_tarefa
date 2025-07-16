package Colecao;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pessoa> todos = new ArrayList<Pessoa>();
		List<Pessoa> mulheres = new ArrayList<Pessoa>();
		List<Pessoa> homens = new ArrayList<Pessoa>();
		Scanner generic = new Scanner(System.in);
		
		
		// -------------- MENU ----------------
		
		
		System.out.println("Para inicializar o programa iremos adicionar novas pessoas");
		adicionarPessoa(generic, mulheres, homens);
		
		while(continuaAdicionando(generic)) {
			adicionarPessoa(generic, mulheres, homens);
		}
	
		
		/*** IMPRIME LISTA DE HOMENS E MULHERES ***/
		System.out.println(" --------- LISTA DE MULHERES:  ");
		System.out.println(mulheres);
		System.out.println();
		
		System.out.println(" ------------ LISTA DE HOMENS:  ");
		System.out.println(homens);
	}
	
	
	/* ** FUNCTION DA LÓGICA PRINCIPAL ** */
	
	
	public static void adicionarPessoa(Scanner adic, List<Pessoa> mul, List<Pessoa> hom) {
		
		//Scanner adic = new Scanner(System.in);
		String tempNome = null;
		String tempGen = null;
		
		System.out.println("Qual é o NOME dessa pessoa?");
		tempNome = adic.next();
		System.out.println("Qual o GENERO dessa pessoa?");
		tempGen = adicionadoGeneroValido(adic, tempGen);
		Pessoa adicionando = new Pessoa(tempNome, tempGen);

		
		if (adicionando.getGenero().equals("Feminino")) {
	        mul.add(adicionando);
	    } else {
	        hom.add(adicionando);
	    }
		
	}
	
	public static String adicionadoGeneroValido(Scanner opc, String generoDigitado) {
		
		System.out.println("digite: - Feminino - ou - Masculino - .");
		generoDigitado = opc.next();
		
		 if(!generoDigitado.equalsIgnoreCase("Feminino") && !generoDigitado.equalsIgnoreCase("Masculino")) {
			 while (!generoDigitado.equalsIgnoreCase("Feminino") && !generoDigitado.equalsIgnoreCase("Masculino")){
				 System.out.println("Digitar genero válido");
				 generoDigitado = opc.next();
			 }
		 }
		
		return generoDigitado;
		
	}
	
	public static boolean continuaAdicionando(Scanner opc) {
		
		System.out.println("Deseja adicionar uma nova pessoa?\n 1 - sim\n 2 - Não\n");
		
		int opcc = 0;
		opc.nextLine();
		opcc = opc.nextInt();
		
		if(opcc == 1) {
			return true;
		} else if (opcc == 2) {
			return false;
		} else {
			while(opcc != 1 && opcc !=2) {
				System.out.println("\nDigite uma opção válida.");
				opcc = opc.nextInt();
			}
		}
		
		return false;
	}
}
