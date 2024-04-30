
public class Main {
    public static void main(String[] args) {

        RedheadedDuck redheadedDuck= DuckFactory.createredHeadedDuck();
        redheadedDuck.getFlyingBehavior().fly();
        redheadedDuck.getQuackBehavior().quack();
        RubberDuck rubberDuck=DuckFactory.createdRubberDuck();
        rubberDuck.getFlyingBehavior().fly();
        rubberDuck.getQuackBehavior().quack();


    }

}