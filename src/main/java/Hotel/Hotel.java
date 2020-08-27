package Hotel;

import Hotel.Rooms.BedRoom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.DiningRoom;
import Hotel.Rooms.Room;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<BedRoom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private HashMap<String, DiningRoom> diningRooms;
    private ArrayList<Booking> bookings;

    public Hotel(ArrayList<BedRoom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, HashMap<String, DiningRoom> diningRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
        this.bookings = new ArrayList<Booking>();
    }

    public ArrayList<BedRoom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void checkIn(Room room, Guest guest) {
        if (room.getGuests().size() < room.getCapacity()) {
            room.addGuest(guest);
        }
    }

    public void checkOut(Room room, Guest guest) {
        room.removeGuest(guest);
    }

    public Booking bookRoom(BedRoom room, int nightsBooked) {
        Booking newBooking = new Booking(room, nightsBooked);
        this.bookings.add(newBooking);
        return newBooking;
    }
}
