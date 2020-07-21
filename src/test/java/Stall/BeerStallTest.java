package Stall;

import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeerStallTest {

    private BeerStall beerStall;
    private Visitor child;
    private Visitor adult;

    @Before
    public void before(){
        beerStall = new BeerStall("Stein Power", "Herr Ovthedogg", 4, 12);
        adult = new Visitor(20, 180, 10);
        child = new Visitor(5, 120, 3);
    }

  @Test
    public void canGetName(){
        assertEquals("Stein Power", beerStall.getName());
  }

    @Test
    public void canGetOwnerName(){
        assertEquals("Herr Ovthedogg", beerStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(12, beerStall.getParkingSpot());
    }

    @Test
    public void canGetRating(){
        assertEquals(4, beerStall.getRating());
    }

    @Test
    public void childCannotEnter(){
        assertEquals(false, beerStall.isAllowedTo(child));
    }

    @Test
    public void adultCanEnter(){
        assertEquals(true, beerStall.isAllowedTo(adult));

    }

}
