import Hotel.Hotel;
import Hotel.Guest;
import Hotel.Booking;
import Hotel.Rooms.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel codeClanTowers;
    ArrayList<BedRoom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    HashMap<String, DiningRoom> diningRooms;
    DiningRoom diningRoom1;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;

    @Before
    public void before() {
        bedrooms = new ArrayList<BedRoom>();
        for (int i = 0; i < 15; i++) {
            bedrooms.add(new BedRoom(i, RoomType.SINGLE, 100.00));
        }
        for (int i = 0; i < 10; i++) {
            bedrooms.add(new BedRoom(i, RoomType.DOUBLE, 120.00));
        }
        conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(new ConferenceRoom(10, "Room A"));
        conferenceRooms.add( new ConferenceRoom(20, "Room B"));

        diningRooms = new HashMap<String, DiningRoom>();
        diningRoom1 = new DiningRoom(50, "Breakfast Room");
        diningRooms.put(diningRoom1.getName(), diningRoom1);

        guest1 = new Guest("Boe Jloggs;");
        guest2 = new Guest("Joe Bloggs");
        guests = new ArrayList<Guest>();
        guests.add(guest1);
        guests.add(guest2);


        codeClanTowers = new Hotel(bedrooms, conferenceRooms, diningRooms);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(25, codeClanTowers.getBedrooms().size());
    }

    @Test
    public void canCheckInGuest() {
        BedRoom room = codeClanTowers.getBedrooms().get(0);
        codeClanTowers.checkIn(room, guests);
        assertEquals(1, room.getGuests().size());
    }

    @Test
    public void canCheckOutGuest() {
        BedRoom room = codeClanTowers.getBedrooms().get(0);
        codeClanTowers.checkIn(room, guests);
        codeClanTowers.checkOut(room, guests);
        assertEquals(0, room.getGuests().size());
    }

    @Test
    public void canBookRoom() {
        BedRoom room = codeClanTowers.getBedrooms().get(0);
        Booking booking = codeClanTowers.bookRoom(room, 2);
        assertEquals(room, booking.getBedRoom());
        assertEquals(2, booking.getNightsBooked());
    }

    @Test
    public void canGetDiningRooms() {
        assertEquals("Breakfast Room", diningRooms.get("Breakfast Room").getName());
        assertEquals(1, diningRooms.size());
    }

    @Test
    public void canGetVacantRooms() {
        BedRoom room = codeClanTowers.getBedrooms().get(0);
        codeClanTowers.checkIn(room, guests);
        assertEquals(24, codeClanTowers.getVacantRooms().size());

    }
}
