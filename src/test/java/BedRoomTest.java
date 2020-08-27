import Hotel.Rooms.BedRoom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedroom;

    @Before
    public void before() {
        bedroom = new BedRoom(1, RoomType.DOUBLE);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }
}
