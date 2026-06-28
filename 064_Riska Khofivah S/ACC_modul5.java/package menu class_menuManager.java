package menu;

public class MenuManager {

    public static CoffeeMenu[] daftarMenu() {

        CoffeeMenu[] menu = {
            new CoffeeMenu("Avara Signature Latte", 28000, "Coffee"),
            new CoffeeMenu("Iced Americano", 22000, "Coffee"),
            new CoffeeMenu("Matcha Cloud Latte", 30000, "Non Coffee"),
            new CoffeeMenu("Chocolate Frappe", 35000, "Frappe"),
            new CoffeeMenu("Velvet Bliss Latte", 32000, "Signature")
        };

        return menu;
    }
}

