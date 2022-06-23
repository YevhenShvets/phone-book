package com.ys.phonebook.models;

/*
 * @author yevhenshvets
 * @project phone-book
 * @class Phone
 * @version 1.0.0
 * @since 23.06.2022, 13:50
 * Software Engineering Department
 *
 * Copyright (c) 1993-1996 Sun Microsystems, Inc. All Rights Reserved.
 */

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Entity
@Table(name="phones",  uniqueConstraints = {
        @UniqueConstraint(columnNames = "number"),
})
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max=50)
    private String number;

    @NotBlank
    @Size(max=5)
    private String type;

    @Null
    @Size(max=20)
    private String operator;


    @ManyToOne
    @JoinColumn(name = "abonent_id",  nullable=false)
    private Abonent abonent;

    public Phone() {
    }

    public Phone(String number, String type, String operator, Abonent abonent) {
        this.number = number;
        this.type = type;
        this.operator = operator;
        this.abonent = abonent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Abonent getAbonent() {
        return abonent;
    }

    public void setAbonent(Abonent abonent) {
        this.abonent = abonent;
    }
}
