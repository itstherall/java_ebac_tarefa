package abstractFactory;

public class CompanyCarFactory extends Factory {
    @Override
    public Car create(String regCode) {
        if (regCode.equalsIgnoreCase("TOYOTA")) {
            return new Toyota(300, "White", "Hybrid");
        } else if (regCode.equalsIgnoreCase("VOLKSWAGEN")) {
            return new Volkswagen(250, "Blue", "Gasoline");
        }
        throw new IllegalArgumentException("Carro não disponível: " + regCode);
    }
}