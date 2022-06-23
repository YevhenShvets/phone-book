package com.ys.phonebook.models;

/*
 * @author yevhenshvets
 * @project phone-book
 * @class Address
 * @version 1.0.0
 * @since 23.06.2022, 13:25
 * Software Engineering Department
 *
 * Copyright (c) 1993-1996 Sun Microsystems, Inc. All Rights Reserved.
 */

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
@Table(name="addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Null
    @Size(max=100)
    private String building;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "street_id")
    private Street street;

    @NotBlank
    @Size(max=50)
    private String country;

    @NotBlank
    @Size(max=50)
    private String city;

    @NotBlank
    @Positive
    @Column(name="zip_code")
    private int zipCode;

    public Address() {
    }

    public Address(String building, Street street, String country, String city, int zipCode) {
        this.building = building;
        this.street = street;
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Address(Street street, String country, String city, int zipCode) {
        this.street = street;
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
