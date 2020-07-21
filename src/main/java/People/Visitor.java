package People;

import Attraction.Attraction;
import Behaviours.ISecurity;

import java.util.ArrayList;

public class Visitor{
    private int age;
    private double height;
    private double money;
    private ArrayList<Attraction> visitedAttractions;

    public Visitor(int age, double height, double money){
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = new ArrayList<Attraction>();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void addAttraction(Attraction attraction){
        this.visitedAttractions.add(attraction);
    }

    public ArrayList<Attraction> getVisitedAttractions(){
        return visitedAttractions;
    }

    public int numberOfAttractionsVisited(){
        return this.visitedAttractions.size();
    }


}
