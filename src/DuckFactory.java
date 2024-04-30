public class DuckFactory {
    public static RedheadedDuck createredHeadedDuck() {
        RedheadedDuck redHeadedDuck = new RedheadedDuck("redHeadedDuck",
                new FlyingBehavior(),
                new QuackBehavior());
        return redHeadedDuck;

    }

    public static RubberDuck createdRubberDuck() {
        FlyingBehavior rubberDuckFlyingBehavior = new FlyingBehavior();
        rubberDuckFlyingBehavior.setDescription("I don't fly");
        QuackBehavior quackBehavior = new QuackBehavior();
        quackBehavior.setDescription("I squeak");
        RubberDuck rubberDuck = new RubberDuck("rubberDuck",
                rubberDuckFlyingBehavior,
                quackBehavior
        );
        return rubberDuck;
    }
}
