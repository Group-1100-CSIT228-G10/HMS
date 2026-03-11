
import Hotel_Manager.HotelManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("HMS soon to open");

        HotelManager hms = new HotelManager();

        hms.start();
        hms.manage();

        // hms.test();
    }
}