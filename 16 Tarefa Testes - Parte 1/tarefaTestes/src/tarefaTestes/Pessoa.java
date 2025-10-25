package tarefaTestes;

public class Pessoa {
	
	public String nome;
	public String genero;
	
	/* ** CONSTRUTORES ** */
	
	public Pessoa(String nome, String genero) {
		super();
		this.nome = nome;
		this.genero = genero;
	}
	
	/* ** GETTERS E SETTERS ** */
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	/* ** FUCTIONS ** */
	
	
	/* ** SOBREESCREVENDO ** */
	public String toString() {
        return  nome +  '|' + genero + ' ';
    }
	
}
