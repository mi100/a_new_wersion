package main;

import java.util.Objects;

public class Items {

    private int id;
    private String nameItems;
    private int appraisal;

    public Items(int id, String nameItems, int appraisal) {
        this.id = id;
        this.nameItems = nameItems;
        this.appraisal = appraisal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameItems() {
        return nameItems;
    }

    public void setNameItems(String nameItems) {
        this.nameItems = nameItems;
    }

    public int getAppraisal() {
        return appraisal;
    }

    public void setAppraisal(int appraisal) {
        this.appraisal = appraisal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return id == items.id &&
                appraisal == items.appraisal &&
                Objects.equals(nameItems, items.nameItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameItems, appraisal);
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", nameItems='" + nameItems + '\'' +
                ", appraisal=" + appraisal +
                '}';
    }
}
