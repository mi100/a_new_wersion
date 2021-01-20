package main;

import java.util.List;
import java.util.Objects;

public class University extends Education{

    private int id;
    private String nameUniversity;
    private Boolean finishedUniversity;
    private String startDate;
    private String endDate;
    private String specialty;
    private List <Items> items;

    public University(int id, String tupeOfEducation, int id1, String nameUniversity, Boolean finishedUniversity, String startDate, String endDate, String specialty, List<Items> items) {
        super(id, tupeOfEducation);
        this.id = id1;
        this.nameUniversity = nameUniversity;
        this.finishedUniversity = finishedUniversity;
        this.startDate = startDate;
        this.endDate = endDate;
        this.specialty = specialty;
        this.items = items;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public Boolean getFinishedUniversity() {
        return finishedUniversity;
    }

    public void setFinishedUniversity(Boolean finishedUniversity) {
        this.finishedUniversity = finishedUniversity;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        University that = (University) o;
        return id == that.id &&
                Objects.equals(nameUniversity, that.nameUniversity) &&
                Objects.equals(finishedUniversity, that.finishedUniversity) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(specialty, that.specialty) &&
                Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, nameUniversity, finishedUniversity, startDate, endDate, specialty, items);
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", nameUniversity='" + nameUniversity + '\'' +
                ", finishedUniversity=" + finishedUniversity +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", specialty='" + specialty + '\'' +
                ", items=" + items +
                '}';
    }
}
