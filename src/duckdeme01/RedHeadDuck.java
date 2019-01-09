package duckdeme01;


/**
 * 红头鸭子
 */
public class RedHeadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("红头鸭子");
    }

    public RedHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
