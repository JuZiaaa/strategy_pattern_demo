package duckdeme01;

/**
 * 不会飞
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("我不会飞");
    }
}
