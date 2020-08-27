package Hotel;

import Hotel.Rooms.BedRoom;

public class Booking {
    private BedRoom bedRoom;
    private int nightsBooked;

    public Booking(BedRoom bedRoom, int nightsBooked) {
        this.bedRoom = bedRoom;
        this.nightsBooked = nightsBooked;
    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }

    public int getNightsBooked() {
        return nightsBooked;
    }
}
