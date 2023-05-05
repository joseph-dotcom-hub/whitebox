package ssv.example;
import java.util.Objects;

public class Assignment {
    private String name;
    private String description;

    public Assignment(String name, String description) {
        this.name = Objects.requireNonNull(name, "Name cannot be null");
        this.description = Objects.requireNonNull(description, "Description cannot be null");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Assignment)) return false;
        Assignment that = (Assignment) o;
        return Objects.equals(name, that.name);
    }
}