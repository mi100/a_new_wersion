package main;

import java.util.Objects;

public class HighSchool extends Education{

   private int id;
   private String nameSchool;
   private Boolean finishedSchool;
   private String startDate;
   private String endDate;

    public HighSchool(int id, String tupeOfEducation, int id1, String nameSchool, Boolean finishedSchool, String startDate, String endDate) {
        super(id, tupeOfEducation);
        this.id = id1;
        this.nameSchool = nameSchool;
        this.finishedSchool = finishedSchool;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public Boolean getFinishedSchool() {
        return finishedSchool;
    }

    public void setFinishedSchool(Boolean finishedSchool) {
        this.finishedSchool = finishedSchool;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HighSchool that = (HighSchool) o;
        return id == that.id &&
                Objects.equals(nameSchool, that.nameSchool) &&
                Objects.equals(finishedSchool, that.finishedSchool) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, nameSchool, finishedSchool, startDate, endDate);
    }

    @Override
    public String toString() {
        return "HighSchool{" +
                "id=" + id +
                ", nameSchool='" + nameSchool + '\'' +
                ", finishedSchool=" + finishedSchool +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
