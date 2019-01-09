package duckdeme01;


/**
 * 绿头鸭子
 */
public class MallardDuck extends Duck{
    @Override
    public void display() {
        System.out.println("绿头鸭子");
    }

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
