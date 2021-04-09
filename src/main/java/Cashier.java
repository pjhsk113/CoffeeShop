public class Cashier {
    private static final String IS_NOT_ENOUGH_MONEY = "지불 금액이 부족합니다.";

    public String requestPayMoney(int payment, int menuNumber) {
        int coffeePrice = Menu.valueOf(menuNumber).getPrice();

        if (payment < coffeePrice) {
            validatePayAmount(payment, coffeePrice);
        }
        return requestMakeCoffee(menuNumber);
    }

    private String requestMakeCoffee(int menuNumber) {
        return Barista.makeCoffee(menuNumber);
    }

    private void validatePayAmount(int payment, int coffeePrice ) {
        if (payment < coffeePrice) {
            throw new IllegalArgumentException(IS_NOT_ENOUGH_MONEY);
        }
    }
}
