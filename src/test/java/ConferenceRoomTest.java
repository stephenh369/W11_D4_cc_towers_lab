import Hotel.Guest;
import Hotel.Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(20, "Room A");
        guest1 = new Guest("Stephen");
    }

    @Test
    public void canGetName() {
        assertEquals("Room A", conferenceRoom.getName());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(20, conferenceRoom.getCapacity());
    }

    @Test
    public void canGetGuests() {
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.getGuests().size());
    }
}
