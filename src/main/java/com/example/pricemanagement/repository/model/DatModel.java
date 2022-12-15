package com.example.pricemanagement.repository.model;

import javax.persistence.*;

@Entity
@Table(name = "dat")
public class DatModel {
    @Id
    @SequenceGenerator(
            name = "dat_sequence",
            sequenceName = "dat_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "dat_sequence"
    )

    private Long id;
    private String name;
    private String looks;
    private int age;

    public DatModel() {
    }

    public DatModel(String name, String looks, int age) {
        this.name = name;
        this.looks = looks;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLooks() {
        return looks;
    }

    public void setLooks(String looks) {
        this.looks = looks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
