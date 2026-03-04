package RoomService;

public class Invoice {

    private double roomCost;
    private RoomServiceOrder serviceOrder;

    public Invoice(double roomCost, RoomServiceOrder serviceOrder) {
        this.roomCost = roomCost;
        this.serviceOrder = serviceOrder;
    }

    public double calculateServiceCost() {
        if (serviceOrder != null) {
            return serviceOrder.calculateServiceTotal();
        }
        return 0;
    }

    public double calculateGrandTotal() {
        return roomCost + calculateServiceCost();
    }

    public void printInvoice() {

        System.out.println("========== HOTEL INVOICE ==========");
        System.out.println("Room Cost: ₱" + roomCost);

        if (serviceOrder != null && !serviceOrder.getItems().isEmpty()) {
            serviceOrder.displayOrder();
        } else {
            System.out.println("No Room Service Availed.");
        }

        System.out.println("-----------------------------------");
        System.out.println("GRAND TOTAL: ₱" + calculateGrandTotal());
        System.out.println("===================================");
    }
}