import Attraction.Dodgem;
import Attraction.Rollercoaster;
import People.Visitor;
import Stall.BeerStall;
import Stall.FriesStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private Rollercoaster rollercoaster;
    private Dodgem dodgem;
    private FriesStall friesStall;
    private BeerStall beerStall;
    private Visitor child;
    private Visitor adult;

    @Before
    public void before(){
        themePark = new ThemePark("Viva Tacoland");
        rollercoaster = new Rollercoaster("Dig Bipper", 4);
        dodgem = new Dodgem("Sparkars", 5);
        friesStall = new FriesStall("Sprialis", "Curly Pete", 5, 53);
        beerStall = new BeerStall("Stein Power", "Herr Ovthedogg", 4, 12);
        adult = new Visitor(20, 210, 10);
        child = new Visitor(5, 120, 3);
    }

    @Test
    public void visitorCanAddRideToVisited(){
        themePark.visit(child, rollercoaster);
        rollercoaster.getVisitCount();
        assertEquals(1, child.numberOfAttractionsVisited());
    }

    @Test
    public void attractionCanBeVisited(){
        themePark.visit(child, rollercoaster);
        assertEquals(1, rollercoaster.getVisitCount());
    }

    @Test
    public void attractionCanBeVisitedMultipleTimes(){
        themePark.visit(child, rollercoaster);
        themePark.visit(adult, rollercoaster);
        themePark.visit(child, rollercoaster);
        assertEquals(3, rollercoaster.getVisitCount());
    }

    @Test
    public void canAddAttraction(){
        themePark.addAttraction(rollercoaster);
        assertEquals(1, themePark.getAttractions().size());
    }

    @Test
    public void canAddStall(){
        themePark.addStall(friesStall);
        assertEquals(1, themePark.getStalls().size());
    }

    @Test
    public void canGetAllReviewed(){
        themePark.addAttraction(rollercoaster);
        themePark.addStall(friesStall);
        assertEquals(2, themePark.getReviewsHashMap().size());
    }

@Test
    public void canGetAllAllowedForVisitorChild(){
    themePark.addAttraction(rollercoaster);
    themePark.addStall(friesStall);
    themePark.addStall(beerStall);
    assertEquals(1, themePark.getAllAllowedFor(child).size());


}

    @Test
    public void canGetAllAllowedForVisitorAdult(){
        themePark.addAttraction(rollercoaster);
        themePark.addStall(friesStall);
        themePark.addStall(beerStall);
        assertEquals(3, themePark.getAllAllowedFor(adult).size());


    }

}
