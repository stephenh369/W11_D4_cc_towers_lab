import Hotel.Hotel;
import Hotel.Rooms.BedRoom;
import Hotel.Rooms.ConferenceRoom;
import Hotel.Rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel codeClanTowers;
    ArrayList<BedRoom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;

    @Before
    public void before() {
        bedrooms = new ArrayList<BedRoom>();
        for (int i = 0; i < 15; i++) {
            bedrooms.add(new BedRoom(i, RoomType.SINGLE));
        }
        for (int i = 0; i < 10; i++) {
            bedrooms.add(new BedRoom(i, RoomType.DOUBLE));
        }
        conferenceRooms = new ArrayList<ConferenceRoom>();
        conferenceRooms.add(new ConferenceRoom(10, "Room A"));
        conferenceRooms.add( new ConferenceRoom(20, "Room B"));
        codeClanTowers = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void hasBedrooms() {
        assertEquals(25, codeClanTowers.getBedrooms().size());
    }
}
