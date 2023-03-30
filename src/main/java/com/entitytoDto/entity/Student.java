package com.entitytoDto.entity;

import jakarta.persistence.*;


import java.util.Date;

@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Temporal(TemporalType.DATE)
    private Date createdOn=new Date();
    private String address;

    public Student(long id, String name, Date createdOn, String address) {
        this.id = id;
        this.name = name;
        this.createdOn = createdOn;
        this.address = address;
    }

    public Student() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdOn=" + createdOn +
                ", address='" + address + '\'' +
                '}';
    }
}
