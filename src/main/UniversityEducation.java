package main;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class UniversityEducation extends Education {

    private String name;
    private List<Course> courses;

    public UniversityEducation(int id, Boolean finished, LocalDate start, LocalDate end, String name, List<Course> courses) {
        super(id, finished, start, end);
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UniversityEducation that = (UniversityEducation) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(courses, that.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, courses);
    }

    @Override
    public String toString() {
        return "UniversityEducation{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                "} " + super.toString();
    }
}