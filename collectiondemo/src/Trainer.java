public class Trainer {
    int trainerId;
    String name;
    String skillSet;

    public Trainer(int trainerId, String name, String skillSet) {
        this.trainerId = trainerId;
        this.name = name;
        this.skillSet = skillSet;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }
}
