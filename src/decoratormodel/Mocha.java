package decoratormodel;


/**
 * 摩卡
 */
public class Mocha extends Condiment{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+摩卡";
    }

    @Override
    public double cost() {
        return .50+beverage.cost();
    }
}
