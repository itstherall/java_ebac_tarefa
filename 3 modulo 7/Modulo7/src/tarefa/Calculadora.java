package tarefa;

public class Calculadora {
	private int numb1;
	private int numb2;
	
	
	/* Setters and Getters*/
	
	//NUMERO 1
	public int getNumb1() {
		return numb1;
	}
	public void setNumb1(int numb1) {
		this.numb1 = numb1;
	}
	
	//NUMERO 2
	public int getNumb2() {
		return numb2;
	}
	public void setNumb2(int numb2) {
		this.numb2 = numb2;
	}
	
	
	
	
	/* Funções da calculadora */
	
	int soma() {	
		return  this.numb1 + this.numb2;
	}
	
	int multiplicacao() {
		return  this.numb1 * this.numb2;
	}
	
	int subtracao() {	
		return  this.numb1 - this.numb2;
	}
	
	
}
