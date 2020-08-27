import Hotel.Booking;
import Hotel.Rooms.BedRoom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    Booking booking;
    BedRoom bedRoom;

    @Before
    public void before() {
        bedRoom = new BedRoom(10, RoomType.SINGLE);
        booking = new Booking(bedRoom, 2);
    }

    @Test
    public void hasRoom() {
        assertEquals(bedRoom, booking.getBedRoom());
    }

    @Test
    public void hasNightsBooked() {
        assertEquals(2, booking.getNightsBooked());
    }
}
