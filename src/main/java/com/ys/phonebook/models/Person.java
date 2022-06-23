package com.ys.phonebook.models;

/*
 * @author yevhenshvets
 * @project phone-book
 * @class Person
 * @version 1.0.0
 * @since 23.06.2022, 14:09
 * Software Engineering Department
 *
 * Copyright (c) 1993-1996 Sun Microsystems, Inc. All Rights Reserved.
 */

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="persones")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max=70)
    private String surname;

    @NotBlank
    @Size(max=70)
    private String name;

    @NotBlank
    @Size(max=70)
    private String middlename;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "abonent_id", referencedColumnName = "id")
    private Abonent abonent;

    public Person() {
    }

    public Person(String surname, String name, String middlename, Abonent abonent) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.abonent = abonent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public Abonent getAbonent() {
        return abonent;
    }

    public void setAbonent(Abonent abonent) {
        this.abonent = abonent;
    }
}
