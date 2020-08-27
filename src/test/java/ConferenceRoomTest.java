import Hotel.Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(20, "Room A");
    }

    @Test
    public void canGetName() {
        assertEquals("Room A", conferenceRoom.getName());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(20, conferenceRoom.getCapacity());
    }
}
