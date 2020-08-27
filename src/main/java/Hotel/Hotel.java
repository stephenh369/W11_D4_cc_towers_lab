package Hotel;

import Hotel.Rooms.BedRoom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<BedRoom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<BedRoom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public ArrayList<BedRoom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void checkIn(Room room, Guest guest) {
        if (room.getGuests().size() < room.getCapacity()) {
            room.addGuest(guest);
        }
    }

    public void checkOut(Room room, Guest guest) {
        room.removeGuest(guest);
    }
}
