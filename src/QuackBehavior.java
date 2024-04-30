public class QuackBehavior {
    String description="I quack";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void quack(){
        System.out.println(description);
    }
}
