package TarefaMod;

public class PessoaFisica extends Pessoa {
	long cpf;

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	void imprimirInformacoes() {
		System.out.println("Esta é uma Pessoa FISICA, nome: " + this.getNome() + "\nde idade: " + this.getIdade() + "\nCPF: " + this.getCpf());
	}
}
