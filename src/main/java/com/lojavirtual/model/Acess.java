/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lojavirtual.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.util.Objects;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author sarai
 */
@Entity
@Table(name = "acess")
@SequenceGenerator(name = "seq_acess", sequenceName = "seq_acess", allocationSize = 1, initialValue = 1)
public class Acess implements GrantedAuthority {

    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_acess")
    private Long id;

    @Column(nullable = false)
    private String description; /* Acess role ex: ROLE_ADMIN or ROLE_SECRETARY */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameDesc() {
        return description;
    }

    public void setNameDesc(String description) {
        this.description = description;
    }

    @Override
    public String getAuthority() {
        return this.description;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Acess other = (Acess) obj;
        return Objects.equals(this.id, other.id);
    }
    
    

}
