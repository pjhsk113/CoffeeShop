import java.util.List;

public class Menu {
    List<MenuItem> menu;

    private Menu(List<MenuItem> menu) {
        this.menu = menu;
    }

    public static Menu from(List<MenuItem> menu) {
        return new Menu(menu);
    }

}
