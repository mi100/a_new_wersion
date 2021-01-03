package main;

import java.util.Objects;

public class Role {
    private int id;
    private String name;
    private boolean active;
    private String startDate;
    private String endDate;

    public Role(int id, String name, boolean active, String startDate, String endDate) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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
        Role role = (Role) o;
        return id == role.id &&
                active == role.active &&
                Objects.equals(name, role.name) &&
                Objects.equals(startDate, role.startDate) &&
                Objects.equals(endDate, role.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, active, startDate, endDate);
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", active=" + active +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
