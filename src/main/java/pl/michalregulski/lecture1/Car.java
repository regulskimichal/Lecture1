package pl.michalregulski.lecture1;

public class Car {

    public static final int YEAR_FROM = 1900;

    private final String modelName;
    private final String manufacturerName;
    private final int productionYear;
    private final int numberOfSeats;
    private final Color color;

    public Car(String modelName, String manufacturerName, int productionYear, int numberOfSeats, Color color) {
        this.modelName = modelName;
        this.manufacturerName = manufacturerName;
        this.productionYear = productionYear;
        this.numberOfSeats = numberOfSeats;
        this.color = color;

        if (this.productionYear < YEAR_FROM) {
            throw new IllegalArgumentException("It cannot be produced before " + YEAR_FROM);
        }
    }

    public String getModelName() {
        return modelName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", productionYear=" + productionYear +
                ", numberOfSeats=" + numberOfSeats +
                ", color='0x" + Integer.toString(color.getHexCode(), 16) + '\'' +
                '}';
    }

}
