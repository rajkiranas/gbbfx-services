/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srti.gbb.bean;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author rajkiran
 */
public class HobbyBean  implements Serializable
{
    private String hobby;
    private float hobbyHoursPerWeek;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public float getHobbyHoursPerWeek() {
        return hobbyHoursPerWeek;
    }

    public void setHobbyHoursPerWeek(float hobbyHoursPerWeek) {
        this.hobbyHoursPerWeek = hobbyHoursPerWeek;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.hobby);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HobbyBean other = (HobbyBean) obj;
        if (!Objects.equals(this.hobby, other.hobby)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HobbyBean{" + "hobby=" + hobby + ", hobbyHoursPerWeek=" + hobbyHoursPerWeek + '}';
    }
    
    
}
