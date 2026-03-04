package RoomService;

public class RoomServiceItem {

    private String itemName;
    private double price;

    public RoomServiceItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public void displayItem() {
        System.out.println(itemName + " - ₱" + price);
    }
}