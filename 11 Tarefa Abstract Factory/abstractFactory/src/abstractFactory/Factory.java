package abstractFactory;

public abstract class Factory {
    public abstract Car create(String regCode);
    
    public void prepareCar(Car car) {
        System.out.println("Preparando carro: " + car.getClass().getSimpleName());
        car.clean();
        car.mechanicalCheck();
        car.fuelCar();
    }

    public Car retrieveCar(String regCode) {
        Car car = create(regCode);
        prepareCar(car);
        return car;
    }
}
