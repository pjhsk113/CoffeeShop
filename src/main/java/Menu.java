import java.util.Arrays;

public enum Menu {
    WATER(0, "물", 0),
    AMERICANO(1, "아메리카노", 2500),
    CAPPUCCINO(2, "카푸치노", 3000),
    LATTE(3, "라떼", 3000);

    private final int menuNumber;
    private final String coffeeName;
    private final int price;

    Menu(int menuNumber, String coffeeName, int price) {
        this.menuNumber = menuNumber;
        this.coffeeName = coffeeName;
        this.price = price;
    }

    public int getMenuNumber() {
        return menuNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public static Menu valueOf(int menuNumber) {
        return Arrays.stream(values())
                .filter(e -> e.getMenuNumber() == menuNumber)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("0,1,2,3 중에 입력 바람!"));
    }
}
