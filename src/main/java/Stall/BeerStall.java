package Stall;

import Behaviours.IReviewed;
import Behaviours.ISecurity;
import People.Visitor;

public class BeerStall extends Stall implements ISecurity, IReviewed {

    public BeerStall(String name, String ownerName, int rating, int parkingSpot) {
        super(name, ownerName, rating, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() <18){
            return false;} else{return true;}
    }


}
