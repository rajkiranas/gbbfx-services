/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srti.gbb.resource;

import com.srti.gbb.global.GlobalConstants;
import com.srti.gbb.services.UserService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Rajkiran Sonde
 */
@Component
@Path(GlobalConstants.UserResource)
public class UserResource {
    
    private static final String saveUserDetails="saveUserDetails";
    private static final String handshake="handshake";
    
    @Autowired
    private  UserService userService;
    
    @GET
    @Path(handshake)    
    @Produces(MediaType.APPLICATION_JSON)
    public JSONObject defaultM() throws JSONException 
    {
        System.out.println("#####towards service - handshake*****");
        JSONObject response = new JSONObject();
        try 
        {
            response.put(GlobalConstants.STATUS, "Handshake-Success");
            
        } catch (Exception e) 
        {
            e.printStackTrace();
            response.put(GlobalConstants.STATUS, "Handshake-Failed");
        }
        
        return response;
    }
    
    @Path(saveUserDetails)
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public JSONObject saveUserDetails(JSONObject inputRequest) throws JSONException 
    {
        System.out.println("#####towards service *****="+inputRequest);
        JSONObject response = new JSONObject();
        try 
        {
            userService.saveUserDetails(inputRequest);
            response.put(GlobalConstants.STATUS, "Successfully saved user info");
            
        } catch (Exception e) 
        {
            e.printStackTrace();
            response.put(GlobalConstants.STATUS, "Could not save user info");
        }
        
        return response;
    }
    
    
//    @Path(getDictWordList)
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public JSONObject getDictWordList(JSONObject inputRequest) throws JSONException {
//
//        List<DictWordDetailsBean> eventDetailsList = dictService.getDictWordList(inputRequest);
//        
//        Gson gson=  new GsonBuilder().setDateFormat(GlobalConstants.gsonTimeFormat).create();       
//        String examListJson = gson.toJson(eventDetailsList);  
//        
//        JSONObject response = new JSONObject();
//        response.put(GlobalConstants.dictWordList, examListJson);     
//        return response;
//    }
    
}