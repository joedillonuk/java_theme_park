package Attraction;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    private Park park;

    @Before
    public void before(){
        park = new Park("Grassybit", 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Grassybit", park.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(3, park.getRating());
    }

    @Test
    public void hasVisitorCount(){
        assertEquals(0, park.getVisitCount());
    }
}
