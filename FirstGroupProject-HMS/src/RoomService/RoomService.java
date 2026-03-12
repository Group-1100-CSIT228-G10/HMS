package RoomService;
// Useless class will be deleted soon
import java.util.ArrayList;

public class RoomService {

    private ArrayList<RoomServiceItem> items;

    public RoomService() {
        items = new ArrayList<>();
    }

    public void addItem(RoomServiceItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (RoomServiceItem item : items) {
            total += item.price;
        }
        return total;
    }
}