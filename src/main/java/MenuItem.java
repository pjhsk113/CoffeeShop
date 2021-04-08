public class MenuItem {
    private String coffeeName;
    private int price;

    public MenuItem(String coffeeName, int price) {
        this.coffeeName = coffeeName;
        this.price = price;
    }

    public static MenuItem from(String coffeeName, int price) {
        return new MenuItem(coffeeName, price);
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public int getPrice() {
        return price;
    }

}
