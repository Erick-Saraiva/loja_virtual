/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lojavirtual.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author sarai
 */
@Entity
@Table(name = "product_brand")
@SequenceGenerator(name = "seq_product_brand", sequenceName = "seq_product_brand", allocationSize = 1, initialValue = 1)
public class ProductBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_product_brand")
    private Long id;

    private String nameDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameDesc() {
        return nameDesc;
    }

    public void setNameDesc(String nameDesc) {
        this.nameDesc = nameDesc;
    }

}
