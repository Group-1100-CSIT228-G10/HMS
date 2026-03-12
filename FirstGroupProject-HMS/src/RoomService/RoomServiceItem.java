package RoomService;

public class RoomServiceItem {

    public String itemName;
    public double price;

    public RoomServiceItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public void displayItem() {
        System.out.println(itemName + " - $" + price);
    }
}