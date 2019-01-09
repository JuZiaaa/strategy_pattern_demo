package decoratormodel;

/**
 * 焦烤咖啡
 */
public class DarkRoast extends Beverage{


    public DarkRoast() {
        description = "焦烤咖啡";
    }

    public double cost() {
        return 8;
    }
}
