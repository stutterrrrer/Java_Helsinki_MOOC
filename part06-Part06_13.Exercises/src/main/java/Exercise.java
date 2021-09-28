import java.util.Objects;

public class Exercise {
	private String name;
	private boolean completed;

	public Exercise(String name) {
		this.name = name;
		this.completed = false;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public String getName() {
		return name;
	}

	public boolean isCompleted() {
		return completed;
	}

	@Override
	/*
	 equals method generated from IntelliJ's code generation.
	 so that ArrayList<Exercise> can use this method for contains() ArrayList method
	 when testing for the result of ExerciseManagement's add() method.
	*/
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Exercise exercise = (Exercise) o;

		return Objects.equals(name, exercise.name);
	}
}