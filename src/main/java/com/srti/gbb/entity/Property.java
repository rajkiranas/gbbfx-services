package com.srti.gbb.entity;
// Generated Apr 15, 2014 4:24:33 PM by Hibernate Tools 3.6.0


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Property generated by hbm2java
 */
@Entity
@Table(name="property", schema="test"
)
public class Property  implements java.io.Serializable {


     private PropertyId id;
     private Pi pi;
     private Boolean isowned;
     private Boolean isrented;
     private Double areaSqFt;
     private Double areaAcres;
     private Short propertyDependants;
     private Double outstandingLoan;

    public Property() {
    }

	
    public Property(PropertyId id, Pi pi) {
        this.id = id;
        this.pi = pi;
    }
    public Property(PropertyId id, Pi pi, Boolean isowned, Boolean isrented, Double areaSqFt, Double areaAcres, Short propertyDependants, Double outstandingLoan) {
       this.id = id;
       this.pi = pi;
       this.isowned = isowned;
       this.isrented = isrented;
       this.areaSqFt = areaSqFt;
       this.areaAcres = areaAcres;
       this.propertyDependants = propertyDependants;
       this.outstandingLoan = outstandingLoan;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="email", column=@Column(name="email", nullable=false) ), 
        @AttributeOverride(name="propertyType", column=@Column(name="property_type", nullable=false) ) } )
    public PropertyId getId() {
        return this.id;
    }
    
    public void setId(PropertyId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="email", nullable=false, insertable=false, updatable=false)
    public Pi getPi() {
        return this.pi;
    }
    
    public void setPi(Pi pi) {
        this.pi = pi;
    }

    
    @Column(name="isowned")
    public Boolean getIsowned() {
        return this.isowned;
    }
    
    public void setIsowned(Boolean isowned) {
        this.isowned = isowned;
    }

    
    @Column(name="isrented")
    public Boolean getIsrented() {
        return this.isrented;
    }
    
    public void setIsrented(Boolean isrented) {
        this.isrented = isrented;
    }

    
    @Column(name="area_sq_ft", precision=17, scale=17)
    public Double getAreaSqFt() {
        return this.areaSqFt;
    }
    
    public void setAreaSqFt(Double areaSqFt) {
        this.areaSqFt = areaSqFt;
    }

    
    @Column(name="area_acres", precision=17, scale=17)
    public Double getAreaAcres() {
        return this.areaAcres;
    }
    
    public void setAreaAcres(Double areaAcres) {
        this.areaAcres = areaAcres;
    }

    
    @Column(name="property_dependants")
    public Short getPropertyDependants() {
        return this.propertyDependants;
    }
    
    public void setPropertyDependants(Short propertyDependants) {
        this.propertyDependants = propertyDependants;
    }

    
    @Column(name="outstanding_loan", precision=17, scale=17)
    public Double getOutstandingLoan() {
        return this.outstandingLoan;
    }
    
    public void setOutstandingLoan(Double outstandingLoan) {
        this.outstandingLoan = outstandingLoan;
    }




}

