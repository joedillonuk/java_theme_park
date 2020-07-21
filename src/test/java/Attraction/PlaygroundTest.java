package Attraction;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    private Playground playground;
    private Visitor child;
    private Visitor adult;

    @Before
    public void before(){
        playground = new Playground("Bairn Necessities", 2);
        adult = new Visitor(16, 6, 10);
        child = new Visitor(5, 3, 3);

    }

    @Test
    public void canGetName(){
        assertEquals("Bairn Necessities", playground.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(2, playground.getRating());
    }

    @Test
    public void hasVisitorCount(){
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void childCanEnter(){
        assertEquals(true, playground.isAllowedTo(child));
    }

    @Test
    public void adultCannotEnter(){
        assertEquals(false, playground.isAllowedTo(adult));

    }
}
