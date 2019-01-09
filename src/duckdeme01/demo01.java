package duckdeme01;


public class demo01 {

    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        Duck duck2 = new RedHeadDuck();

        duck1.display();
        duck1.swim();
        duck1.platformFly();
        duck1.platformQucak();
        System.out.println("=========");
        System.out.println("我被干掉了一个翅膀");
        duck1.setFlyBehavior(new FlyNoWay());
        duck1.platformFly();


        System.out.println("！！！！！！！");

        duck2.display();
        duck2.swim();
        duck2.platformFly();
        duck2.platformQucak();
        System.out.println("=========");
        System.out.println("巴拉拉能量，变成橡皮鸭");
        duck2.setQuackBehavior(new MuteQuack());
        duck2.platformQucak();

    }
}
