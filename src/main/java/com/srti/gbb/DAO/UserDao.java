/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srti.gbb.DAO;

import com.srti.gbb.entity.Pi;



/**
 *
 * @author suyogn
 */
public interface UserDao {
//    public List<DictWordDetailsBean> getDictWordList(JSONObject inputRequest) throws JSONException;    
//    public List<DictWordDetailsBean> searchWordList(JSONObject inputRequest) throws JSONException;    
    public void saveNewWordDetails(Pi p) throws Exception;
//    public List<DictWordDetailsBean> getWordOfTheDay(JSONObject inputRequest);
}
