public class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
        this.quackBehavior = new Quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
