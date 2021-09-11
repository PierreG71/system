package com.ac.system.client;

import java.time.LocalDate;

public class Client {
    private Long id;
    private String name;
    private String surname;
    private LocalDate dob;
    private String email;
    private Integer age;

    public Client() {
    }

    public Client(Long id, String name, String surname, LocalDate dob, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.email = email;
        this.age = age;
    }

    public Client(String name, String surname, LocalDate dob, String email, Integer age) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}