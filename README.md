# Fitness Analysis System — Visitor Pattern

## 1. Project Description

Fitness Analysis System is a Java application that demonstrates the Visitor Design Pattern.

The application manages two types of exercises:
- Strength exercises
- Cardio exercises

It performs different operations on these exercises without modifying their classes.

## 2. Design Pattern

The project implements the Visitor Design Pattern.

### Main Components

- **Exercise** — Element interface.
- **StrengthExercise** — Concrete Element for strength exercises.
- **CardioExercise** — Concrete Element for cardio exercises.
- **WorkoutVisitor** — Visitor interface.
- **CaloriesVisitor** — calculates estimated calories.
- **WorkoutReportVisitor** — generates workout reports.
- **ExerciseCountVisitor** — counts exercise types.
- **Workout** — Object Structure that stores exercises.
- **Main** — application entry point.

## 3. How It Works

The client creates a Workout object and adds exercises to it.

Visitors perform different operations by calling the accept() method on each exercise.

The accept() method calls the corresponding visit method. This mechanism demonstrates Double Dispatch.

## 4. Clean Code Principles

1. **Meaningful Names:** Classes and methods have clear names.
2. **No instanceof:** Double Dispatch replaces explicit type checking.
3. **Single Responsibility Principle:** Each Concrete Visitor performs one operation.
4. **Encapsulation:** Exercise fields are private and accessed through getters.
5. **Extensibility:** New visitors can be added without modifying existing element classes.

## 5. Technologies

- Java
- IntelliJ IDEA
- Object-Oriented Programming
- Visitor Design Pattern
