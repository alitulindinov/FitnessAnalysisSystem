
import java.util.ArrayList;
import java.util.List;

public class Workout {

    private List<Exercise> exercises = new ArrayList<>();

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

    public void accept(WorkoutVisitor visitor) {
        for (Exercise exercise : exercises) {
            exercise.accept(visitor);
        }
    }
}
