import Attraction.Attraction;
import Behaviours.IReviewed;
import People.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private Visitor visitor;
    private Attraction attraction;

    private ArrayList<IReviewed> attractions;

    public ThemePark(){
        attractions = new ArrayList<IReviewed>();
    }

//    public ArrayList getAllReviewed(){
//
//    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.increaseVisitCount();
        visitor.addAttraction(attraction);
    }

}
