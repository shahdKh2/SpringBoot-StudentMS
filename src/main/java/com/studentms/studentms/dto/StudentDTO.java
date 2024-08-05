package com.studentms.studentms.dto;

public class StudentDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String city;

    public StudentDTO(int id, String firstName, String lastName, String city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    public StudentDTO() {
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "StudentDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + "]";
    }

}
