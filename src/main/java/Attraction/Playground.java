package Attraction;

import Behaviours.IReviewed;
import Behaviours.ISecurity;
import People.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() >15){
        return false;} else{return true;}
    }
}
