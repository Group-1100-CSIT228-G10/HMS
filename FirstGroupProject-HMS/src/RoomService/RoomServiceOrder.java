package RoomService;

import java.util.ArrayList;

public class RoomServiceOrder {

    private String orderId;
    private ArrayList<RoomServiceItem> items;

    public RoomServiceOrder(String orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
    }
    

    public String getOrderId() {
        return orderId;
    }

    public void addItem(RoomServiceItem item) {
        items.add(item);
        System.out.println(item.getItemName() + " added to order.");
    }

    public void removeItem(String itemName) {
        items.removeIf(item -> item.getItemName().equalsIgnoreCase(itemName));
    }

    public double calculateServiceTotal() {
        double total = 0;

        for (RoomServiceItem item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public void displayOrder() {
        System.out.println("===== ROOM SERVICE ORDER =====");
        for (RoomServiceItem item : items) {
            item.displayItem();
        }
        System.out.println("Service Total: ₱" + calculateServiceTotal());
    }

    public ArrayList<RoomServiceItem> getItems() {
        return items;
    }
}