package pl.michalregulski.lecture2;

public class Main {
    public static void main(String... args) {
        doSomething1();
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
