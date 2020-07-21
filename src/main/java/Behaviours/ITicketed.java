package Behaviours;
import People.Visitor;

public interface ITicketed {

    double defaultPrice();

    double priceFor(Visitor visitor);

}
