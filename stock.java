import java.util.*;

class Room {
    private int roomNumber;
    private String category;
    private double price;
    private boolean booked;

    public Room(int roomNumber, String category, double price) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.price = price;
        this.booked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return booked;
    }

    public void bookRoom() {
        booked = true;
    }

    public void cancelRoom() {
        booked = false;
    }

    public void displayRoom() {
        System.out.printf("%-10d %-12s ₹%-10.2f %-10s%n",
                roomNumber,
                category,
                price,
                booked ? "Booked" : "Available");
    }
}

class Booking {

    private String customerName;
    private Room room;

    public Booking(String customerName, Room room) {
        this.customerName = customerName;
        this.room = room;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Room getRoom() {
        return room;
    }

    public void displayBooking() {
        System.out.println("----------------------------");
        System.out.println("Customer : " + customerName);
        System.out.println("Room No  : " + room.getRoomNumber());
        System.out.println("Category : " + room.getCategory());
        System.out.println("Price    : ₹" + room.getPrice());
        System.out.println("----------------------------");
    }
}

class Hotel {

    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Booking> bookings = new ArrayList<>();

    public Hotel() {

        rooms.add(new Room(101,"Standard",1500));
        rooms.add(new Room(102,"Standard",1500));
        rooms.add(new Room(103,"Standard",1500));

        rooms.add(new Room(201,"Deluxe",2500));
        rooms.add(new Room(202,"Deluxe",2500));

        rooms.add(new Room(301,"Suite",5000));
        rooms.add(new Room(302,"Suite",5000));
    }

    public void showRooms() {

        System.out.println("\nAvailable Rooms");
        System.out.println("---------------------------------------------");
        System.out.printf("%-10s %-12s %-12s %-10s%n",
                "Room","Category","Price","Status");

        for(Room r:rooms){
            r.displayRoom();
        }
    }

    public Room searchRoom(int number){

        for(Room r:rooms){
            if(r.getRoomNumber()==number)
                return r;
        }

        return null;
    }

    public void bookRoom(Scanner sc){

        System.out.print("Enter Room Number : ");
        int number=sc.nextInt();
        sc.nextLine();

        Room room=searchRoom(number);

        if(room==null){
            System.out.println("Invalid Room.");
            return;
        }

        if(room.isBooked()){
            System.out.println("Room Already Booked.");
            return;
        }

        System.out.print("Enter Customer Name : ");
        String name=sc.nextLine();

        System.out.println("Room Price : ₹"+room.getPrice());

        System.out.print("Proceed Payment? (yes/no): ");
        String pay=sc.nextLine();

        if(pay.equalsIgnoreCase("yes")){

            room.bookRoom();

            bookings.add(new Booking(name,room));

            System.out.println("Payment Successful.");
            System.out.println("Room Booked Successfully.");

        }else{

            System.out.println("Payment Cancelled.");

        }

    }
public void bookRoom(Scanner sc) {

    System.out.print("Enter Room Number : ");
    int number = sc.nextInt();
    sc.nextLine();

    Room room = searchRoom(number);

    if (room == null) {
        System.out.println("Invalid Room.");
        return;
    }

    if (room.isBooked()) {
        System.out.println("Room Already Booked.");
        return;
    }

    System.out.print("Enter Customer Name : ");
    String name = sc.nextLine();

    System.out.println("Room Price : ₹" + room.getPrice());

    System.out.print("Proceed Payment? (yes/no): ");
    String pay = sc.nextLine();

    if (pay.equalsIgnoreCase("yes")) {

        room.bookRoom();
        bookings.add(new Booking(name, room));

        System.out.println("Payment Successful.");
        System.out.println("Room Booked Successfully.");

    } else {

        System.out.println("Payment Cancelled.");
    }
}