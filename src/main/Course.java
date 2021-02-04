package main;

import java.util.Objects;

public class Course {

    private int id;
    private String name;
    private int averageGrade;

    public Course(int id, String name, int averageGrade) {
        this.id = id;
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course courses = (Course) o;
        return id == courses.id &&
                averageGrade == courses.averageGrade &&
                Objects.equals(name, courses.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, averageGrade);
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}