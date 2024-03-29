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
 * Allergies generated by hbm2java
 */
@Entity
@Table(name="allergies", schema="test"
)
public class Allergies  implements java.io.Serializable {


     private AllergiesId id;
     private Pi pi;

    public Allergies() {
    }

    public Allergies(AllergiesId id, Pi pi) {
       this.id = id;
       this.pi = pi;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="email", column=@Column(name="email", nullable=false) ), 
        @AttributeOverride(name="allergyName", column=@Column(name="allergy_name", nullable=false) ) } )
    public AllergiesId getId() {
        return this.id;
    }
    
    public void setId(AllergiesId id) {
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




}


