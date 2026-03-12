package Hotel_Manager;


import Person.*;
import Room.*;
import java.util.*;

public class HotelManager {
    private Scanner sc;

    private String HotelName;
    private ArrayList<Guest> guests;
    private ArrayList<Room> rooms;
    private ArrayList<Staff> staffs;
    private boolean hasStarted;

    public HotelManager(){
        guests = new ArrayList<>();
        rooms = new ArrayList<>();
        staffs = new ArrayList<>();
        hasStarted = false;
        sc = new Scanner(System.in);
    }


    public void start(){
        if(hasStarted){
            System.out.println("Simulation has already started");
        }else{
            fastType("Welcome to Hotel Management Simulator!");
            fastType("Lets start by naming your Hotel!");
            fastTypeNoNewLine("Enter Hotel Name: ");
            HotelName = sc.nextLine();

            fastType("Amazing!");
            fastType("In this simulation we only have 3 kinds of room");
            fastType("Standard,Premium and VIP!");

            while(true){
                fastTypeNoNewLine("How many Standard Rooms do you want to have? ");
                int amnt = sc.nextInt(); 
                if(addStandardRooms(amnt)) break;
            }

            while(true){
                fastTypeNoNewLine("How many Premium Rooms do you want to have? ");
                int amnt = sc.nextInt(); 
                if(addPremiumRooms(amnt)) break;
            }

            while(true){
                fastTypeNoNewLine("How many VIP Rooms do you want to have? ");
                int amnt = sc.nextInt();
                sc.nextLine();
                if(addVIPRooms(amnt)) break;
            }
            

            fastType("So here is the structure of your hotel");
            printHotel();

            fastType("===========================================================");
            fastType("===========================================================");
            fastType("===========================================================");

            
        }
    }

    public void manage(){
        String firstName; String middleName; String lastName; 
        String contact; String email; String roomtype;
        int duration;
        char opt = '0';
        while(opt != 'x'){
            System.out.println("List of Functions:");
            System.out.println("a = add Guest || r = remove Guest");
            System.out.println("s = cater room service");
            System.out.println("v = view hotel");
            System.out.println("x = exit system");
            fastTypeNoNewLine("Option? ");
            String input = sc.nextLine();
            if(input.isEmpty()) continue;
            opt = input.charAt(0);

            switch (opt) {
                case 'a':
                    fastType("You have chosen to add a guest!");
                    fastType("===========================================================");
                    System.out.print("Enter the First Name of the Guest: ");
                    firstName = sc.nextLine();
                    System.out.print("Enter the Middle Name of the Guest (type NA if not applicable): ");
                    middleName = sc.nextLine();
                    System.out.print("Enter the Last Name of the Guest: ");
                    lastName = sc.nextLine();
                    System.out.print("Enter the contact number of the Guest: ");
                    contact = sc.nextLine();
                    System.out.print("Enter email address of the Guest (type NA if not applicable): ");
                    email = sc.nextLine();
                    fastType("===========================================================");
                    System.out.print("Enter the type of room: ");
                    roomtype = sc.nextLine();
                    System.out.print("Stay Duration (in days): ");
                    duration = sc.nextInt();
                    fastType("===========================================================");

                    if(addGuest(firstName, middleName, lastName, contact, email, roomtype, duration)){
                        fastType("Successfuly reserved guest a room");
                    }else{
                        fastType("System Error, an issue occured during Guest processing");
                    }
                    break;
                case 'r':
                    fastType("You have chosen to remove a guest!");
                    fastType("===========================================================");
                    System.out.print("Enter the First Name of the Guest: ");
                    firstName = sc.nextLine();
                    System.out.print("Enter the Last Name of the Guest: ");
                    lastName = sc.nextLine();
                    System.out.print("Enter the contact number of the Guest: ");
                    contact = sc.nextLine();

                    if(removeGuest(firstName, lastName, contact)){
                        fastType("Successfuly reserved guest a room");
                    }else{
                        fastType("System Error, an issue occured during Guest processing");
                    }

                    break;
                case 's':
                    System.out.println("cater guests room service");
                    fastType("===========================================================");
                    viewRoomService();
                    fastType("===========================================================");
                    viewRoomService();
                    fastType("===========================================================");
                    viewRoomService();
                    break;
                case 'v':
                    printHotel();
                    break;
                case 'x':
                    fastType(("Say Goodbye to your hotel " + HotelName));
                    break;
                default:
                    fastType("INVALID INPUT!!!");
            }
            fastType("===========================================================");
        }
    }

    // public void test(){
    //     HotelName = "Diwata Inn";
    //     addStandardRooms(3);
    //     addPremiumRooms(3);
    //     addVIPRooms(3);
    //     String firstName; String middleName; String lastName; 
    //     String contact; String email; String roomtype;
    //     int duration;
    //     char opt = '0';
    //     while(opt != 'x'){
    //         System.out.println("List of Functions:");
    //         System.out.println("a = add Guest || r = remove Guest");
    //         System.out.println("s = cater room service");
    //         System.out.println("v = view hotel");
    //         System.out.println("x = exit system");
    //         fastTypeNoNewLine("Option? ");
    //         String input = sc.nextLine();
    //         if(input.isEmpty()) continue;
    //         opt = input.charAt(0);

    //         switch (opt) {
    //             case 'a':
    //                 fastType("You have chosen to add a guest!");
    //                 fastType("===========================================================");
    //                 System.out.print("Enter the First Name of the Guest: ");
    //                 firstName = sc.nextLine();
    //                 System.out.print("Enter the Middle Name of the Guest (type NA if not applicable): ");
    //                 middleName = sc.nextLine();
    //                 System.out.print("Enter the Last Name of the Guest: ");
    //                 lastName = sc.nextLine();
    //                 System.out.print("Enter the contact number of the Guest: ");
    //                 contact = sc.nextLine();
    //                 System.out.print("Enter email address of the Guest (type NA if not applicable): ");
    //                 email = sc.nextLine();
    //                 fastType("===========================================================");
    //                 System.out.print("Enter the type of room: ");
    //                 roomtype = sc.nextLine();
    //                 System.out.print("Stay Duration (in days): ");
    //                 duration = sc.nextInt();
    //                 fastType("===========================================================");

    //                 if(addGuest(firstName, middleName, lastName, contact, email, roomtype, duration)){
    //                     fastType("Successfuly reserved guest a room");
    //                 }else{
    //                     fastType("System Error, an issue occured during Guest processing");
    //                 }
    //                 break;
    //             case 'r':
    //                 fastType("You have chosen to remove a guest!");
    //                 fastType("===========================================================");
    //                 System.out.print("Enter the First Name of the Guest: ");
    //                 firstName = sc.nextLine();
    //                 System.out.print("Enter the Last Name of the Guest: ");
    //                 lastName = sc.nextLine();
    //                 System.out.print("Enter the contact number of the Guest: ");
    //                 contact = sc.nextLine();

    //                 if(removeGuest(firstName, lastName, contact)){
    //                     fastType("Successfuly reserved guest a room");
    //                 }else{
    //                     fastType("System Error, an issue occured during Guest processing");
    //                 }

    //                 break;
    //             case 's':
    //                 System.out.println("cater guests room service");
    //                 fastType("===========================================================");
    //                 viewRoomService();
    //                 fastType("===========================================================");
    //                 viewRoomService();
    //                 fastType("===========================================================");
    //                 viewRoomService();
    //                 break;
    //             case 'v':
    //                 printHotel();
    //                 break;
    //             case 'x':
    //                 fastType(("Say Goodbye to your hotel " + HotelName));
    //                 break;
    //             default:
    //                 fastType("INVALID INPUT!!!");
    //         }
    //         fastType("===========================================================");
    //     }
        
    // }
    
    public boolean addGuest(String fn, String mn, String ln, String contact, String email, String RoomType, int stayDuration){
        if(mn.equalsIgnoreCase("NA")) mn = "";
        if(email.equalsIgnoreCase("NA")) email = "no email";
        Guest g = new Guest(fn,mn,ln,contact,email);
        guests.add(g);
        sc.nextLine();
        
        boolean foundRoom = false;

        if(RoomType.equalsIgnoreCase("Standard")){
            for(Room r : rooms){
                if(r instanceof StandardRoom && r.isAvailable()){
                    r.addGuest(g);
                    r.setDuration(stayDuration);
                    return true;
                }
            }
            return false;
        }
        else if(RoomType.equalsIgnoreCase("Premium")){
            for(Room r : rooms){
                if(r instanceof PremiumRoom && r.isAvailable()){
                    r.addGuest(g);
                    r.setDuration(stayDuration);
                    return true;
                }
            }
            return false;
        }
        else if(RoomType.equalsIgnoreCase("VIP")){
            for(Room r : rooms){
                if(r instanceof VIPRoom && r.isAvailable()){
                    r.addGuest(g);
                    r.setDuration(stayDuration);
                    return true;
                }
            }

            return false;
        }
        
        return false;
    }

    public boolean removeGuest(String fn, String ln, String contact){
        boolean found = false;

        for(Guest g : guests){
            if(g.getFirstName().equalsIgnoreCase(fn) && g.getLastName().equalsIgnoreCase(ln) && g.getContactNumber().equalsIgnoreCase(contact)){
                found =  true;
            }
        }

        if(found){
            for(Room r : rooms){
            Guest g = r.getGuest();
            if(g == null) continue;
            if(g.getFirstName().equalsIgnoreCase(fn) && g.getLastName().equalsIgnoreCase(ln) && g.getContactNumber().equalsIgnoreCase(contact)){
                    if(r instanceof StandardRoom) ((StandardRoom)r).removeGuest();
                    if(r instanceof PremiumRoom) ((PremiumRoom)r).removeGuest();
                    if(r instanceof VIPRoom) ((VIPRoom)r).removeGuest();
                    fastType(("Successfully removed " + g.getFullName() + " from their room"));
                    return true;
                }
            }

            return false;
        }
        

        return false;
    }

    public void viewRoomService(){
        for(Room r : rooms){
            if(!r.isAvailable()){
                r.generateRoomService();
            }
        }
    }


    public String getName(){return HotelName;}


    public void printHotel(){
        for(Room r : rooms){
            System.out.print("|||");            
            if(r instanceof StandardRoom) System.out.print(((StandardRoom)r).getName());
            if(r instanceof PremiumRoom) System.out.print(((PremiumRoom)r).getName());
            if(r instanceof VIPRoom) System.out.print(((VIPRoom)r).getName());
            System.out.println("||||");
        }
    }

    private boolean addStandardRooms(int amnt){
        if(amnt > 0){
            for(int i = 1; i <= amnt; i++){
                rooms.add(new StandardRoom(100 + i));
            }

            return true;
        }else{
            System.out.println("Invalid amount of Standard Rooms");
            return false;
        }
    }

    private boolean addPremiumRooms(int amnt){
        if(amnt > 0){
            for(int i = 1; i <= amnt; i++){
                rooms.add(new PremiumRoom(100 + i));
            }

            return true;
        }else{
            System.out.println("Invalid amount of Premium Rooms");
            return false;
        }
    }

    private boolean addVIPRooms(int amnt){
        if(amnt > 0){
            for(int i = 1; i <= amnt; i++){
                rooms.add(new VIPRoom(100 + i));
            }

            return true;
        }else{
            System.out.println("Invalid amount of VIP Rooms");
            return false;
        }
    }

    private void fastType(String message) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            System.out.flush();

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(); // New line at the end
    }

    private void fastTypeNoNewLine(String message) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            System.out.flush();

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    
    private void printLineBars(int n){
        for(int i = 0; i < n; i++){
            System.out.println("===========================================================");
        }
    }
}
