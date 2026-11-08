
public class CardioExercise implements Exercise {

    private String name;
    private int duration;
    private double distance;

    public CardioExercise(String name, int duration, double distance) {
        this.name = name;
        this.duration = duration;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public void accept(WorkoutVisitor visitor) {
        visitor.visitCardioExercise(this);
    }
}
