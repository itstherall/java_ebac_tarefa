package TarefaMod;

public class Main {

	public static void main(String[] args) {
		
		PessoaJuridica mei = new PessoaJuridica();
		//adicionando informações da pessoa Juridica
		
		mei.setNome("Juridica");
		mei.setIdade(29);
		mei.setCnpj(1234567898L);
		
		PessoaFisica cidadao = new PessoaFisica();
		//adicionando informações da pessoa Fisica
		cidadao.setNome("Debem");
		cidadao.setIdade(47);
		cidadao.setCpf(98765432123L);
		
		cidadao.imprimirInformacoes();
		System.out.println("\n\n");
		mei.imprimirInformacoes();
		
	}

}
