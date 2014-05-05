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
 * PrakrutiNidaan generated by hbm2java
 */
@Entity
@Table(name="prakruti_nidaan", schema="test"
)
public class PrakrutiNidaan  implements java.io.Serializable {


     private PrakrutiNidaanId id;
     private Pi pi;
     private String oneA;
     private Boolean oneAChk;
     private String oneB;
     private Boolean oneBChk;
     private String oneC;
     private Boolean oneCChk;
     private String twoA;
     private Boolean twoAChk;
     private String twoB;
     private Boolean twoBChk;
     private String twoC;
     private Boolean twoCChk;
     private String threeA;
     private Boolean threeAChk;
     private String threeB;
     private Boolean threeBChk;
     private String threeC;
     private Boolean threeCChk;
     private Boolean opt1checked;
     private Boolean opt2checked;
     private Boolean opt3checked;

    public PrakrutiNidaan() {
    }

	
    public PrakrutiNidaan(PrakrutiNidaanId id, Pi pi) {
        this.id = id;
        this.pi = pi;
    }
    public PrakrutiNidaan(PrakrutiNidaanId id, Pi pi, String oneA, Boolean oneAChk, String oneB, Boolean oneBChk, String oneC, Boolean oneCChk, String twoA, Boolean twoAChk, String twoB, Boolean twoBChk, String twoC, Boolean twoCChk, String threeA, Boolean threeAChk, String threeB, Boolean threeBChk, String threeC, Boolean threeCChk, Boolean opt1checked, Boolean opt2checked, Boolean opt3checked) {
       this.id = id;
       this.pi = pi;
       this.oneA = oneA;
       this.oneAChk = oneAChk;
       this.oneB = oneB;
       this.oneBChk = oneBChk;
       this.oneC = oneC;
       this.oneCChk = oneCChk;
       this.twoA = twoA;
       this.twoAChk = twoAChk;
       this.twoB = twoB;
       this.twoBChk = twoBChk;
       this.twoC = twoC;
       this.twoCChk = twoCChk;
       this.threeA = threeA;
       this.threeAChk = threeAChk;
       this.threeB = threeB;
       this.threeBChk = threeBChk;
       this.threeC = threeC;
       this.threeCChk = threeCChk;
       this.opt1checked = opt1checked;
       this.opt2checked = opt2checked;
       this.opt3checked = opt3checked;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="email", column=@Column(name="email", nullable=false) ), 
        @AttributeOverride(name="que", column=@Column(name="que", nullable=false) ) } )
    public PrakrutiNidaanId getId() {
        return this.id;
    }
    
    public void setId(PrakrutiNidaanId id) {
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

    
    @Column(name="one_a")
    public String getOneA() {
        return this.oneA;
    }
    
    public void setOneA(String oneA) {
        this.oneA = oneA;
    }

    
    @Column(name="one_a_chk")
    public Boolean getOneAChk() {
        return this.oneAChk;
    }
    
    public void setOneAChk(Boolean oneAChk) {
        this.oneAChk = oneAChk;
    }

    
    @Column(name="one_b")
    public String getOneB() {
        return this.oneB;
    }
    
    public void setOneB(String oneB) {
        this.oneB = oneB;
    }

    
    @Column(name="one_b_chk")
    public Boolean getOneBChk() {
        return this.oneBChk;
    }
    
    public void setOneBChk(Boolean oneBChk) {
        this.oneBChk = oneBChk;
    }

    
    @Column(name="one_c")
    public String getOneC() {
        return this.oneC;
    }
    
    public void setOneC(String oneC) {
        this.oneC = oneC;
    }

    
    @Column(name="one_c_chk")
    public Boolean getOneCChk() {
        return this.oneCChk;
    }
    
    public void setOneCChk(Boolean oneCChk) {
        this.oneCChk = oneCChk;
    }

    
    @Column(name="two_a")
    public String getTwoA() {
        return this.twoA;
    }
    
    public void setTwoA(String twoA) {
        this.twoA = twoA;
    }

    
    @Column(name="two_a_chk")
    public Boolean getTwoAChk() {
        return this.twoAChk;
    }
    
    public void setTwoAChk(Boolean twoAChk) {
        this.twoAChk = twoAChk;
    }

    
    @Column(name="two_b")
    public String getTwoB() {
        return this.twoB;
    }
    
    public void setTwoB(String twoB) {
        this.twoB = twoB;
    }

    
    @Column(name="two_b_chk")
    public Boolean getTwoBChk() {
        return this.twoBChk;
    }
    
    public void setTwoBChk(Boolean twoBChk) {
        this.twoBChk = twoBChk;
    }

    
    @Column(name="two_c")
    public String getTwoC() {
        return this.twoC;
    }
    
    public void setTwoC(String twoC) {
        this.twoC = twoC;
    }

    
    @Column(name="two_c_chk")
    public Boolean getTwoCChk() {
        return this.twoCChk;
    }
    
    public void setTwoCChk(Boolean twoCChk) {
        this.twoCChk = twoCChk;
    }

    
    @Column(name="three_a")
    public String getThreeA() {
        return this.threeA;
    }
    
    public void setThreeA(String threeA) {
        this.threeA = threeA;
    }

    
    @Column(name="three_a_chk")
    public Boolean getThreeAChk() {
        return this.threeAChk;
    }
    
    public void setThreeAChk(Boolean threeAChk) {
        this.threeAChk = threeAChk;
    }

    
    @Column(name="three_b")
    public String getThreeB() {
        return this.threeB;
    }
    
    public void setThreeB(String threeB) {
        this.threeB = threeB;
    }

    
    @Column(name="three_b_chk")
    public Boolean getThreeBChk() {
        return this.threeBChk;
    }
    
    public void setThreeBChk(Boolean threeBChk) {
        this.threeBChk = threeBChk;
    }

    
    @Column(name="three_c")
    public String getThreeC() {
        return this.threeC;
    }
    
    public void setThreeC(String threeC) {
        this.threeC = threeC;
    }

    
    @Column(name="three_c_chk")
    public Boolean getThreeCChk() {
        return this.threeCChk;
    }
    
    public void setThreeCChk(Boolean threeCChk) {
        this.threeCChk = threeCChk;
    }

    
    @Column(name="opt1checked")
    public Boolean getOpt1checked() {
        return this.opt1checked;
    }
    
    public void setOpt1checked(Boolean opt1checked) {
        this.opt1checked = opt1checked;
    }

    
    @Column(name="opt2checked")
    public Boolean getOpt2checked() {
        return this.opt2checked;
    }
    
    public void setOpt2checked(Boolean opt2checked) {
        this.opt2checked = opt2checked;
    }

    
    @Column(name="opt3checked")
    public Boolean getOpt3checked() {
        return this.opt3checked;
    }
    
    public void setOpt3checked(Boolean opt3checked) {
        this.opt3checked = opt3checked;
    }




}

