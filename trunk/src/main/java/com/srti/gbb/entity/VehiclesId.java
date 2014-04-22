package com.srti.gbb.entity;
// Generated Apr 15, 2014 4:24:33 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VehiclesId generated by hbm2java
 */
@Embeddable
public class VehiclesId  implements java.io.Serializable {


     private String email;
     private String vehicleType;

    public VehiclesId() {
    }

    public VehiclesId(String email, String vehicleType) {
       this.email = email;
       this.vehicleType = vehicleType;
    }
   


    @Column(name="email", nullable=false)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }


    @Column(name="vehicle_type", nullable=false)
    public String getVehicleType() {
        return this.vehicleType;
    }
    
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VehiclesId) ) return false;
		 VehiclesId castOther = ( VehiclesId ) other; 
         
		 return ( (this.getEmail()==castOther.getEmail()) || ( this.getEmail()!=null && castOther.getEmail()!=null && this.getEmail().equals(castOther.getEmail()) ) )
 && ( (this.getVehicleType()==castOther.getVehicleType()) || ( this.getVehicleType()!=null && castOther.getVehicleType()!=null && this.getVehicleType().equals(castOther.getVehicleType()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEmail() == null ? 0 : this.getEmail().hashCode() );
         result = 37 * result + ( getVehicleType() == null ? 0 : this.getVehicleType().hashCode() );
         return result;
   }   


}

