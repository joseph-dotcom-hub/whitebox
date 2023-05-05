package ssv.example;

import java.util.ArrayList;
import java.util.List;

import ssv.example.Assignment;

public class AssignmentManager {
    private static List<Assignment> assignments = new ArrayList<>();

    public static void addAssignment(Assignment assignment) {
        if (assignment == null) {
            throw new IllegalArgumentException("ssv.example.Assignment cannot be null");
        }
        if (assignments.contains(assignment)) {
            throw new IllegalArgumentException("ssv.example.Assignment with the same name already exists");
        }
        assignments.add(assignment);
    }

    public static List<Assignment> getAssignments() {
        return assignments;
    }
}