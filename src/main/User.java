package main;

import java.util.List;
import java.util.Objects;

public class User {


    private int id;
    private String name;
    private int age;
    private List<Role> roles;
    private String gender;
    private List<Education> educations;

    public User(int id, String name, int age, List<Role> roles, String gender, List<Education> educations) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.roles = roles;
        this.gender = gender;
        this.educations = educations;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(roles, user.roles) &&
                Objects.equals(gender, user.gender) &&
                Objects.equals(educations, user.educations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, roles, gender, educations);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", roles=" + roles +
                ", gender='" + gender + '\'' +
                ", educations=" + educations +
                '}';
    }
}