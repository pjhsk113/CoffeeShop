public class Customer {

    public void order(int menuNumber, int money) {
        Cashier cashier = new Cashier();
        cashier.takeOrder(money, menuNumber);
    }
}
