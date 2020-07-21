package Attraction;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DodgemTest {

    private Dodgem dodgem;
    private Visitor adult;
    private Visitor child;

    @Before
    public void before(){
        dodgem = new Dodgem("Bumpercars", 5);
        adult = new Visitor(20, 210, 10);
        child = new Visitor(5, 120, 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Bumpercars", dodgem.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(5, dodgem.getRating());
    }

    @Test
    public void hasVisitorCount(){
        assertEquals(0, dodgem.getVisitCount());
    }

    @Test
    public void childPaysHalf(){
        assertEquals(2.25, dodgem.priceFor(child), 0.1);
    }

    @Test
    public void canIncreaseVisitCount(){
        dodgem.increaseVisitCount();
        assertEquals(1, dodgem.getVisitCount());
    }
}