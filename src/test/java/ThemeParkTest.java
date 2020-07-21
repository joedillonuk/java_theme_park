import Attraction.Rollercoaster;
import People.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private Rollercoaster rollercoaster;
    private Visitor child;
    private Visitor adult;

    @Before
    public void before(){
        themePark = new ThemePark();
        rollercoaster = new Rollercoaster("Dig Bipper", 4);
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
        assertEquals(3, rollercoaster.getVisitCount());
    }

    @Test
    public void attractionCanBeVisitedMultipleTimes(){
        themePark.visit(child, rollercoaster);
        themePark.visit(adult, rollercoaster);
        themePark.visit(child, rollercoaster);
        assertEquals(1, rollercoaster.getVisitCount());
    }
}
