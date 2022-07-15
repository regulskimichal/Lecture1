package pl.michalregulski.lecture2;

import java.util.List;

public class Main {
    public static void main(String... args) {

    }

    private static void boxedTypes() {
        Byte a = 1;
        Short b = 1;
        Integer c = 1;
        Long d = 1L;

        Float e = 1.0f;
        Double f = 1.0;

        Boolean g = true;

        Character h = '\0';

        // use cases
        Integer someValue = null;
        List<Integer> s = List.of();
        c.compareTo(a.intValue());
    }

    private static void doSomething1(String... args) {
        String[] arr = new String[10];
        try {
            int a = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
            System.out.println(a);

            try {
                arr[a] = "jakiś napis";
                System.out.println(arr[a]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Błędny index");
            }
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Błąd dzielenia");
        }
    }

    private static void doSomething2(String... args) {
        String[] arr = new String[10];
        try {
            int a = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
            System.out.println(a);
            arr[a] = "jakiś napis";
            System.out.println(arr[a]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
            System.out.println("Some exception");
        }
    }

    private static void doSomething3(String... args) {
        String[] arr = new String[10];
        try {
            int a = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
            System.out.println(a);
            arr[a] = "jakiś napis";
            System.out.println(arr[a]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Some exception");
        } catch (ArithmeticException ex) {
            System.out.println("Some exception");
        }
    }

}
