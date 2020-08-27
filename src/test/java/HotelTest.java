import Hotel.Hotel;
import Hotel.Guest;
import Hotel.Booking;
import Hotel.Rooms.BedRoom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.Room;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel codeClanTowers;
    ArrayList<BedRoom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    Guest guest1;
    Guest guest2;

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
        guest1 = new Guest("Boe Jloggs;");
        guest2 = new Guest("Joe Bloggs");


        codeClanTowers = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(25, codeClanTowers.getBedrooms().size());
    }

    @Test
    public void canCheckInGuest() {
        BedRoom room = codeClanTowers.getBedrooms().get(0);
        codeClanTowers.checkIn(room, guest1);
        assertEquals(1, room.getGuests().size());
    }

    @Test
    public void canCheckOutGuest() {
        BedRoom room = codeClanTowers.getBedrooms().get(0);
        codeClanTowers.checkIn(room, guest1);
        codeClanTowers.checkOut(room, guest1);
        assertEquals(0, room.getGuests().size());
    }

    @Test
    public void canBookRoom() {
        BedRoom room = codeClanTowers.getBedrooms().get(0);
        Booking booking = codeClanTowers.bookRoom(room, 2);
        assertEquals(room, booking.getBedRoom());
        assertEquals(2, booking.getNightsBooked());
    }
}
