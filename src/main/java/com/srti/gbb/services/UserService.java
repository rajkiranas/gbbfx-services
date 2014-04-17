/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srti.gbb.services;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.srti.gbb.DAO.UserDao;
import com.srti.gbb.bean.AddressBean;
import com.srti.gbb.bean.GynecBean;
import com.srti.gbb.bean.IllnessBean;
import com.srti.gbb.bean.PersonalInformationBean;
import com.srti.gbb.bean.PhysicalParameters;
import com.srti.gbb.bean.UserInfo;
import com.srti.gbb.entity.Address;
import com.srti.gbb.entity.DictList;
import com.srti.gbb.entity.Illness;
import com.srti.gbb.entity.IllnessId;
import com.srti.gbb.entity.Incidences;
import com.srti.gbb.entity.IncidencesId;
import com.srti.gbb.entity.Menses;
import com.srti.gbb.entity.PhysicalParams;
import com.srti.gbb.entity.Pi;
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
        
        UserInfo inputUser = new Gson().fromJson(inputRequest.getString(GlobalConstants.userInfoObject), objType);
        
        p=new Pi();
        
        preparePersonalInfo(inputUser,p);
        prepareIncidences(inputUser,p);
        prepareAddress(inputUser,p);
        prepareIllness(inputUser,p);
        prepareMenses(inputUser,p);
        preparePhysicalParams(inputUser,p);
        
        
        
        DictList word = new DictList();
        
        word.setWord(inputRequest.getString("word"));
        word.setMeaning(inputRequest.getString("meaning"));
        word.setLabels(inputRequest.getString("labels"));
        word.setAddDate(new Date());
        word.setOwnerUsername(inputRequest.getString("owner_username"));
        word.setOwnerName(inputRequest.getString("owner_name"));

        userDao.saveNewWordDetails(word);
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
            Address add = new Address(p);
            
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
            PhysicalParams phy = new PhysicalParams(p);
            
            phy.setEmail(p.getEmail());
            phy.setBp(new Double(input.getBp()));
            phy.setConstipationPerWeek(new Integer(input.getConstipationsPerWeek()).shortValue());
            phy.setHaemoglobin(new Double(input.getHaemoglobin()));
            //phy.setHeightCm(new Double(input.get));
            phy.setHeightFeets(new Double(input.getFeets()));
            phy.setHeightInches(new Double(input.getInches()));
            phy.setHip(new Double(input.getHip()));
            phy.setLooseMoPerWeek(new Integer(input.getLooseMotionsPerWeek()).shortValue());
            phy.setPi(p);
            phy.setToeTouching(input.getToeTouching());
            phy.setToeTouchingCm(new Double(input.getToeTouchingCm()));
            phy.setWaist(new Double(input.getWaist()));
            phy.setWeight(new Double(input.getWeight()));
            
            p.setPhysicalParams(phy);
        }
    }
}
