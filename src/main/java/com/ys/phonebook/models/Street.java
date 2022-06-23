package com.ys.phonebook.models;

/*
 * @author yevhenshvets
 * @project phone-book
 * @class Street
 * @version 1.0.0
 * @since 23.06.2022, 13:10
 * Software Engineering Department
 *
 * Copyright (c) 1993-1996 Sun Microsystems, Inc. All Rights Reserved.
 */

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(	name = "streets",
        uniqueConstraints = {@UniqueConstraint(columnNames = "name")})
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank
    @Size(max = 100)
    private String name;

    public Street() {
    }

    public Street(String name) {
        this.name = name;
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
}
