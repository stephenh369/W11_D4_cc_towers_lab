import Hotel.Guest;
import Hotel.Rooms.BedRoom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedroom;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before() {
        bedroom = new BedRoom(1, RoomType.DOUBLE);
        guest1 = new Guest("Boe Joggs");
        guest2 = new Guest("Stephen");
        guest3 = new Guest("Robert");
    }

    @Test
    public void canGetCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canAddGuests() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        assertEquals(2, bedroom.getGuests().size());
    }

    @Test
    public void cannotExceedCapacity() {
        bedroom.addGuest(guest1);
        bedroom.addGuest(guest2);
        bedroom.addGuest(guest3);
        assertEquals(2, bedroom.getGuests().size());
    }
}
