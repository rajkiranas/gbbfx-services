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
 * Friends generated by hbm2java
 */
@Entity
@Table(name="friends", schema="test"
)
public class Friends  implements java.io.Serializable {


     private FriendsId id;
     private Pi pi;
     private String qual;
     private String profession;
     private String income;
     private String gender;

    public Friends() {
    }

	
    public Friends(FriendsId id, Pi pi) {
        this.id = id;
        this.pi = pi;
    }
    public Friends(FriendsId id, Pi pi, String qual, String profession, String income, String gender) {
       this.id = id;
       this.pi = pi;
       this.qual = qual;
       this.profession = profession;
       this.income = income;
       this.gender = gender;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="email", column=@Column(name="email", nullable=false) ), 
        @AttributeOverride(name="FName", column=@Column(name="f_name", nullable=false) ) } )
    public FriendsId getId() {
        return this.id;
    }
    
    public void setId(FriendsId id) {
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

    
    @Column(name="qual")
    public String getQual() {
        return this.qual;
    }
    
    public void setQual(String qual) {
        this.qual = qual;
    }

    
    @Column(name="profession")
    public String getProfession() {
        return this.profession;
    }
    
    public void setProfession(String profession) {
        this.profession = profession;
    }

    
    @Column(name="income")
    public String getIncome() {
        return this.income;
    }
    
    public void setIncome(String income) {
        this.income = income;
    }

    
    @Column(name="gender")
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }




}

