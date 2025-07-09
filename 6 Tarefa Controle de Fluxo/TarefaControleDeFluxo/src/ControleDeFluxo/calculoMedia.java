package ControleDeFluxo;

public class calculoMedia {

	double nota1;
	double nota2;
	double nota3;
	double nota4;
	
	/* Getters e Setters */
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	
	/* Funções */
	
	//Pede as notas
	public void pedeNotas(double nUm, double nDois, double nTres, double nQuatro) {
		
		this.setNota1(nUm);
		this.setNota2(nDois);
		this.setNota3(nTres);
		this.setNota4(nQuatro);
		
		this.imprimeMediaNotas();
		
				
	}
	
	
	
	//retorna a média das quatro notas
	private double media() {
		double media = (nota1 + nota2 + nota3 + nota4)/4;
	
		return media;
	}
	
	//Função para imprimir notas 
	private void imprimeMediaNotas() {
		
		System.out.println("A média das notas é: " + media());
		this.valida();
		
		return;
	}
	
	//valida nota
	private void valida() {
		if(this.media() >= 7.0) {
			System.out.println("APROVADO!");
		} else if (this.media() >= 5 && this.media() < 7) {
			System.out.println("Recuperação.");
		} else {
			System.out.println("REPROVADO!");
		}
	}

}
