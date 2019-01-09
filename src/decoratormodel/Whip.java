package decoratormodel;


/**
 *奶泡
 */
public class Whip extends Condiment{
    Beverage beverage;

    public String getDescription() {
        return beverage.getDescription()+"+奶泡";
    }

    public double cost() {
        return .55+beverage.cost();
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
}
