package TarefaMod;

public class PessoaJuridica extends Pessoa {

	long cnpj;

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	void imprimirInformacoes() {
		System.out.println("Esta é uma Pessoa FISICA, nome: " + this.getNome() + "\nde idade: " + this.getIdade() + "\nCNPJ: " + this.getCnpj());
	}
}
