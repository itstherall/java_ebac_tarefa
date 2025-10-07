package tarefa;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		List<Carro> vendaPatio = new ArrayList<>();
		
		//Instanciando carros aleatorios
		Chevrolet carOne = new Chevrolet("celta" , 2002);
		Chevrolet carTwo = new Chevrolet("Cobalt", 2023);
		Toyota carTree = new Toyota("Etios", 2014, 25.000);
		Toyota carFour = new Toyota("Corolla", 2007, 71.000);
		
		//Adicionando carros ao patio de vendas
		
		vendaPatio.add(carOne);
		vendaPatio.add(carTwo);
		vendaPatio.add(carTree);
		vendaPatio.add(carFour);
		
		//Listando os carros no Patio
		listarCarros(vendaPatio);
		
		
	}
	
	 public static <T> void listarCarros(List<T> listaDeCarros) {
		
		 for (T carro : listaDeCarros) {
	            System.out.println("[🚗 " + carro);
	     }
		 
	 }

}
