package duckdeme01;


/**
 * 不会叫
 */
public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("我不会叫");

    }
}
