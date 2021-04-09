public class Barista {
    public static String makeCoffee(int menuNumber) {
        Menu coffee = Menu.valueOf(menuNumber);
        return coffee.getCoffeeName();
    }
}
