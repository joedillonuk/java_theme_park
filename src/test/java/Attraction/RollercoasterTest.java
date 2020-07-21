package Attraction;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;
    private Visitor adult;
    private Visitor child;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Dig Bipper", 4);
        adult = new Visitor(20, 210, 10);
        child = new Visitor(5, 120, 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Dig Bipper", rollercoaster.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(4, rollercoaster.getRating());
    }

    @Test
    public void hasVisitorCount(){
        assertEquals(0, rollercoaster.getVisitCount());
    }

    @Test
    public void tooShortCannotRide(){
        assertEquals(false, rollercoaster.isAllowedTo(child));
    }

    @Test
    public void tallEnoughCanRide(){
        assertEquals(true, rollercoaster.isAllowedTo(adult));
    }

    @Test
    public void canGetDefaultPrice(){
        assertEquals(8.40, rollercoaster.defaultPrice(), 0.1);
    }

    @Test
    public void tallFolkPayDouble(){
        assertEquals(16.80, rollercoaster.priceFor(adult), 0.1);
    }
}
