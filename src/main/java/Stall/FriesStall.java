package Stall;

import Behaviours.IReviewed;

public class FriesStall extends Stall implements IReviewed {

    public FriesStall(String name, String ownerName, int rating, int parkingSpot) {
        super(name, ownerName, rating, parkingSpot);
    }
}
