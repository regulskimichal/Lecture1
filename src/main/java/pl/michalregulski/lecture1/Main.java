package pl.michalregulski.lecture1;

import static pl.michalregulski.lecture1.Color.RED;

public class Main {
    public static void main(String[] args) {
        try {
            var car = new Car("Yaris", "Toyota", 2021, 5, RED);
            System.out.println(car);
            var car2 = new Car(car.getModelName(), car.getManufacturerName(), 2022, car.getNumberOfSeats(), car.getColor());
            System.out.println(car2);

            String colorNameInPolish = null;
//            if (car.getColor() == BLUE) {
//                colorNameInPolish = "Niebieski";
//            } else if (car.getColor() == RED) {
//                colorNameInPolish = "Czerwony";
//            } else if (car.getColor() == GREEN) {
//                colorNameInPolish = "Zielony";
//            } else if (car.getColor() == BLACK) {
//                colorNameInPolish = "Czarny";
//            } else if (car.getColor() == null) {
//                colorNameInPolish = "Nie wiadomo";
//            }

            colorNameInPolish = switch (car.getColor()) {
                case RED -> "Czerwony";
                case GREEN -> "Zielony";
                case BLUE -> "Niebieski";
                case BLACK -> "Czarny";
                case null -> "Nie wiadomo";
            };

//            if (car.getColor() != null) {
//                switch (car.getColor()) {
//                    case RED:
//                        colorNameInPolish = "Czerwony";
//                        break;
//                    case GREEN:
//                        colorNameInPolish = "Zielony";
//                        break;
//                    case BLUE:
//                        colorNameInPolish = "Niebieski";
//                        break;
//                    case BLACK:
//                        colorNameInPolish = "Czarny";
//                        break;
//                    default:
//                        colorNameInPolish = "Nie wiadomo";
//                }
//            } else {
//                colorNameInPolish = "Nie wiadomo";
//            }

            System.out.println(colorNameInPolish);
        } catch (IllegalArgumentException exception) {
            System.err.println(exception);
        } finally {
            System.out.println("We handled the creation process");
        }
    }
}
