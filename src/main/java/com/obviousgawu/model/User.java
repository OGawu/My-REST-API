package com.obviousgawu.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_info")
public class User {
    @Id
    @SequenceGenerator(name = "user_id_sequence",
    sequenceName = "user_id_sequence",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "user_id_sequence")
    private int id;

    private String name;
    private String address;
    private String number;


    public User() {
    }

    public User(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public User(int id, String name, String address, String number) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
