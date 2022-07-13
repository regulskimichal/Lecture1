package pl.michalregulski.lecture1;

import static pl.michalregulski.lecture1.Color.BLACK;
import static pl.michalregulski.lecture1.Color.RED;

public class Main {
    public static void main(String[] args) {
        try {
            var car = new Car("Yaris", "Toyota", 2021, 5, RED);
            var car2 = new Car(car.getModelName(), car.getManufacturerName(), 2022, car.getNumberOfSeats(), car.getColor());

            var veryOldCar = new Car("", "", 1800, 2, BLACK);
        } catch (IllegalArgumentException exception) {
            System.err.println(exception);
        } finally {
            System.out.println("We handled the creation process");
        }
    }
}
