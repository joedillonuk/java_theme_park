package Attraction;

import Behaviours.IReviewed;
import Behaviours.ISecurity;
import Behaviours.ITicketed;
import People.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, IReviewed, ITicketed {


    public Rollercoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getHeight() < 145){
            return false;
        } else {return true;}
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 200){
            return (defaultPrice() * 2);} else {
            return defaultPrice();
        }
    }
}
