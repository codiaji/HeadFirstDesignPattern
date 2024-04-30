public class Duck {
    String name;
    //How about
    private FlyingBehavior flyingBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
    }

    public Duck(String name, FlyingBehavior flyingBehavior, QuackBehavior quackBehavior) {
        this.name = name;
        this.flyingBehavior = flyingBehavior;
        this.quackBehavior = quackBehavior;
    }

    public String getName() {
        return name;
    }

    public FlyingBehavior getFlyingBehavior() {
        return flyingBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void dispaly() {
        System.out.println("I'm a duck");
    }

    public void swim() {
        System.out.println("I swim");
    }

}
