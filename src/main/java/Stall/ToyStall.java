package Stall;

import Behaviours.IReviewed;

public class ToyStall extends Stall implements IReviewed {

    public ToyStall(String name, String ownerName, int rating, int parkingSpot) {
        super(name, ownerName, rating, parkingSpot);
    }
}
