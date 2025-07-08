package tarefa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		
		calc.setNumb1(3);
		calc.setNumb2(4);
		
		System.out.println("O resultado da soma é: " + Integer.toString(calc.soma()));
		System.out.println("O resultado da subtração é: " + Integer.toString(calc.subtracao()));
		System.out.println("O resultado da multiplicação é: " + Integer.toString(calc.multiplicacao()));
		
	}

}
