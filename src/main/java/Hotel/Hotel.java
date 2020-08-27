package Hotel;

import Hotel.Rooms.BedRoom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.DiningRoom;
import Hotel.Rooms.Room;

import java.awt.print.Book;
import java.lang.reflect.Array;
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

    public void checkIn(Room room, ArrayList<Guest> guest) {
        if (room.isEmpty() ) {
            for ( Guest i : guest) {
                room.addGuest(i);
            }
        }
    }

    public void checkOut(Room room, ArrayList<Guest> guest) {
        for (Guest i : guest) {
            room.removeGuest(i);
        }
    }

    public Booking bookRoom(BedRoom room, int nightsBooked) {
        Booking newBooking = new Booking(room, nightsBooked);
        this.bookings.add(newBooking);
        return newBooking;
    }

    public ArrayList<BedRoom> getVacantRooms() {
        ArrayList<BedRoom> vacantRooms;
        vacantRooms = new ArrayList<BedRoom>();
        for (BedRoom i : bedrooms) {
            if (i.getGuests().size() == 0) {
                vacantRooms.add(i);
            }
        }
        return vacantRooms;
    }
}
