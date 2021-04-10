public class Barista {
    private static final String FINISHED_MAKE_COFFEE = "%s가 완성되었습니다.\n";

    public static void makeCoffee(String orderedCoffee) {
        System.out.printf(FINISHED_MAKE_COFFEE, orderedCoffee);
    }
}
