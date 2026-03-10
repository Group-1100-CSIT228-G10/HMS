package Room;
// Useless class will be deleted soon
public class TotalRoomCost {
    private Room room;
    private long stayDays;

    public TotalRoomCost(Room room, long stayDays) {
        this.room = room;
        this.stayDays = stayDays;
    }

    public double calculate() {
        return room.getPricePerNight() * stayDays;
    }
}