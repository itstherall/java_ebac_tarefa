package tarefa;

public class Carro<T> {
	String modelo;
	Integer ano;
	
	//GETTERS E SETTERS
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	
	//TO STRING
	@Override
	public String toString() {
		return "Carro modelo=" + modelo + ", ano=" + ano + "]\n";
	}
	public Carro(String modelo, Integer ano) {
		super();
		
		this.modelo = modelo;
		this.ano = ano;
	}
	
	//CONSTRUCTOR
	
	
	
	
	
}
