
public class Main {

    public static void main(String[] args) {

        Workout workout = new Workout();

        workout.addExercise(
                new StrengthExercise("Bench Press", 4, 10, 60)
        );

        workout.addExercise(
                new StrengthExercise("Squat", 3, 12, 80)
        );

        workout.addExercise(
                new CardioExercise("Running", 30, 5)
        );

        workout.addExercise(
                new CardioExercise("Cycling", 20, 8)
        );

        System.out.println("===== WORKOUT REPORT =====");

        WorkoutReportVisitor reportVisitor =
                new WorkoutReportVisitor();

        workout.accept(reportVisitor);

        System.out.println("\n===== CALORIES REPORT =====");

        CaloriesVisitor caloriesVisitor =
                new CaloriesVisitor();

        workout.accept(caloriesVisitor);

        System.out.println(
                "Total calories: "
                        + caloriesVisitor.getTotalCalories()
                        + " kcal"
        );

        System.out.println("\n===== EXERCISE COUNT =====");

        ExerciseCountVisitor countVisitor = new ExerciseCountVisitor();

        workout.accept(countVisitor);

        countVisitor.printResults();

    }
}
