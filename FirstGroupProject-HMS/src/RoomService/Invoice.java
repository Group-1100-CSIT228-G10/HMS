package RoomService;

import Person.*;
import Room.*;

public class Invoice {
    private String RoomType;
    private int RoomNumber;
    private Guest InvoiceOwner;
    private int stayDuration;
    private Room roomUsed;
    private double RoomCost;
    private RoomServiceOrder serviceOrder;

    public Invoice(String RoomType, int RoomNumber, Guest InvoiceOwner, int stayDuration, double RoomCost) {
        this.RoomType = RoomType;
        this.RoomNumber = RoomNumber;
        this.InvoiceOwner = InvoiceOwner;
        this.stayDuration = stayDuration;
        this.RoomCost = RoomCost;
    }

    public double calculateServiceCost() {
        if (serviceOrder != null) {
            return serviceOrder.calculateServiceTotal();
        }
        return 0;
    }

    public double calculateGrandTotal() {
        return RoomCost * stayDuration;
    }

    public void printInvoice() {

        System.out.println("========== HOTEL INVOICE ==========");
        System.out.println("Room Occupant: " + InvoiceOwner.getFullName());
        System.out.println("Room Status: " + RoomType);
        System.out.println("Room Cost: $" + (String.format("%.2f", RoomCost)));

        if (serviceOrder != null && !serviceOrder.getItems().isEmpty()) {
            serviceOrder.displayOrder();
        } else {
            System.out.println("No Room Service Availed.");
        }

        System.out.println("-----------------------------------");
        System.out.println("GRAND TOTAL: $" + (String.format("%.2f", calculateGrandTotal())));
        System.out.println("===================================");

        System.out.println("Room Occupant Contact: " + InvoiceOwner.getContactNumber());
    }
}