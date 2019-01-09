package duckdeme01;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;


    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void swim(){
        System.out.println("所有的鸭子都会游泳");
    }

    public abstract void display();

    public void platformQucak(){
        quackBehavior.quack();
    }

    public void platformFly(){
        flyBehavior.fly();
    }
}
