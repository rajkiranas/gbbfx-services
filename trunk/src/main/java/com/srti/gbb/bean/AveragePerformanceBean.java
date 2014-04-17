/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srti.gbb.bean;

import java.io.Serializable;

/**
 *
 * @author rajkirans
 */
public class AveragePerformanceBean  implements Serializable
{
    private float avgSchoolPercentage;
    private int noOfSchoolRepeats;
    private float avgCollegePercentage;
    private int noOfCollegeRepeats;
    private int noOfSubjectRepeatsInCollege;
    private float avgPGPercentage;
    private int noOfPGRepeats;
    private int noOfSubjectRepeatsInPG;
    
    
    public float getAvgSchoolPercentage() {
        return avgSchoolPercentage;
    }

    public void setAvgSchoolPercentage(float avgSchoolPercentage) {
        this.avgSchoolPercentage = avgSchoolPercentage;
    }

    public int getNoOfSchoolRepeats() {
        return noOfSchoolRepeats;
    }

    public void setNoOfSchoolRepeats(int noOfSchoolRepeats) {
        this.noOfSchoolRepeats = noOfSchoolRepeats;
    }

    public float getAvgCollegePercentage() {
        return avgCollegePercentage;
    }

    public void setAvgCollegePercentage(float avgCollegePercentage) {
        this.avgCollegePercentage = avgCollegePercentage;
    }

    public int getNoOfCollegeRepeats() {
        return noOfCollegeRepeats;
    }

    public void setNoOfCollegeRepeats(int noOfCollegeRepeats) {
        this.noOfCollegeRepeats = noOfCollegeRepeats;
    }

    public float getAvgPGPercentage() {
        return avgPGPercentage;
    }

    public void setAvgPGPercentage(float avgPGPercentage) {
        this.avgPGPercentage = avgPGPercentage;
    }

    public int getNoOfPGRepeats() {
        return noOfPGRepeats;
    }

    public void setNoOfPGRepeats(int noOfPGRepeats) {
        this.noOfPGRepeats = noOfPGRepeats;
    }

    public int getNoOfSubjectRepeatsInCollege() {
        return noOfSubjectRepeatsInCollege;
    }

    public void setNoOfSubjectRepeatsInCollege(int noOfSubjectRepeatsInCollege) {
        this.noOfSubjectRepeatsInCollege = noOfSubjectRepeatsInCollege;
    }

    public int getNoOfSubjectRepeatsInPG() {
        return noOfSubjectRepeatsInPG;
    }

    public void setNoOfSubjectRepeatsInPG(int noOfSubjectRepeatsInPG) {
        this.noOfSubjectRepeatsInPG = noOfSubjectRepeatsInPG;
    }

    @Override
    public String toString() {
        return "AveragePerformanceBean{" + "avgSchoolPercentage=" + avgSchoolPercentage + ", noOfSchoolRepeats=" + noOfSchoolRepeats + ", avgCollegePercentage=" + avgCollegePercentage + ", noOfCollegeRepeats=" + noOfCollegeRepeats + ", noOfSubjectRepeatsInCollege=" + noOfSubjectRepeatsInCollege + ", avgPGPercentage=" + avgPGPercentage + ", noOfPGRepeats=" + noOfPGRepeats + ", noOfSubjectRepeatsInPG=" + noOfSubjectRepeatsInPG + '}';
    }
    
    
    
}
