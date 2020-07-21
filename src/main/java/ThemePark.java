import Attraction.Attraction;
import Behaviours.IReviewed;
import Behaviours.ISecurity;
import People.Visitor;
import Stall.Stall;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

//    private Visitor visitor;
//    private Attraction attraction;

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;


    public ThemePark(String name){
        this.name = name;
        attractions = new ArrayList<Attraction>();
        stalls = new ArrayList<Stall>();
    }

//    public ArrayList getAllReviewed(){
//
//    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.increaseVisitCount();
        visitor.addAttraction(attraction);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> allIReview = new ArrayList<IReviewed>();
        for(Stall stall : this.stalls){allIReview.add(stall);}
        for(Attraction attraction : this.attractions){allIReview.add(attraction); }
        return allIReview;
    }


    public HashMap<String, Integer> getReviewsHashMap(){
        HashMap<String, Integer> allReviews = new HashMap<String, Integer>();
        for(IReviewed iReviewed : this.getAllReviewed()){
            allReviews.put(iReviewed.getName(), iReviewed.getRating());
        }
        return allReviews;
    }

 public ArrayList<IReviewed> getAllAllowedFor(Visitor visitor) {
     ArrayList<IReviewed> allAllowed = new ArrayList<IReviewed>();
     for (IReviewed item : this.getAllReviewed()) {

         if(item instanceof ISecurity){
         if (((ISecurity) item).isAllowedTo(visitor)) {
             allAllowed.add(item);
         }}else{allAllowed.add(item);}

     }
     return allAllowed;
 }



}
