package main;

import java.time.LocalDate;
import java.util.Objects;

public class SchoolEducation extends Education {

    private String name;

    public SchoolEducation(int id, Boolean finished, LocalDate start, LocalDate end, String name) {
        super(id, finished, start, end);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SchoolEducation school = (SchoolEducation) o;
        return Objects.equals(name, school.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }

    @Override
    public String toString() {
        return "SchoolEducation{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}