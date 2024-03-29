package com.srti.gbb.entity;
// Generated Apr 15, 2014 4:24:33 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ColoursId generated by hbm2java
 */
@Embeddable
public class ColoursId  implements java.io.Serializable {


     private String email;
     private String colourName;

    public ColoursId() {
    }

    public ColoursId(String email, String colourName) {
       this.email = email;
       this.colourName = colourName;
    }
   


    @Column(name="email", nullable=false)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }


    @Column(name="colour_name", nullable=false)
    public String getColourName() {
        return this.colourName;
    }
    
    public void setColourName(String colourName) {
        this.colourName = colourName;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ColoursId) ) return false;
		 ColoursId castOther = ( ColoursId ) other; 
         
		 return ( (this.getEmail()==castOther.getEmail()) || ( this.getEmail()!=null && castOther.getEmail()!=null && this.getEmail().equals(castOther.getEmail()) ) )
 && ( (this.getColourName()==castOther.getColourName()) || ( this.getColourName()!=null && castOther.getColourName()!=null && this.getColourName().equals(castOther.getColourName()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEmail() == null ? 0 : this.getEmail().hashCode() );
         result = 37 * result + ( getColourName() == null ? 0 : this.getColourName().hashCode() );
         return result;
   }   


}


