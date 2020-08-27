import Hotel.Guest;
import Hotel.Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest1;

    @Before
    public void before() {
        diningRoom = new DiningRoom(50, "Breakfast Room");
        guest1 =  new Guest("Stephen");
    }

    @Test
    public void canGetName() {
        assertEquals("Breakfast Room", diningRoom.getName());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(50, diningRoom.getCapacity());
    }

    @Test
    public void canGetGuests() {
        diningRoom.addGuest(guest1);
        assertEquals(1, diningRoom.getGuests().size());
    }

}
