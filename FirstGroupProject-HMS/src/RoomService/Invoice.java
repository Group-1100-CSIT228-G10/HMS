package RoomService;

import Room.*;

public class Invoice {

    private Room roomUsed;
    private double roomCost;
    private RoomServiceOrder serviceOrder;

    public Invoice(Room roomUsed, double roomCost, RoomServiceOrder serviceOrder) {
        this.roomUsed = roomUsed;
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
        System.out.print("Room Status: ");
        if(roomUsed instanceof StandardRoom)      System.out.println(((StandardRoom)roomUsed).getName());
        else if(roomUsed instanceof PremiumRoom)  System.out.println(((PremiumRoom)roomUsed).getName());
        else if(roomUsed instanceof VIPRoom)      System.out.println(((VIPRoom)roomUsed).getName());
        System.out.println("Room Cost: ₱" + roomUsed.getPricePerNight());

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