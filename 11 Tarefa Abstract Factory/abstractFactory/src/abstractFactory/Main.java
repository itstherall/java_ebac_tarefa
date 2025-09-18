package abstractFactory;

public class Main {
	
    public static void main(String[] args) {
    	
        Factory carFactory = new CarFactory();
        Car tesla = carFactory.retrieveCar("TESLA");
        tesla.startEngine();

        System.out.println();

        Factory companyFactory = new CompanyCarFactory();
        Car toyota = companyFactory.retrieveCar("TOYOTA");
        toyota.startEngine();
        
    }
}