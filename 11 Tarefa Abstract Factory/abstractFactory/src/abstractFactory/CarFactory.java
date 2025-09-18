package abstractFactory;

public class CarFactory extends Factory {
    @Override
    public Car create(String regCode) {
        if (regCode.equalsIgnoreCase("TESLA")) {
            return new Tesla(500, "Red", "Electric");
        } else if (regCode.equalsIgnoreCase("AUDI")) {
            return new Audi(400, "Black", "Gasoline");
        }
        throw new IllegalArgumentException("Carro não disponível: " + regCode);
    }
}