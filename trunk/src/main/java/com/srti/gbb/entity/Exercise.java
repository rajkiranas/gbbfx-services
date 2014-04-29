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
 * Exercise generated by hbm2java
 */
@Entity
@Table(name="exercise", schema="test"
)
public class Exercise  implements java.io.Serializable {


     private String email;
     private Pi pi;
     private Short scheduleDaysPerWeek;
     private String exerciseType;
     private Short hoursPerDay;

    public Exercise() {
    }

	
    public Exercise(Pi pi) {
        this.pi = pi;
    }
    public Exercise(Pi pi, Short scheduleDaysPerWeek, String exerciseType, Short hoursPerDay) {
       this.pi = pi;
       this.scheduleDaysPerWeek = scheduleDaysPerWeek;
       this.exerciseType = exerciseType;
       this.hoursPerDay = hoursPerDay;
    }
   
     @GenericGenerator(name="generator", strategy="foreign", parameters=@Parameter(name="property", value="pi"))
     @Id 
     //@GeneratedValue(generator="generator")

    
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

    
    @Column(name="schedule_days_per_week")
    public Short getScheduleDaysPerWeek() {
        return this.scheduleDaysPerWeek;
    }
    
    public void setScheduleDaysPerWeek(Short scheduleDaysPerWeek) {
        this.scheduleDaysPerWeek = scheduleDaysPerWeek;
    }

    
    @Column(name="exercise_type")
    public String getExerciseType() {
        return this.exerciseType;
    }
    
    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    
    @Column(name="hours_per_day")
    public Short getHoursPerDay() {
        return this.hoursPerDay;
    }
    
    public void setHoursPerDay(Short hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }




}

