package decoratormodel;

/**
 * 豆浆
 */
public class Soy extends Condiment{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + "+豆浆";
    }

    public double cost() {
        return .99 + beverage.cost();
    }
}
