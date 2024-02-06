import java.util.ArrayList;
import java.util.List;

// Class representing a menu item
class MenuItem {
    private String itemName;
    private double price;

    public MenuItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
}

// Class representing an order
class Order {
    private List<MenuItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

// Class representing a restaurant
class Restaurant {
    private List<MenuItem> menu;

    public Restaurant() {
        this.menu = new ArrayList<>();
    }

    public void addToMenu(MenuItem item) {
        menu.add(item);
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public Order createOrder() {
        return new Order();
    }
}

// Example usage
class RestaurantOrderSystem {
    public static void main(String[] args) {
        // Create a restaurant
        Restaurant myRestaurant = new Restaurant();

        // Add menu items
        MenuItem item1 = new MenuItem("Burger", 10.99);
        MenuItem item2 = new MenuItem("Pizza", 15.99);
        myRestaurant.addToMenu(item1);
        myRestaurant.addToMenu(item2);

        // Display menu
        System.out.println("Menu:");
        for (MenuItem menuItem : myRestaurant.getMenu()) {
            System.out.println(menuItem.getItemName() + " - $" + menuItem.getPrice());
        }

        // Create an order
        Order myOrder = myRestaurant.createOrder();

        // Add items to the order
        myOrder.addItem(item1);
        myOrder.addItem(item2);

        // Display order details
        System.out.println("\nOrder Details:");
        for (MenuItem orderItem : myOrder.getItems()) {
            System.out.println(orderItem.getItemName() + " - $" + orderItem.getPrice());
        }

        // Calculate and display total
        System.out.println("Total: $" + myOrder.calculateTotal());
    }
}
