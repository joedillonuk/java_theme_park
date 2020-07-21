package Attraction;

import Behaviours.IReviewed;
import Behaviours.ITicketed;
import People.Visitor;

public class Dodgem extends Attraction implements IReviewed, ITicketed {

    public Dodgem(String name, int rating) {
        super(name, rating);
    }


    public double defaultPrice() {
        return 4.5;
    }

    public double priceFor(Visitor visitor) {
        if(visitor.getAge() < 12){
            return defaultPrice() / 2;} else {
            return defaultPrice();
        }
    }
}
