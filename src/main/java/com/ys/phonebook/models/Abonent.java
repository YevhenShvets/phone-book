package com.ys.phonebook.models;

/*
 * @author yevhenshvets
 * @project phone-book
 * @class Abonent
 * @version 1.0.0
 * @since 23.06.2022, 14:08
 * Software Engineering Department
 *
 * Copyright (c) 1993-1996 Sun Microsystems, Inc. All Rights Reserved.
 */

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="abonents")
public class Abonent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id", referencedColumnName = "id")
    private Address address;

    @OneToMany(mappedBy="abonent")
    private Set<Phone> phones;

    public Abonent() {
    }

    public Abonent(Address address, Set<Phone> phones) {
        this.address = address;
        this.phones = phones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }
}
