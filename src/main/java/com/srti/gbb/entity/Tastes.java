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
 * Tastes generated by hbm2java
 */
@Entity
@Table(name="tastes"
)
public class Tastes  implements java.io.Serializable {


     private TastesId id;
     private Pi pi;

    public Tastes() {
    }

    public Tastes(TastesId id, Pi pi) {
       this.id = id;
       this.pi = pi;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="email", column=@Column(name="email", nullable=false) ), 
        @AttributeOverride(name="tasteName", column=@Column(name="taste_name", nullable=false) ) } )
    public TastesId getId() {
        return this.id;
    }
    
    public void setId(TastesId id) {
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

