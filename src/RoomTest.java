import java.util.Scanner;
public class RoomTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter room temperature: "); //e.g. 20
        double roomTemp = scan.nextDouble();

        Room room1 = new Room(40, roomTemp,true,18.5);
        System.out.println("Room area " + room1.getRoomArea() );
        System.out.println("Current temperature: " + room1.getRoomTemperature() +". Change temperature: " + " " +  room1.decreaseTemperature(room1));
        System.out.println("Current temperature: " + room1.getRoomTemperature() +". Change temperature: " + " " + room1.decreaseTemperature(room1));
        System.out.println("Current temperature: " + room1.getRoomTemperature() +". Change temperature: " + " " + room1.decreaseTemperature(room1));

        Room room2 = new Room(30, roomTemp);
        System.out.println("\nRoom area " + room2.getRoomArea());
        System.out.println("Current temperature: " + room2.getRoomTemperature() +". Change temperature: " + " " + room2.decreaseTemperature(room1));
        System.out.println("Current temperature: " + room2.getRoomTemperature() +". Change temperature: " + " " + room2.decreaseTemperature(room1));
    }
}
