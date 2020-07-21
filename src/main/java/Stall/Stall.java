package Stall;

public abstract class Stall {

    private String name;
    private String ownerName;
    private int rating;
    private int parkingSpot;

    public Stall(String name, String ownerName, int rating, int parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.rating = rating;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(int parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
