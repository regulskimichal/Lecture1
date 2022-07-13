package pl.michalregulski.lecture1;

public class Car {

    private String modelName;
    private String manufacturerName;
    private int productionYear;
    private int numberOfSeats;
    private Color color;

    public Car(String modelName, String manufacturerName, int productionYear, int numberOfSeats, Color color) {
        this.modelName = modelName;
        this.manufacturerName = manufacturerName;
        this.productionYear = productionYear;
        this.numberOfSeats = numberOfSeats;
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
