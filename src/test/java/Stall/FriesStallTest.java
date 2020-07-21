package Stall;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FriesStallTest {

    private FriesStall friesStall;

    @Before
    public void before(){
        friesStall = new FriesStall("The Salted Potato", "Lula Goon", 3, 2);
    }

    @Test
    public void canGetName(){
        assertEquals("The Salted Potato", friesStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Lula Goon", friesStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(2, friesStall.getParkingSpot());
    }

    @Test
    public void canGetRating(){
        assertEquals(3, friesStall.getRating());
    }
}
