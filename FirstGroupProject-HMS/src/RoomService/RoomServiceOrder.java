package RoomService;

import java.util.*;

public class RoomServiceOrder {

    private int orderId;
    private ArrayList<RoomServiceItem> items;
    private ArrayList<RoomServiceItem> availableItems;

    public RoomServiceOrder(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.availableItems = new ArrayList<>();
        setAvailableItems(availableItems);
    }
    

    public int getOrderId() {
        return orderId;
    }

    public void gacha(){
            Random randomNum = new Random();
            int random = randomNum.nextInt(0,20); 
            if(random < availableItems.size()) addItem(availableItems.get(random).getItemName());
    }

    public void addItem(String item) {
        boolean ItemFound = false;
        for(RoomServiceItem s : availableItems){
            if(s.getItemName().equals(item)){
                ItemFound = true;
                items.add(s);
                break;
            }
        }
            
        if(!ItemFound) System.out.println("Item " + item + " was not found in our items inventory");
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


    private void setAvailableItems(ArrayList<RoomServiceItem> availableItems){
        availableItems.add(new RoomServiceItem("Water", 15.00));
        availableItems.add(new RoomServiceItem("Coffee", 95.00));
        availableItems.add(new RoomServiceItem("Soda", 50.00));
        availableItems.add(new RoomServiceItem("Meal 1", 105.00));
        availableItems.add(new RoomServiceItem("Meal 2", 299.00));
        availableItems.add(new RoomServiceItem("Meal 3", 399.00));
        availableItems.add(new RoomServiceItem("Meal 4", 499.00));
        availableItems.add(new RoomServiceItem("Extra Towel", 100.00));
        availableItems.add(new RoomServiceItem("Extra Pillow", 100.00));
        availableItems.add(new RoomServiceItem("Extra Blanket", 200.00));
    }
}