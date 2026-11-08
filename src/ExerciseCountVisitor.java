
public class ExerciseCountVisitor implements WorkoutVisitor {

    private int strengthCount = 0;
    private int cardioCount = 0;

    @Override
    public void visitStrengthExercise(StrengthExercise exercise) {
        strengthCount++;
    }

    @Override
    public void visitCardioExercise(CardioExercise exercise) {
        cardioCount++;
    }

    public void printResults() {
        System.out.println("Strength exercises: " + strengthCount);
        System.out.println("Cardio exercises: " + cardioCount);
        System.out.println("Total exercises: " + (strengthCount + cardioCount));
    }
}
