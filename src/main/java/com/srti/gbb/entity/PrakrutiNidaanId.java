package com.srti.gbb.entity;
// Generated Apr 15, 2014 4:24:33 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PrakrutiNidaanId generated by hbm2java
 */
@Embeddable
public class PrakrutiNidaanId  implements java.io.Serializable {


     private String email;
     private String que;

    public PrakrutiNidaanId() {
    }

    public PrakrutiNidaanId(String email, String que) {
       this.email = email;
       this.que = que;
    }
   


    @Column(name="email", nullable=false)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }


    @Column(name="que", nullable=false)
    public String getQue() {
        return this.que;
    }
    
    public void setQue(String que) {
        this.que = que;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PrakrutiNidaanId) ) return false;
		 PrakrutiNidaanId castOther = ( PrakrutiNidaanId ) other; 
         
		 return ( (this.getEmail()==castOther.getEmail()) || ( this.getEmail()!=null && castOther.getEmail()!=null && this.getEmail().equals(castOther.getEmail()) ) )
 && ( (this.getQue()==castOther.getQue()) || ( this.getQue()!=null && castOther.getQue()!=null && this.getQue().equals(castOther.getQue()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEmail() == null ? 0 : this.getEmail().hashCode() );
         result = 37 * result + ( getQue() == null ? 0 : this.getQue().hashCode() );
         return result;
   }   


}


