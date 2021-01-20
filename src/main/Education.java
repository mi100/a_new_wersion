package main;

import java.util.Objects;

public class Education {

    private int id;
    private String tupeOfEducation;

    public Education(int id, String tupeOfEducation) {
        this.id = id;
        this.tupeOfEducation = tupeOfEducation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTupeOfEducation() {
        return tupeOfEducation;
    }

    public void setTupeOfEducation(String tupeOfEducation) {
        this.tupeOfEducation = tupeOfEducation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Education education = (Education) o;
        return id == education.id &&
                Objects.equals(tupeOfEducation, education.tupeOfEducation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tupeOfEducation);
    }

    @Override
    public String toString() {
        return "Education{" +
                "id=" + id +
                ", tupeOfEducation='" + tupeOfEducation + '\'' +
                '}';
    }
}
