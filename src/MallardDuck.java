public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {

    }

    @Override
    public void performFly() {
        super.performFly();
    }

    @Override
    public void performQuack() {
        super.performQuack();
    }

    @Override
    public void swim() {
        super.swim();
    }
}
