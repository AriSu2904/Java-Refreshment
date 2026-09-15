public class Player extends BaseAttribute {
    Integer experience = 0;

    public Player(String name) {
        // initiate base attributes
        super(name, 1, 100, 10);
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer droppedExp) {
        this.experience += droppedExp;
    }
}
