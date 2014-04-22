package com.srti.gbb.entity;
// Generated Apr 15, 2014 4:24:33 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * LifeStyle generated by hbm2java
 */
@Entity
@Table(name="life_style", schema="test"
)
public class LifeStyle  implements java.io.Serializable {


     private String email;
     private Pi pi;
     private Double sleepTime;
     private Double wakeupTime;
     private Short afternoonSleep;
     private Short lateNights;

    public LifeStyle() {
    }

	
    public LifeStyle(Pi pi) {
        this.pi = pi;
    }
    public LifeStyle(Pi pi, Double sleepTime, Double wakeupTime, Short afternoonSleep, Short lateNights) {
       this.pi = pi;
       this.sleepTime = sleepTime;
       this.wakeupTime = wakeupTime;
       this.afternoonSleep = afternoonSleep;
       this.lateNights = lateNights;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="pi"))@Id @GeneratedValue(generator="generator")

    
    @Column(name="email", unique=true, nullable=false)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn
    public Pi getPi() {
        return this.pi;
    }
    
    public void setPi(Pi pi) {
        this.pi = pi;
    }

    
    @Column(name="sleep_time", precision=17, scale=17)
    public Double getSleepTime() {
        return this.sleepTime;
    }
    
    public void setSleepTime(Double sleepTime) {
        this.sleepTime = sleepTime;
    }

    
    @Column(name="wakeup_time", precision=17, scale=17)
    public Double getWakeupTime() {
        return this.wakeupTime;
    }
    
    public void setWakeupTime(Double wakeupTime) {
        this.wakeupTime = wakeupTime;
    }

    
    @Column(name="afternoon_sleep")
    public Short getAfternoonSleep() {
        return this.afternoonSleep;
    }
    
    public void setAfternoonSleep(Short afternoonSleep) {
        this.afternoonSleep = afternoonSleep;
    }

    
    @Column(name="late_nights")
    public Short getLateNights() {
        return this.lateNights;
    }
    
    public void setLateNights(Short lateNights) {
        this.lateNights = lateNights;
    }




}


