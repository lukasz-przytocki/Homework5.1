public class Room {
    private double roomArea;
    private double roomTemperature;
    private boolean isAircondition;
    private double minTemperature;

    public Room(double roomArea, double roomTemperature) {
        this.roomArea = roomArea;
        this.roomTemperature = roomTemperature;
    }

    public Room(double roomArea, double roomTemperature, boolean isAircondition, double minTemperature) {
        this(roomArea, roomTemperature);
        this.isAircondition = isAircondition;
        this.minTemperature = minTemperature;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public double getRoomTemperature() {
        return roomTemperature;
    }

    public boolean getIsAircondition() {
        return isAircondition;
    }
    public double getMinTemperature() {
        return minTemperature;
    }


    boolean decreaseTemperature(Room room) {
        if (room.isAircondition && room.roomTemperature> room.minTemperature) {
            room.roomTemperature -= 1;
            return true;
        }else{
            return false;

    }}

}
