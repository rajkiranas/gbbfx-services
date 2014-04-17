/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.srti.gbb.bean;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author rajkiran
 */
public class UserInfo  implements Serializable
{
     private PersonalInformationBean pi;
     private AddressBean address;
     private PhysicalParameters physicalParams;
     private MealTypeBean meal;
     private ExerciseBean exercise;
     private LifestyleBean life;
     private GynecBean gynecBean;     
     private List<AddictionBean> addictionsList;
     private List<EducationBean> educationList;
     private AveragePerformanceBean avgPerformanceBean;
     private List<FamilyEducation> familyEducationList;
     private List<Friends> friendsList;
     private PrayersBean prayers;
     private SocialServiceBean socialService;
     private TravelingBean traveling;
     private List<HobbyBean> hobbyList;
     private List<EntertainmentBean> entertainmentList;
     private List<VehicleBean> vehicleList;
     private List<PropertyBean> propertyList;
     private List<PrakrutiQuestionAnsBean> prakrutiQuestionAnsList;
     private List<IllnessBean> selfIllnessList;
     private List<IllnessBean> parentsIllnessList;
     private List<IllnessBean> grandParentsIllnessList;
     private List<IllnessBean> siblingsIllnessList;
     private List<IdolBean> idolList;
     private ColourBean colour;
     private TasteBean taste;
     private List<AllergyBean> allergyList;
     private boolean dataSubmittedSuccessfully = false;
     private String healthReportPath;
     private FamilyEducation spouse;
     private List<FamilyEducation> childrenList;
     private List<String> incidenceList;
     private List<String> personalityList;
     
     
     
     
    /**
     * @return the pi
     */
    public PersonalInformationBean getPi() {
        return pi;
    }

    /**
     * @param pi the pi to set
     */
    public void setPi(PersonalInformationBean pi) {
        this.pi = pi;
    }

    public PhysicalParameters getPhysicalParams() {
        return physicalParams;
    }

    public void setPhysicalParams(PhysicalParameters physicalParams) {
        this.physicalParams = physicalParams;
    }

    public MealTypeBean getMeal() {
        return meal;
    }

    public void setMeal(MealTypeBean meal) {
        this.meal = meal;
    }

    public ExerciseBean getExercise() {
        return exercise;
    }

    public void setExercise(ExerciseBean exercise) {
        this.exercise = exercise;
    }

    public LifestyleBean getLife() {
        return life;
    }

    public void setLife(LifestyleBean life) {
        this.life = life;
    }

    public GynecBean getGynecBean() {
        return gynecBean;
    }

    public void setGynecBean(GynecBean gynecBean) {
        this.gynecBean = gynecBean;
    }

    public List<AddictionBean> getAddictionsList() {
        return addictionsList;
    }

    public void setAddictionsList(List<AddictionBean> addictionsList) {
        this.addictionsList = addictionsList;
    }

    /**
     * @return the educationList
     */
    public List<EducationBean> getEducationList() {
        return educationList;
    }

    /**
     * @param educationList the educationList to set
     */
    public void setEducationList(List<EducationBean> educationList) {
        this.educationList = educationList;
    }

    /**
     * @return the avgPerformanceBean
     */
    public AveragePerformanceBean getAvgPerformanceBean() {
        return avgPerformanceBean;
    }

    /**
     * @param avgPerformanceBean the avgPerformanceBean to set
     */
    public void setAvgPerformanceBean(AveragePerformanceBean avgPerformanceBean) {
        this.avgPerformanceBean = avgPerformanceBean;
    }

    /**
     * @return the familyEducationList
     */
    public List<FamilyEducation> getFamilyEducationList() {
        return familyEducationList;
    }

    /**
     * @param familyEducationList the familyEducationList to set
     */
    public void setFamilyEducationList(List<FamilyEducation> familyEducationList) {
        this.familyEducationList = familyEducationList;
    }

    /**
     * @return the friendsList
     */
    public List<Friends> getFriendsList() {
        return friendsList;
    }

    /**
     * @param friendsList the friendsList to set
     */
    public void setFriendsList(List<Friends> friendsList) {
        this.friendsList = friendsList;
    }

    /**
     * @return the prayers
     */
    public PrayersBean getPrayers() {
        return prayers;
    }

    /**
     * @param prayers the prayers to set
     */
    public void setPrayers(PrayersBean prayers) {
        this.prayers = prayers;
    }

    /**
     * @return the socialService
     */
    public SocialServiceBean getSocialService() {
        return socialService;
    }

    /**
     * @param socialService the socialService to set
     */
    public void setSocialService(SocialServiceBean socialService) {
        this.socialService = socialService;
    }

    /**
     * @return the traveling
     */
    public TravelingBean getTraveling() {
        return traveling;
    }

    /**
     * @param traveling the traveling to set
     */
    public void setTraveling(TravelingBean traveling) {
        this.traveling = traveling;
    }

    /**
     * @return the hobbyList
     */
    public List<HobbyBean> getHobbyList() {
        return hobbyList;
    }

    /**
     * @param hobbyList the hobbyList to set
     */
    public void setHobbyList(List<HobbyBean> hobbyList) {
        this.hobbyList = hobbyList;
    }

    /**
     * @return the entertainmentList
     */
    public List<EntertainmentBean> getEntertainmentList() {
        return entertainmentList;
    }

    /**
     * @param entertainmentList the entertainmentList to set
     */
    public void setEntertainmentList(List<EntertainmentBean> entertainmentList) {
        this.entertainmentList = entertainmentList;
    }

    /**
     * @return the address
     */
    public AddressBean getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(AddressBean address) {
        this.address = address;
    }

    /**
     * @return the vehicleList
     */
    public List<VehicleBean> getVehicleList() {
        return vehicleList;
    }

    /**
     * @param vehicleList the vehicleList to set
     */
    public void setVehicleList(List<VehicleBean> vehicleList) {
        this.vehicleList = vehicleList;
    }

    /**
     * @return the propertyList
     */
    public List<PropertyBean> getPropertyList() {
        return propertyList;
    }

    /**
     * @param propertyList the propertyList to set
     */
    public void setPropertyList(List<PropertyBean> propertyList) {
        this.propertyList = propertyList;
    }

    /**
     * @return the prakrutiQuestionAnsList
     */
    public List<PrakrutiQuestionAnsBean> getPrakrutiQuestionAnsList() {
        return prakrutiQuestionAnsList;
    }

    /**
     * @param prakrutiQuestionAnsList the prakrutiQuestionAnsList to set
     */
    public void setPrakrutiQuestionAnsList(List<PrakrutiQuestionAnsBean> prakrutiQuestionAnsList) {
        this.prakrutiQuestionAnsList = prakrutiQuestionAnsList;
    }

    /**
     * @return the selfIllnessList
     */
    public List<IllnessBean> getSelfIllnessList() {
        return selfIllnessList;
    }

    /**
     * @param selfIllnessList the selfIllnessList to set
     */
    public void setSelfIllnessList(List<IllnessBean> selfIllnessList) {
        this.selfIllnessList = selfIllnessList;
    }

    /**
     * @return the parentsIllnessList
     */
    public List<IllnessBean> getParentsIllnessList() {
        return parentsIllnessList;
    }

    /**
     * @param parentsIllnessList the parentsIllnessList to set
     */
    public void setParentsIllnessList(List<IllnessBean> parentsIllnessList) {
        this.parentsIllnessList = parentsIllnessList;
    }

    /**
     * @return the grandParentsIllnessList
     */
    public List<IllnessBean> getGrandParentsIllnessList() {
        return grandParentsIllnessList;
    }

    /**
     * @param grandParentsIllnessList the grandParentsIllnessList to set
     */
    public void setGrandParentsIllnessList(List<IllnessBean> grandParentsIllnessList) {
        this.grandParentsIllnessList = grandParentsIllnessList;
    }

    /**
     * @return the siblingsIllnessList
     */
    public List<IllnessBean> getSiblingsIllnessList() {
        return siblingsIllnessList;
    }

    /**
     * @param siblingsIllnessList the siblingsIllnessList to set
     */
    public void setSiblingsIllnessList(List<IllnessBean> siblingsIllnessList) {
        this.siblingsIllnessList = siblingsIllnessList;
    }

    /**
     * @return the idolList
     */
    public List<IdolBean> getIdolList() {
        return idolList;
    }

    /**
     * @param idolList the idolList to set
     */
    public void setIdolList(List<IdolBean> idolList) {
        this.idolList = idolList;
    }

    /**
     * @return the colour
     */
    public ColourBean getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(ColourBean colour) {
        this.colour = colour;
    }

    /**
     * @return the taste
     */
    public TasteBean getTaste() {
        return taste;
    }

    /**
     * @param taste the taste to set
     */
    public void setTaste(TasteBean taste) {
        this.taste = taste;
    }

    /**
     * @return the allergyList
     */
    public List<AllergyBean> getAllergyList() {
        return allergyList;
    }

    /**
     * @param allergyList the allergyList to set
     */
    public void setAllergyList(List<AllergyBean> allergyList) {
        this.allergyList = allergyList;
    }

    /**
     * @return the dataSubmittedSuccessfully
     */
    public boolean isDataSubmittedSuccessfully() {
        return dataSubmittedSuccessfully;
    }

    /**
     * @param dataSubmittedSuccessfully the dataSubmittedSuccessfully to set
     */
    public void setDataSubmittedSuccessfully(boolean dataSubmittedSuccessfully) {
        this.dataSubmittedSuccessfully = dataSubmittedSuccessfully;
    }

    /**
     * @return the healthReportPath
     */
    public String getHealthReportPath() {
        return healthReportPath;
    }

    /**
     * @param healthReportPath the healthReportPath to set
     */
    public void setHealthReportPath(String healthReportPath) {
        this.healthReportPath = healthReportPath;
    }

    /**
     * @return the spouse
     */
    public FamilyEducation getSpouse() {
        return spouse;
    }

    /**
     * @param spouse the spouse to set
     */
    public void setSpouse(FamilyEducation spouse) {
        this.spouse = spouse;
    }

    /**
     * @return the childrenList
     */
    public List<FamilyEducation> getChildrenList() {
        return childrenList;
    }

    /**
     * @param childrenList the childrenList to set
     */
    public void setChildrenList(List<FamilyEducation> childrenList) {
        this.childrenList = childrenList;
    }

    /**
     * @return the incidenceList
     */
    public List<String> getIncidenceList() {
        return incidenceList;
    }

    /**
     * @param incidenceList the incidenceList to set
     */
    public void setIncidenceList(List<String> incidenceList) {
        this.incidenceList = incidenceList;
    }

    /**
     * @return the personalityList
     */
    public List<String> getPersonalityList() {
        return personalityList;
    }

    /**
     * @param personalityList the personalityList to set
     */
    public void setPersonalityList(List<String> personalityList) {
        this.personalityList = personalityList;
    }

    
}
