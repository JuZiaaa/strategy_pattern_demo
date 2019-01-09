package decoratormodel;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "混喝咖啡";
    }

    public double cost() {
        return .88;
    }
}
