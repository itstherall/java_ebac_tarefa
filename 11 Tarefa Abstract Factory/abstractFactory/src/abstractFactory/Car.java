package abstractFactory;

public abstract class Car {
	
    protected int power;
    protected String color;
    protected String fuelSource;

    public Car(int horsepower, String color, String fuelSource) {
        this.power = horsepower;
        this.color = color;
        this.fuelSource = fuelSource;
    }

    public void clean() {
        System.out.println("Limpando o carro " + getClass().getSimpleName());
    }

    public void mechanicalCheck() {
        System.out.println("Fazendo check-up mecânico em " + getClass().getSimpleName());
    }

    public void fuelCar() {
        System.out.println("Abastecendo com " + fuelSource);
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " ligou o motor!");
    }
    
}