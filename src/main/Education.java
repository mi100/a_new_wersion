package main;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Education {

    private int id;
    private boolean finished;
    private LocalDate start;
    private LocalDate end;

    public Education(int id, Boolean finished, LocalDate start, LocalDate end) {
        this.id = id;
        this.finished = finished;
        this.start = start;
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Education education = (Education) o;
        return id == education.id &&
                Objects.equals(finished, education.finished) &&
                Objects.equals(start, education.start) &&
                Objects.equals(end, education.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, finished, start, end);
    }

    @Override
    public String toString() {
        return "Education{" +
                "id=" + id +
                ", finished=" + finished +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}