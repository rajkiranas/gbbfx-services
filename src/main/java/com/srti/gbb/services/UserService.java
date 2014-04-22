/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srti.gbb.services;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.srti.gbb.DAO.UserDao;
import com.srti.gbb.bean.AddictionBean;
import com.srti.gbb.bean.AddressBean;
import com.srti.gbb.bean.AllergyBean;
import com.srti.gbb.bean.AveragePerformanceBean;
import com.srti.gbb.bean.ColourBean;
import com.srti.gbb.bean.EducationBean;
import com.srti.gbb.bean.EntertainmentBean;
import com.srti.gbb.bean.ExerciseBean;
import com.srti.gbb.bean.FamilyEducation;
import com.srti.gbb.bean.Friends;
import com.srti.gbb.bean.GynecBean;
import com.srti.gbb.bean.HobbyBean;
import com.srti.gbb.bean.IdolBean;
import com.srti.gbb.bean.IllnessBean;
import com.srti.gbb.bean.LifestyleBean;
import com.srti.gbb.bean.MealTypeBean;
import com.srti.gbb.bean.PersonalInformationBean;
import com.srti.gbb.bean.PhysicalParameters;
import com.srti.gbb.bean.PrakrutiQuestionAnsBean;
import com.srti.gbb.bean.PrayersBean;
import com.srti.gbb.bean.PropertyBean;
import com.srti.gbb.bean.SocialServiceBean;
import com.srti.gbb.bean.TasteBean;
import com.srti.gbb.bean.TravelingBean;
import com.srti.gbb.bean.UserInfo;
import com.srti.gbb.bean.VehicleBean;
import com.srti.gbb.entity.AcademicPerformance;
import com.srti.gbb.entity.Addictions;
import com.srti.gbb.entity.AddictionsId;
import com.srti.gbb.entity.Address;
import com.srti.gbb.entity.Allergies;
import com.srti.gbb.entity.AllergiesId;
import com.srti.gbb.entity.Colours;
import com.srti.gbb.entity.ColoursId;
import com.srti.gbb.entity.DictList;
import com.srti.gbb.entity.Entertainment;
import com.srti.gbb.entity.EntertainmentId;
import com.srti.gbb.entity.Exercise;
import com.srti.gbb.entity.FamilyRelations;
import com.srti.gbb.entity.FamilyRelationsId;
import com.srti.gbb.entity.Hobbies;
import com.srti.gbb.entity.HobbiesId;
import com.srti.gbb.entity.Idols;
import com.srti.gbb.entity.IdolsId;
import com.srti.gbb.entity.Illness;
import com.srti.gbb.entity.IllnessId;
import com.srti.gbb.entity.Incidences;
import com.srti.gbb.entity.IncidencesId;
import com.srti.gbb.entity.InfluentialPersonalities;
import com.srti.gbb.entity.InfluentialPersonalitiesId;
import com.srti.gbb.entity.LifeStyle;
import com.srti.gbb.entity.MealType;
import com.srti.gbb.entity.Menses;
import com.srti.gbb.entity.PhysicalParams;
import com.srti.gbb.entity.Pi;
import com.srti.gbb.entity.PrakrutiNidaan;
import com.srti.gbb.entity.PrakrutiNidaanId;
import com.srti.gbb.entity.Prayers;
import com.srti.gbb.entity.Property;
import com.srti.gbb.entity.PropertyId;
import com.srti.gbb.entity.Schools;
import com.srti.gbb.entity.SchoolsId;
import com.srti.gbb.entity.SocialService;
import com.srti.gbb.entity.Tastes;
import com.srti.gbb.entity.TastesId;
import com.srti.gbb.entity.Travelling;
import com.srti.gbb.entity.Vehicles;
import com.srti.gbb.entity.VehiclesId;
import com.srti.gbb.global.GlobalConstants;
import java.lang.reflect.Type;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author rajkirans
 */
@Component
public class UserService 
{
    @Autowired
    UserDao userDao;
    
//       public List<DictWordDetailsBean> getDictWordList(JSONObject inputRequest) throws JSONException
//       {
//           List<DictWordDetailsBean> list = userDao.getDictWordList(inputRequest);
//           
//           return list;
//       }
//       
//       public List<DictWordDetailsBean> searchWordList(JSONObject inputRequest) throws JSONException
//       {
//           List<DictWordDetailsBean> list = userDao.searchWordList(inputRequest);
//           
//           return list;
//       }
       
    
    Pi p = null;
    public void saveUserDetails(JSONObject inputRequest) throws Exception 
    {
        Type objType = new TypeToken<UserInfo>() {}.getType();
        String innerJson = (String) inputRequest.get(GlobalConstants.userInfoObject);
        UserInfo inputUser = new Gson().fromJson(innerJson, objType);
        System.out.println("####********####UserInfo inputUser="+inputUser);
        
        p=new Pi();
        
        preparePersonalInfo(inputUser,p);
        prepareIncidences(inputUser,p);
        prepareAddress(inputUser,p);
        prepareIllness(inputUser,p);
        prepareMenses(inputUser,p);
        preparePhysicalParams(inputUser,p);
        prepareTastes(inputUser,p);
        prepareTravelling(inputUser,p);
        prepareMealType(inputUser,p);
        prepareSocialService(inputUser,p);
        prepareAddictions(inputUser,p);
        prepareExercises(inputUser,p);
        prepareAcademicPerformance(inputUser,p);
        preparePrayers(inputUser,p);
        prepareColours(inputUser,p);
        prepareFriends(inputUser,p);
        prepareInfluentialPersonalities(inputUser,p);
        prepareIdols(inputUser,p);
        prepareSchools(inputUser,p);
        prepareAllergies(inputUser,p);
        prepareHobbies(inputUser,p);
        prepareEntertainments(inputUser,p);
        prepareProperties(inputUser,p);
        prepareVehicles(inputUser,p);
        preparePrakrutiNidaan(inputUser,p);
        prepareLifeStyle(inputUser,p);
        prepareFamilyRelations(inputUser,p);
        
//        DictList word = new DictList();
//        
//        word.setWord(inputRequest.getString("word"));
//        word.setMeaning(inputRequest.getString("meaning"));
//        word.setLabels(inputRequest.getString("labels"));
//        word.setAddDate(new Date());
//        word.setOwnerUsername(inputRequest.getString("owner_username"));
//        word.setOwnerName(inputRequest.getString("owner_name"));

        userDao.saveNewWordDetails(p);
    }

//    public List<DictWordDetailsBean> getWordOfTheDay(JSONObject inputRequest) {
//        List<DictWordDetailsBean> list = userDao.getWordOfTheDay(inputRequest);
//        
//        return list;
//    }

    private void preparePersonalInfo(UserInfo inputUser, Pi p) {
        
        PersonalInformationBean input = inputUser.getPi();
        p.setEmail(input.getEmail());
        p.setName(input.getName());
        p.setAge(new Integer(input.getAge()).shortValue());
        p.setGender(input.getGender());
        p.setReligion(input.getReligion());
        p.setMaritalStatus(input.getMaritalStatus());
        p.setNoOfChildren(new Integer(input.getNoOfChildren()).shortValue());
        p.setMobile(input.getMobile());
        p.setCompany(input.getOrganization());
        p.setIncome(input.getIncome());
        p.setQualification(input.getQualification());
        p.setProfession(input.getOccupation());
        
    }

    private void prepareIncidences(UserInfo inputUser, Pi p) {
        List<String> incList = inputUser.getIncidenceList();
        
        if(incList!=null && !incList.isEmpty())
        {
            Set<Incidences> incidencesesSet = new HashSet<Incidences>(0);

            Incidences pojo = null;
            IncidencesId id = null;

            for(String incidence :  incList)
            {
                id = new IncidencesId(p.getEmail(), incidence);
                pojo = new Incidences(id, p);
                incidencesesSet.add(pojo);
            }
            p.setIncidenceses(incidencesesSet);
        }
    }

    private void prepareAddress(UserInfo inputUser, Pi p) {
        AddressBean input = inputUser.getAddress();
        if(input!=null)
        {
            Address add = new Address();
            
            add.setEmail(p.getEmail());
            
            add.setArea(input.getArea());
            add.setCity(input.getCity());
            add.setCountry(input.getCountry());
            add.setHouse(input.getHouse());
            add.setPincode(input.getPincode());
            add.setState(input.getState());
            
            p.setAddress(add);
        }
    }

    private void prepareIllness(UserInfo inputUser, Pi p) {
        
        
        Set<Illness> incidencesesSet = new HashSet<Illness>(0);
        
        prepareSelfIllness(inputUser, p, incidencesesSet);
        
        prepareParentsIllness(inputUser, p, incidencesesSet);
        
        prepareGrandParentsIllness(inputUser, p, incidencesesSet);
        
        prepareSiblingsIllness(inputUser, p, incidencesesSet);
        
        if(!incidencesesSet.isEmpty())
        {
            p.setIllnesses(incidencesesSet);
        }
    }

    private void prepareSelfIllness(UserInfo inputUser, Pi p, Set<Illness> incidencesesSet) {
        List<IllnessBean> selfIllnessList = inputUser.getSelfIllnessList();
        if(selfIllnessList!=null && !selfIllnessList.isEmpty())
        {
            Illness pojo = null;
            IllnessId id = null;

            for(IllnessBean illnessBean :  selfIllnessList)
            {
                id = new IllnessId(p.getEmail(), GlobalConstants.SELF, illnessBean.getIllness());
                pojo = new Illness(id, p,illnessBean.isIsHospitalized());
                incidencesesSet.add(pojo);
            }
        }
    }

    private void prepareParentsIllness(UserInfo inputUser, Pi p, Set<Illness> incidencesesSet) {
        List<IllnessBean> parrentsIllnessList = inputUser.getParentsIllnessList();
        if(parrentsIllnessList!=null && !parrentsIllnessList.isEmpty())
        {
            Illness pojo = null;
            IllnessId id = null;

            for(IllnessBean illnessBean :  parrentsIllnessList)
            {
                id = new IllnessId(p.getEmail(), GlobalConstants.PARRENTS, illnessBean.getIllness());
                pojo = new Illness(id, p,illnessBean.isIsHospitalized());
                incidencesesSet.add(pojo);
            }
        }
    }

    private void prepareGrandParentsIllness(UserInfo inputUser, Pi p, Set<Illness> incidencesesSet) {
        List<IllnessBean> grandParrentsIllnessList = inputUser.getGrandParentsIllnessList();
        if(grandParrentsIllnessList!=null && !grandParrentsIllnessList.isEmpty())
        {
            Illness pojo = null;
            IllnessId id = null;

            for(IllnessBean illnessBean :  grandParrentsIllnessList)
            {
                id = new IllnessId(p.getEmail(), GlobalConstants.GRAND_PARRENTS, illnessBean.getIllness());
                pojo = new Illness(id, p,illnessBean.isIsHospitalized());
                incidencesesSet.add(pojo);
            }
        }
    }

    private void prepareSiblingsIllness(UserInfo inputUser, Pi p, Set<Illness> incidencesesSet) {
        List<IllnessBean> siblingsIllnessList = inputUser.getSiblingsIllnessList();
        if(siblingsIllnessList!=null && !siblingsIllnessList.isEmpty())
        {
            Illness pojo = null;
            IllnessId id = null;

            for(IllnessBean illnessBean :  siblingsIllnessList)
            {
                id = new IllnessId(p.getEmail(), GlobalConstants.SIBLINGS, illnessBean.getIllness());
                pojo = new Illness(id, p,illnessBean.isIsHospitalized());
                incidencesesSet.add(pojo);
            }
        }
    }

    private void prepareMenses(UserInfo inputUser, Pi p) {
        GynecBean input = inputUser.getGynecBean();
        if(input!=null)
        {
            Menses m = new Menses(p);
            m.setEmail(p.getEmail());
            m.setHeavy(input.isHeavyMenses());
            m.setIrregular(input.isIrregularMenses());
            m.setPainful(input.isPainfulMenses());
            m.setHysterectomyAge(new Integer(input.getMenopauseHysterectomyAtAge()).shortValue());
            p.setMenses(m);
        }
    }

    private void preparePhysicalParams(UserInfo inputUser, Pi p) {
        PhysicalParameters input = inputUser.getPhysicalParams();
        if(input!=null)
        {
            PhysicalParams phy = new PhysicalParams();
            
            phy.setEmail(p.getEmail());
            phy.setBp(new Double(input.getBp()));
            phy.setConstipationPerWeek(new Integer(input.getConstipationsPerWeek()).shortValue());
            phy.setHaemoglobin(new Double(input.getHaemoglobin()));
            //phy.setHeightCm(new Double(input.get));
            phy.setHeightFeets(new Double(input.getFeets()));
            phy.setHeightInches(new Double(input.getInches()));
            phy.setHip(new Double(input.getHip()));
            phy.setLooseMoPerWeek(new Integer(input.getLooseMotionsPerWeek()).shortValue());
            //phy.setPi(p);
            phy.setToeTouching(input.getToeTouching());
            phy.setToeTouchingCm(new Double(input.getToeTouchingCm()));
            phy.setWaist(new Double(input.getWaist()));
            phy.setWeight(new Double(input.getWeight()));
            
            p.setPhysicalParams(phy);
        }
    }

    private static final String astringentTaste="ASTRINGENT";
    private static final String bitterTaste="BITTER";
    private static final String pungentTaste="PUNGENT";
    private static final String saltyTaste="SALTY";
    private static final String sourTaste="SOUR";
    private static final String sweetTaste="SWEET";
    private void prepareTastes(UserInfo inputUser, Pi p) {
        TasteBean input = inputUser.getTaste();
        if(input!=null)
        {
            Set<Tastes> tastesSet = new HashSet<Tastes>(0);

            Tastes pojo = null;
            TastesId id = null;

            if(input.isAstringent())
            {
                id = new TastesId(p.getEmail(), astringentTaste);
                pojo = new Tastes(id, p);
                tastesSet.add(pojo);
            }
            
            if(input.isBitter())
            {
                id = new TastesId(p.getEmail(), bitterTaste);
                pojo = new Tastes(id, p);
                tastesSet.add(pojo);
            }
            
            if(input.isPungent())
            {
                id = new TastesId(p.getEmail(), pungentTaste);
                pojo = new Tastes(id, p);
                tastesSet.add(pojo);
            }
            
            if(input.isSalty())
            {
                id = new TastesId(p.getEmail(), saltyTaste);
                pojo = new Tastes(id, p);
                tastesSet.add(pojo);
            }
            
            if(input.isSour())
            {
                id = new TastesId(p.getEmail(), sourTaste);
                pojo = new Tastes(id, p);
                tastesSet.add(pojo);
            }
            
            if(input.isSweet())
            {
                id = new TastesId(p.getEmail(), sweetTaste);
                pojo = new Tastes(id, p);
                tastesSet.add(pojo);
            }
            
            if(!tastesSet.isEmpty())
            {
                p.setTasteses(tastesSet);
            }
        }
    }

    private void prepareTravelling(UserInfo inputUser, Pi p) {
        Travelling travelling;
        TravelingBean input = inputUser.getTraveling();
        if(input!=null)
        {
            travelling=new Travelling(p);
            travelling.setEmail(p.getEmail());
            
            travelling.setIndState(new Integer(input.getLocalIndividual()).shortValue());
            travelling.setIndNational(new Integer(input.getNationalIndividual()).shortValue());
            travelling.setIndInternational(new Integer(input.getInternationalIndividual()).shortValue());
            
            travelling.setFamilyState(new Integer(input.getLocalFamily()).shortValue());
            travelling.setFamilyNational(new Integer(input.getNationalFamily()).shortValue());
            travelling.setFamilyInternational(new Integer(input.getInternationalFamily()).shortValue());
            
            travelling.setFriendsState(new Integer(input.getLocalFriends()).shortValue());
            travelling.setFriendsNational(new Integer(input.getNationalFriends()).shortValue());
            travelling.setFriendsInternational(new Integer(input.getInternationalFriends()).shortValue());
            
            p.setTravelling(travelling);
        }
    }

    private void prepareMealType(UserInfo inputUser, Pi p) {
        MealTypeBean input = inputUser.getMeal();
        if(input!=null)
        {
            MealType meal = new MealType(p);
            meal.setEmail(p.getEmail());
            
            
            meal.setDiet(input.getDiet());
            meal.setEatingOutDaysPerWeek(new Integer(input.getEatingOutPerWeek()).shortValue());
            meal.setFoodType(input.getFoodType());
            meal.setFruitsDaysPerWeek(new Integer(input.getFruitsPerWeek()).shortValue());
            meal.setNonvegDaysPerWeek(new Integer(input.getNonVegPerWeek()).shortValue());
            
            p.setMealType(meal);
        }
    }

    private void prepareSocialService(UserInfo inputUser, Pi p) {
        
        SocialServiceBean input = inputUser.getSocialService();
        if(input!=null)
        {
            SocialService ss = new SocialService(p);
            ss.setEmail(p.getEmail());
            
            ss.setAreaOfWork(input.getAreaOfWork());
            
            ss.setCashAmount(new Double(input.getApproxAmtCash()).shortValue());
            ss.setCashTimesPerWeek(new Integer(input.getCashPerWeek()).shortValue());
            
            ss.setKindAmount(new Double(input.getApproxAmtKind()).shortValue());
            ss.setKindTimesPerWeek(new Integer(input.getKindPerWeek()).shortValue());
            
            ss.setSocialServiceHoursPerWeek(new Integer(input.getSocialServicePerWeek()).shortValue());
            
            p.setSocialService(ss);
        }
    }

    private void prepareAddictions(UserInfo inputUser, Pi p) {
        List<AddictionBean> addictionList = inputUser.getAddictionsList();
        
        if(addictionList!=null && !addictionList.isEmpty())
        {
            Set<Addictions> addictionSet = new HashSet<Addictions>(0);

            Addictions pojo = null;
            AddictionsId id = null;

            for(AddictionBean input : addictionList)
            {
                id = new AddictionsId(p.getEmail(), input.getAddiction());
                pojo = new Addictions(id, p);
                pojo.setFrequency(new Integer(input.getFrequencyPerWeek()).shortValue());
                
                addictionSet.add(pojo);
            }
            
            if(!addictionSet.isEmpty())
            {
                p.setAddictionses(addictionSet);
            }
        }
    }

    private void prepareExercises(UserInfo inputUser, Pi p) {
        ExerciseBean input = inputUser.getExercise();
        if(input!=null)
        {
            Exercise e = new Exercise(p);
            e.setEmail(p.getEmail());
            
            e.setExerciseType(input.getExerciseType());
            e.setHoursPerDay(new Integer(input.getDurationPerDay()).shortValue());
            e.setScheduleDaysPerWeek(new Integer(input.getExercisePerWeek()).shortValue());
            
            p.setExercise(e);
        }
    }

    private void prepareAcademicPerformance(UserInfo inputUser, Pi p) 
    {
        AveragePerformanceBean input = inputUser.getAvgPerformanceBean();
        if(input!=null)
        {
            AcademicPerformance ap = new AcademicPerformance(p);
            ap.setEmail(p.getEmail());
            ap.setAvgCollegePer(new Double(input.getAvgCollegePercentage()));
            ap.setAvgPgPer(new Double(input.getAvgPGPercentage()));
            ap.setAvgSchoolPer(new Double(input.getAvgSchoolPercentage()));
            
            ap.setCollegeSubRepeats(new Integer(input.getNoOfSubjectRepeatsInCollege()).shortValue());
            ap.setCollegeYearRepeats(new Integer(input.getNoOfCollegeRepeats()).shortValue());
            
            ap.setPgSubRepeats(new Integer(input.getNoOfSubjectRepeatsInPG()).shortValue());
            ap.setPgYearRepeats(new Integer(input.getNoOfPGRepeats()).shortValue());
            
            ap.setSchoolRepeats(new Integer(input.getNoOfSchoolRepeats()).shortValue());
            
            p.setAcademicPerformance(ap);
        }
        
    }

    private void preparePrayers(UserInfo inputUser, Pi p) {
        PrayersBean input = inputUser.getPrayers();
        if(input!=null)
        {
            Prayers pray = new Prayers(p);
            pray.setEmail(p.getEmail());
            pray.setIndividualDaysPerWeek(new Integer(input.getIndividualPrayerPerWeek()).shortValue());
            pray.setFamilyDaysPerWeek(new Integer(input.getFamilyPrayerPerWeek()).shortValue());
            pray.setCommunityDaysPerWeek(new Integer(input.getCommunityPrayerPerWeek()).shortValue());
            
            p.setPrayers(pray);
        }
    }

    private static final String BLUE="BLUE";
    private static final String GREEN="GREEN";
    private static final String ORANGE="ORANGE";
    private static final String RED="RED";
    private static final String VIOLET="VIOLET";
    private static final String WHITE="WHITE";
    private static final String YELLOW="YELLOW";

    private void prepareColours(UserInfo inputUser, Pi p) 
    {
        ColourBean input = inputUser.getColour();
        if(input!=null)
        {
            Set<Colours> colourSet = new HashSet<Colours>(0);

            Colours pojo = null;
            ColoursId id = null;

            if(input.isBlue())
            {
                id = new ColoursId(p.getEmail(), BLUE);
                pojo = new Colours(id, p);
                colourSet.add(pojo);
            }
            
            if(input.isGreen())
            {
                id = new ColoursId(p.getEmail(), GREEN);
                pojo = new Colours(id, p);
                colourSet.add(pojo);
            }
            
            if(input.isOrange())
            {
                id = new ColoursId(p.getEmail(), ORANGE);
                pojo = new Colours(id, p);
                colourSet.add(pojo);
            }
            
            if(input.isRed())
            {
                id = new ColoursId(p.getEmail(), RED);
                pojo = new Colours(id, p);
                colourSet.add(pojo);
            }
            
            if(input.isViolate())
            {
                id = new ColoursId(p.getEmail(), VIOLET);
                pojo = new Colours(id, p);
                colourSet.add(pojo);
            }
            
            if(input.isWhite())
            {
                id = new ColoursId(p.getEmail(), WHITE);
                pojo = new Colours(id, p);
                colourSet.add(pojo);
            }
            
            if(input.isYellow())
            {
                id = new ColoursId(p.getEmail(), YELLOW);
                pojo = new Colours(id, p);
                colourSet.add(pojo);
            }
            
            if(!colourSet.isEmpty())
            {
                p.setColourses(colourSet);
            }
        }
    }

    private void prepareFriends(UserInfo inputUser, Pi p) {
         List<Friends> friendsList = inputUser.getFriendsList();
        
        if(friendsList!=null && !friendsList.isEmpty())
        {
            Set<com.srti.gbb.entity.Friends> friendsSet = new HashSet<com.srti.gbb.entity.Friends>(0);

            com.srti.gbb.entity.Friends pojo = null;
            com.srti.gbb.entity.FriendsId id = null;

            for(Friends input : friendsList)
            {
                id = new com.srti.gbb.entity.FriendsId();
                id.setEmail(p.getEmail());
                id.setFName(input.getFriendName());
                
                pojo = new com.srti.gbb.entity.Friends(id, p);
                //pojo.setGender(input.get);
                pojo.setQual(input.getHighestQualification());
                pojo.setProfession(input.getProfession());
                pojo.setIncome(input.getIncome());
                
                friendsSet.add(pojo);
            }
            
            if(!friendsSet.isEmpty())
            {
                p.setFriendses(friendsSet);
            }
        }
    }

    private void prepareInfluentialPersonalities(UserInfo inputUser, Pi p) {
        List<String> influPersonaList = inputUser.getPersonalityList();
        if(influPersonaList!=null && !influPersonaList.isEmpty())
        {
            Set<InfluentialPersonalities> influPersonaSet = new HashSet<InfluentialPersonalities>(0);

            InfluentialPersonalities pojo = null;
            InfluentialPersonalitiesId id = null;

            for(String personality :  influPersonaList)
            {
                id = new InfluentialPersonalitiesId(p.getEmail(), personality);
                pojo = new InfluentialPersonalities(id, p);
                
                influPersonaSet.add(pojo);
            }
            if(!influPersonaSet.isEmpty())
            {
                p.setInfluentialPersonalitieses(influPersonaSet);
            }
        }
    }

    private void prepareIdols(UserInfo inputUser, Pi p) {
        List<IdolBean> idolsList = inputUser.getIdolList();
        if(idolsList!=null && !idolsList.isEmpty())
        {
            Set<Idols> idolsSet = new HashSet<Idols>(0);

            Idols pojo = null;
            IdolsId id = null;

            for(IdolBean idol :  idolsList)
            {
                id = new IdolsId(p.getEmail(), idol.getIdolName());
                pojo = new Idols(id, p);
                idolsSet.add(pojo);
            }
            if(!idolsSet.isEmpty())
            {
                p.setIdolses(idolsSet);
            }
        }
    }
    
    private void prepareSchools(UserInfo inputUser, Pi p) {
        List<EducationBean> schoolList = inputUser.getEducationList();
        
        if(schoolList!=null && !schoolList.isEmpty())
        {
            Set<Schools> schoolSet = new HashSet<Schools>(0);

            Schools pojo = null;
            SchoolsId id = null;

            for(EducationBean school :  schoolList)
            {
                id = new SchoolsId(p.getEmail(), school.getSchoolName(),school.getClassDegree());
                pojo = new Schools(id, p);
                pojo.setBoard(school.getBoardUniveristy());
                pojo.setFaculty(school.getFacultyStream());
                pojo.setMedium(school.getMedium());
                pojo.setSubjects(school.getSubjects());
                
                schoolSet.add(pojo);
            }
            if(!schoolSet.isEmpty())
            {
                p.setSchoolses(schoolSet);
            }
        }
    }

    private void prepareAllergies(UserInfo inputUser, Pi p) {
        List<AllergyBean> allergyList = inputUser.getAllergyList();
        
        if(allergyList!=null && !allergyList.isEmpty())
        {
            Set<Allergies> allergySet = new HashSet<Allergies>(0);

            Allergies pojo = null;
            AllergiesId id = null;

            for(AllergyBean allergy :  allergyList)
            {
                id = new AllergiesId(p.getEmail(), allergy.getAllergyName());
                pojo = new Allergies(id, p);
                
                allergySet.add(pojo);
            }
            
            if(!allergySet.isEmpty())
            {
                p.setAllergieses(allergySet);
            }
        }
    }

    private void prepareHobbies(UserInfo inputUser, Pi p) 
    {
        List<HobbyBean> hobbtList = inputUser.getHobbyList();
        
        if(hobbtList!=null && !hobbtList.isEmpty())
        {
            Set<Hobbies> hobbySet = new HashSet<Hobbies>(0);

            Hobbies pojo = null;
            HobbiesId id = null;

            for(HobbyBean h :  hobbtList)
            {
                id = new HobbiesId(p.getEmail(), h.getHobby());
                pojo = new Hobbies(id, p);
                pojo.setHoursPerWeek(new Double(h.getHobbyHoursPerWeek()).shortValue());
                
                hobbySet.add(pojo);
            }
            
            if(!hobbySet.isEmpty())
            {
                p.setHobbieses(hobbySet);
            }
        }
    }

    private void prepareEntertainments(UserInfo inputUser, Pi p) {
        List<EntertainmentBean> entertainmentList = inputUser.getEntertainmentList();
        
        if(entertainmentList!=null && !entertainmentList.isEmpty())
        {
            Set<Entertainment> entertainmentSet = new HashSet<Entertainment>(0);

            Entertainment pojo = null;
            EntertainmentId id = null;

            for(EntertainmentBean ent :  entertainmentList)
            {
                id = new EntertainmentId(p.getEmail(), ent.getEntertainement());
                pojo = new Entertainment(id, p);
                entertainmentSet.add(pojo);
            }
            
            if(!entertainmentSet.isEmpty())
            {
                p.setEntertainments(entertainmentSet);
            }
        }
    }

    private void prepareProperties(UserInfo inputUser, Pi p) {
        List<PropertyBean> propertyList = inputUser.getPropertyList();
        
        if(propertyList!=null && !propertyList.isEmpty())
        {
            Set<Property> propertySet = new HashSet<Property>(0);

            Property pojo = null;
            PropertyId id = null;

            for(PropertyBean property :  propertyList)
            {
                id = new PropertyId(p.getEmail(), property.getPropertyType());
                pojo = new Property(id, p);
                pojo.setIsowned(property.isIsOwned());
                pojo.setIsrented(property.isIsRented());
                pojo.setPropertyDependants(new Integer(property.getMembersInHouse()).shortValue());
                pojo.setOutstandingLoan(pojo.getOutstandingLoan());
                
                pojo.setAreaSqFt(new Double(property.getApproxAreaSqFt()));
                pojo.setAreaAcres(new Double(property.getApproxAreaSqFt()));
                
                propertySet.add(pojo);
            }
            
            if(!propertySet.isEmpty())
            {
                p.setProperties(propertySet);
            }
        }
    }

    private void prepareVehicles(UserInfo inputUser, Pi p) {
        List<VehicleBean> vehicleList = inputUser.getVehicleList();
        
        if(vehicleList!=null && !vehicleList.isEmpty())
        {
            Set<Vehicles> vehicleSet = new HashSet<Vehicles>(0);

            Vehicles pojo = null;
            VehiclesId id = null;

            for(VehicleBean v :  vehicleList)
            {
                id = new VehiclesId(p.getEmail(), v.getVehicleType());
                pojo = new Vehicles(id, p);
                pojo.setVehicleNumbers(new Integer(v.getNumberOfVehicles()).shortValue());
                
                vehicleSet.add(pojo);
            }
            
            if(!vehicleSet.isEmpty())
            {
                p.setVehicleses(vehicleSet);
            }
        }
    }

    private void preparePrakrutiNidaan(UserInfo inputUser, Pi p) {
        List<PrakrutiQuestionAnsBean> prakrutiList = inputUser.getPrakrutiQuestionAnsList();
        
        if(prakrutiList!=null && !prakrutiList.isEmpty())
        {
            Set<PrakrutiNidaan> prakrutiSet = new HashSet<PrakrutiNidaan>(0);

            PrakrutiNidaan pojo = null;
            PrakrutiNidaanId id = null;

            for(PrakrutiQuestionAnsBean prakruti :  prakrutiList)
            {
                id = new PrakrutiNidaanId(p.getEmail(), prakruti.getQuestion());
                pojo = new PrakrutiNidaan(id, p);
                
                if(prakruti.getAns1()!=null)
                {
                    pojo.setOneA(prakruti.getAns1());
                    pojo.setOneAChk(true);
                    pojo.setOpt1checked(prakruti.isOpt1Checked());
                }
                
                if(prakruti.getAns1b()!=null)
                {
                    pojo.setOneB(prakruti.getAns1b());
                    pojo.setOneBChk(true);
                    pojo.setOpt1checked(prakruti.isOpt1Checked());
                }
                
                if(prakruti.getAns1c()!=null)
                {
                    pojo.setOneC(prakruti.getAns1c());
                    pojo.setOneCChk(true);
                    pojo.setOpt1checked(prakruti.isOpt1Checked());
                }
                
                if(prakruti.getAns2()!=null)
                {
                    pojo.setTwoA(prakruti.getAns2());
                    pojo.setTwoAChk(true);
                    pojo.setOpt2checked(prakruti.isOpt2Checked());
                }
                
                if(prakruti.getAns2b()!=null)
                {
                    pojo.setTwoB(prakruti.getAns2b());
                    pojo.setTwoBChk(true);
                    pojo.setOpt2checked(prakruti.isOpt2Checked());
                }
                
                if(prakruti.getAns2c()!=null)
                {
                    pojo.setTwoC(prakruti.getAns2c());
                    pojo.setTwoCChk(true);
                    pojo.setOpt2checked(prakruti.isOpt2Checked());
                }
                
                if(prakruti.getAns3()!=null)
                {
                    pojo.setThreeA(prakruti.getAns3());
                    pojo.setThreeAChk(true);
                    pojo.setOpt3checked(prakruti.isOpt3Checked());
                }
                
                if(prakruti.getAns3b()!=null)
                {
                    pojo.setThreeB(prakruti.getAns3b());
                    pojo.setThreeBChk(true);
                    pojo.setOpt3checked(prakruti.isOpt3Checked());
                }
                
                if(prakruti.getAns3c()!=null)
                {
                    pojo.setThreeC(prakruti.getAns3c());
                    pojo.setThreeCChk(true);
                    pojo.setOpt3checked(prakruti.isOpt3Checked());
                }
                
                prakrutiSet.add(pojo);
            }
            
            if(!prakrutiSet.isEmpty())
            {
                p.setPrakrutiNidaans(prakrutiSet);
            }
        }
    }

    private void prepareLifeStyle(UserInfo inputUser, Pi p) {
        LifestyleBean input = inputUser.getLife();
        if(input!=null)
        {
            LifeStyle ls = new LifeStyle(p);
            ls.setEmail(p.getEmail());

            ls.setAfternoonSleep(new Integer(input.getAfternoonSleepPerWeek()).shortValue());
            ls.setLateNights(new Integer(input.getLateNightsPerWeek()).shortValue());
            
            ls.setSleepTime(new Double(input.getSleepTime()));
            ls.setWakeupTime(new Double(input.getWakeupTime()));
            
            p.setLifeStyle(ls);
        }
    }

    private static final String FATHER="FATHER";
    private static final String BROTHER="BROTHER";
    private static final String SON="SON";
    private static final String HUSBAND="HUSBAND";
    
    private static final String MALE="MALE";
    private static final String FEMALE="FEMALE";
    
    private void prepareFamilyRelations(UserInfo inputUser, Pi p) {
        
        ///////////////////////////////////////////////////////////FATHER,MOTHER,Sister,Brother/////////////////////////////////////////////////////////////////////
        List<FamilyEducation> fmList = inputUser.getFamilyEducationList();
        
        Set<FamilyRelations> fmSet = new HashSet<FamilyRelations>(0);
        
        FamilyRelations pojo = null;
        FamilyRelationsId id = null;
            
        
        if(fmList!=null && !fmList.isEmpty())
        {
            for(FamilyEducation member :  fmList)
            {
                id = new FamilyRelationsId(p.getEmail(),member.getFamilyMember(),member.getName());
                pojo = new FamilyRelations(id, p);
                
                if((member.getFamilyMember()!=null) && (member.getFamilyMember().equalsIgnoreCase(FATHER)
                        || member.getFamilyMember().equalsIgnoreCase(BROTHER) || member.getFamilyMember().equalsIgnoreCase(SON)
                        || member.getFamilyMember().equalsIgnoreCase(HUSBAND)))
                {
                    pojo.setGender(MALE);
                }
                else
                {
                    pojo.setGender(FEMALE);
                }
                
                pojo.setQual(member.getHighestQualification());
                pojo.setProfession(member.getProfession());
                pojo.setIncome(member.getIncome());
                pojo.setIsdeceased(member.isIsDeceased());
                
                fmSet.add(pojo);
            }
        }
            
            ///////////////////////////////////////////////////////////SPOUSE/////////////////////////////////////////////////////////////////////
            
            FamilyEducation spouse = inputUser.getSpouse();
            if(spouse!=null)
            {
                id = new FamilyRelationsId(p.getEmail(),spouse.getFamilyMember(),spouse.getName());
                pojo = new FamilyRelations(id, p);
                
                if((spouse.getFamilyMember()!=null) && (spouse.getFamilyMember().equalsIgnoreCase(FATHER)
                        || spouse.getFamilyMember().equalsIgnoreCase(BROTHER) || spouse.getFamilyMember().equalsIgnoreCase(SON)
                        || spouse.getFamilyMember().equalsIgnoreCase(HUSBAND)))
                {
                    pojo.setGender(MALE);
                }
                else
                {
                    pojo.setGender(FEMALE);
                }
                
                pojo.setQual(spouse.getHighestQualification());
                pojo.setProfession(spouse.getProfession());
                pojo.setIncome(spouse.getIncome());
                pojo.setIsdeceased(spouse.isIsDeceased());
                
                fmSet.add(pojo);
                
            }
            
            ///////////////////////////////////////////////////////////children/////////////////////////////////////////////////////////////////////
            
        List<FamilyEducation> childList = inputUser.getChildrenList();
        
        if(childList!=null && !childList.isEmpty())
        {
            for(FamilyEducation child :  childList)
            {
                id = new FamilyRelationsId(p.getEmail(),child.getFamilyMember(),child.getName());
                pojo = new FamilyRelations(id, p);
                
                if((child.getFamilyMember()!=null) && (child.getFamilyMember().equalsIgnoreCase(FATHER)
                        || child.getFamilyMember().equalsIgnoreCase(BROTHER) || child.getFamilyMember().equalsIgnoreCase(SON)
                        || child.getFamilyMember().equalsIgnoreCase(HUSBAND)))
                {
                    pojo.setGender(MALE);
                }
                else
                {
                    pojo.setGender(FEMALE);
                }
                
                pojo.setQual(child.getHighestQualification());
                pojo.setProfession(child.getProfession());
                pojo.setIncome(child.getIncome());
                pojo.setIsdeceased(child.isIsDeceased());
                
                fmSet.add(pojo);
            }
            
            

            
        }
        
        if(!fmSet.isEmpty())
            {
                p.setFamilyRelationses(fmSet);
            }
    }
}
