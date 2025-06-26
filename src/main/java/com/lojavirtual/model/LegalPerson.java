/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lojavirtual.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

/**
 *
 * @author sarai
 */
@Entity
@Table(name = "legal_person")
@PrimaryKeyJoinColumn(name = "id")
public class LegalPerson extends Person {
    
    private static final long serialVersionUID = 1L;
    
    @Column(nullable = false)
    private String cnpj;
    
    private String stadualInsc;
    private String municipalInsc;
    private String fantasyName;
    private String socialReason;
    private String category;
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getStadualInsc() {
        return stadualInsc;
    }

    public void setStadualInsc(String stadualInsc) {
        this.stadualInsc = stadualInsc;
    }

    public String getMunicipalInsc() {
        return municipalInsc;
    }

    public void setMunicipalInsc(String municipalInsc) {
        this.municipalInsc = municipalInsc;
    }

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getSocialReason() {
        return socialReason;
    }

    public void setSocialReason(String socialReason) {
        this.socialReason = socialReason;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
    
    
}
