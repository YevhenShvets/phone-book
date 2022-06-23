package com.ys.phonebook.models;

/*
 * @author yevhenshvets
 * @project phone-book
 * @class Company
 * @version 1.0.0
 * @since 23.06.2022, 14:08
 * Software Engineering Department
 *
 * Copyright (c) 1993-1996 Sun Microsystems, Inc. All Rights Reserved.
 */

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Entity
@Table(name="companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max=100)
    private String name;

    @Null
    @Size(max=200)
    private String information;

    @NotBlank
    @Column(name="is_special")
    private boolean isSpecial;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "abonent_id", referencedColumnName = "id")
    private Abonent abonent;

    public Company() {
    }

    public Company(String name, String information, boolean isSpecial, Abonent abonent) {
        this.name = name;
        this.information = information;
        this.isSpecial = isSpecial;
        this.abonent = abonent;
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

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }

    public Abonent getAbonent() {
        return abonent;
    }

    public void setAbonent(Abonent abonent) {
        this.abonent = abonent;
    }
}
