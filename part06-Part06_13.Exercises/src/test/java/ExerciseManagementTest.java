import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExerciseManagementTest {

	private ExerciseManagement manager;

	@Before
	public void initialize() {
		manager = new ExerciseManagement();
	}

	@Test
	public void exerciseListEmptyAtBeginning() {
		assertEquals(0, manager.exerciseList().size());
	}

	@Test
	public void addingExerciseGrowsListByOne() {
		manager.add("write a test");
		assertEquals(1, manager.exerciseList().size());
	}

	@Test
	public void addedExerciseIsInList() {
		manager.add("write a test");
		assertTrue(manager.exerciseList().contains("write a test"));
	}

	@Test
	public void exerciseCanBeMarkedAsCompleted() {
		manager.add("New exercise");
		manager.markAsCompleted("New exercise");
		assertTrue(manager.isCompleted("New exercise"));
	}
}