public class FlyingBehavior {
    String description ="I fly";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void fly(){
        System.out.println(description);
    }
}
