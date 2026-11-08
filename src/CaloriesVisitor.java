
public class CaloriesVisitor implements WorkoutVisitor {

    private double totalCalories = 0;

    @Override
    public void visitStrengthExercise(StrengthExercise exercise) {

        double calories = exercise.getSets() * exercise.getReps() * 0.5;

        totalCalories += calories;

        System.out.println(
                exercise.getName() + ": " + calories + " kcal"
        );
    }

    @Override
    public void visitCardioExercise(CardioExercise exercise) {

        double calories = exercise.getDuration() * 7;

        totalCalories += calories;

        System.out.println(
                exercise.getName() + ": " + calories + " kcal"
        );
    }

    public double getTotalCalories() {
        return totalCalories;
    }
}
