package ssv.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddAssignmentTest {

    @Test
    public void testAddAssignment() {
        Assignment assignment = new Assignment("Math Homework", "Complete the problems on page 42");
        AssignmentManager.addAssignment(assignment);
        assertEquals(1, AssignmentManager.getAssignments().size());
        assertEquals(assignment, AssignmentManager.getAssignments().get(0));
    }

    @Test
    public void testAddAssignmentDuplicate() {
        Assignment assignment1 = new Assignment("Math Homework", "Complete the problems on page 42");
        AssignmentManager.addAssignment(assignment1);

        // test branch where assignment with same name exists
        assertThrows(IllegalArgumentException.class, () -> {
            Assignment assignment2 = new Assignment("MKsath Homework", "Complete the problems on page 42");
            AssignmentManager.addAssignment(assignment2);
        });

        // test branch where assignment is null
        assertThrows(IllegalArgumentException.class, () -> AssignmentManager.addAssignment(null));

        // test branch where assignment with different name does not exist
        Assignment assignment3 = new Assignment("Science Homework", "Complete the problems on page 1");
        AssignmentManager.addAssignment(assignment3);
        assertEquals(2, AssignmentManager.getAssignments().size());
        assertEquals(assignment3, AssignmentManager.getAssignments().get(1));
    }
}
