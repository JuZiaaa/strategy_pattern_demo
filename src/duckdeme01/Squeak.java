package duckdeme01;

/**
 *吱吱叫
 */
public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("我会吱吱叫");
    }
}
