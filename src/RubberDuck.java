public class RubberDuck extends Duck {
    //Don' fly and don't quack( it squeak)

    public RubberDuck() {
    }

    public RubberDuck(String name, FlyingBehavior flyingBehavior, QuackBehavior quackBehavior) {
        super(name, flyingBehavior, quackBehavior);
    }
}
