package Stall;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToyStallTest {

    private ToyStall toyStall;

    @Before
    public void before(){
        toyStall = new ToyStall("Torr Toys", "KT Toystall", 4, 10);
    }

    @Test
    public void canGetName(){
        assertEquals("Torr Toys", toyStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("KT Toystall", toyStall.getOwnerName());
    }

    @Test
    public void canGetRating(){
        assertEquals(4, toyStall.getRating());
    }

    @Test
    public void canParkingSpot(){
        assertEquals(10, toyStall.getParkingSpot());
    }
}
