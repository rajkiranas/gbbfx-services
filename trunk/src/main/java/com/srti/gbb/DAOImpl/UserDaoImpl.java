/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.srti.gbb.DAOImpl;

import com.srti.gbb.DAO.UserDao;

import com.srti.gbb.entity.Pi;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author kishorp
 */

@Repository("userDao")
@Transactional
public class UserDaoImpl implements UserDao {

    //private static String getAllMsgQry = "from Ssconversation as model where model.messagestatus not in(" + GlobalConstants.DELETED_FROM_INBOX + ") and (model.msgto = ? or model.msgfrom = ?)  order by model.messageid desc";
    private HibernateTemplate hibernateTemplate;
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) 
    {
        hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

//    @Override
//    public List<DictWordDetailsBean> getDictWordList(JSONObject inputRequest) throws JSONException {
//        DetachedCriteria criteria = DetachedCriteria.forClass(DictList.class);
////        criteria.add(Restrictions.eq("std.std",std));
////        criteria.add(Restrictions.or(Restrictions.eq("fordiv", fordiv),Restrictions.eq("fordiv", null)));
//        ProjectionList pl = Projections.projectionList();
//        pl.add(Projections.property("word"), "word");
//        pl.add(Projections.property("meaning"), "meaning");
//        pl.add(Projections.property("labels"), "labels");
//        pl.add(Projections.property("addDate"), "addDate");
//        pl.add(Projections.property("ownerUsername"), "ownerUsername");
//        pl.add(Projections.property("ownerName"), "ownerName");
//        
//        criteria.addOrder(Order.asc("word"));
//        
//        criteria.setProjection(pl);
//        criteria.setResultTransformer(Transformers.aliasToBean(DictWordDetailsBean.class));
//        //return hibernateTemplate.findByCriteria(criteria);
//        //System.out.println("inputRequest.getInt(*********)="+inputRequest.getInt("fetchResultsFrom"));
//        return hibernateTemplate.findByCriteria(criteria,inputRequest.getInt("fetchResultsFrom"),Integer.parseInt(GlobalConstants.getProperty(GlobalConstants.DICT_FETCH_SIZE)));
//    }

    @Override
    public void saveNewWordDetails(Pi p) throws Exception {
        hibernateTemplate.saveOrUpdate(p);
    }

//    @Override
//    public List<DictWordDetailsBean> searchWordList(JSONObject inputRequest) throws JSONException 
//    {
//           DetachedCriteria criteria = DetachedCriteria.forClass(DictList.class,"dictionary");
//           
//        ProjectionList pl = Projections.projectionList();
//        pl.add(Projections.property("word"), "word");
//        pl.add(Projections.property("meaning"), "meaning");
//        pl.add(Projections.property("labels"), "labels");
//        pl.add(Projections.property("addDate"), "addDate");
//        pl.add(Projections.property("ownerUsername"), "ownerUsername");
//        pl.add(Projections.property("ownerName"), "ownerName");
//        
//        if(inputRequest.getString("searchFor").equals("Word"))
//           {
//               criteria.add(Restrictions.ilike("dictionary.word",inputRequest.getString("searchWord"),MatchMode.ANYWHERE));
//           }
//           else
//           {
//               criteria.add(Restrictions.ilike("dictionary.labels",inputRequest.getString("searchWord"),MatchMode.ANYWHERE));
//           }
//        
//        criteria.addOrder(Order.asc("word"));
//        
//        criteria.setProjection(pl);
//        criteria.setResultTransformer(Transformers.aliasToBean(DictWordDetailsBean.class));
//        return hibernateTemplate.findByCriteria(criteria);
//        //System.out.println("inputRequest.getInt(*********)="+inputRequest.getInt("fetchResultsFrom"));
//        //return hibernateTemplate.findByCriteria(criteria,inputRequest.getInt("fetchResultsFrom"),Integer.parseInt(GlobalConstants.getProperty(GlobalConstants.DICT_FETCH_SIZE)));
//    }
//
//    @Override
//    public List<DictWordDetailsBean> getWordOfTheDay(JSONObject inputRequest) {
//        DetachedCriteria criteria = DetachedCriteria.forClass(DictList.class);
//        ProjectionList pl = Projections.projectionList();
//        pl.add(Projections.property("word"), "word");
//        pl.add(Projections.property("meaning"), "meaning");
//        pl.add(Projections.property("labels"), "labels");
//        criteria.add(Restrictions.sqlRestriction("1=1 order by random()"));
//        criteria.setResultTransformer(Transformers.aliasToBean(DictWordDetailsBean.class));
//        criteria.setProjection(pl);
//        hibernateTemplate.setFetchSize(1);
//        List<Object> list = hibernateTemplate.findByCriteria(criteria);
//        Object obj[] = (Object[]) list.get(0);
//        List<DictWordDetailsBean> abcList = new ArrayList<DictWordDetailsBean>();
//        DictWordDetailsBean wordOfTheDayBean = new DictWordDetailsBean();
//        wordOfTheDayBean.setWord((String)obj[0]);
//        wordOfTheDayBean.setMeaning((String)obj[1]);
//        wordOfTheDayBean.setLabels((String)obj[2]);
//        abcList.add(wordOfTheDayBean);
//        return abcList;
//    }
}