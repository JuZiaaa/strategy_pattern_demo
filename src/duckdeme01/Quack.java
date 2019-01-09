package duckdeme01;


/**
 * 呱呱叫
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("我会呱呱叫");
    }
}
