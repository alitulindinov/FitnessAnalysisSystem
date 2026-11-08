
public class WorkoutReportVisitor implements WorkoutVisitor {

    @Override
    public void visitStrengthExercise(StrengthExercise exercise) {

        System.out.println("Strength Exercise:");
        System.out.println("Name: " + exercise.getName());
        System.out.println("Sets: " + exercise.getSets());
        System.out.println("Reps: " + exercise.getReps());
        System.out.println("Weight: " + exercise.getWeight() + " kg");
        System.out.println("----------------------");
    }

    @Override
    public void visitCardioExercise(CardioExercise exercise) {

        System.out.println("Cardio Exercise:");
        System.out.println("Name: " + exercise.getName());
        System.out.println("Duration: " + exercise.getDuration() + " minutes");
        System.out.println("Distance: " + exercise.getDistance() + " km");
        System.out.println("----------------------");
    }
}
