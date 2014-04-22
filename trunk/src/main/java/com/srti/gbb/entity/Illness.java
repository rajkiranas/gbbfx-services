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
 * Illness generated by hbm2java
 */
@Entity
@Table(name="illness", schema="test"
)
public class Illness  implements java.io.Serializable {


     private IllnessId id;
     private Pi pi;
     private Boolean ishospitalized;

    public Illness() {
    }

	
    public Illness(IllnessId id, Pi pi) {
        this.id = id;
        this.pi = pi;
    }
    public Illness(IllnessId id, Pi pi, Boolean ishospitalized) {
       this.id = id;
       this.pi = pi;
       this.ishospitalized = ishospitalized;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="email", column=@Column(name="email", nullable=false) ), 
        @AttributeOverride(name="illnessMember", column=@Column(name="illness_member", nullable=false) ), 
        @AttributeOverride(name="illness", column=@Column(name="illness", nullable=false) ) } )
    public IllnessId getId() {
        return this.id;
    }
    
    public void setId(IllnessId id) {
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

    
    @Column(name="ishospitalized")
    public Boolean getIshospitalized() {
        return this.ishospitalized;
    }
    
    public void setIshospitalized(Boolean ishospitalized) {
        this.ishospitalized = ishospitalized;
    }




}


